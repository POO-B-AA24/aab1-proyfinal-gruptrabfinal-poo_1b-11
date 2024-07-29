package Controller;
import Model.H1_T_Agravante;
import Model.DAO_DatabaseConnector;
import Model.H1_T_Delito;
import Model.H1_PersonaPrivadaLibertad;
import Model.H3_TH1_PersonaVisita;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProcesarPPL {
    public static void insertarPersonaPrivadaLibertad(H1_PersonaPrivadaLibertad persona) {
    String sqlPersona = "INSERT INTO PersonaPrivadaLibertad(diasVPermitidos, numeroActualVisitas, fechaIngreso, nombre, nacionalidad, genero, edad) VALUES(?, ?, ?, ?, ?, ?, ?)";
    
    try (Connection conn = DAO_DatabaseConnector.connectPPL();
         PreparedStatement pstmtPersona = conn.prepareStatement(sqlPersona, Statement.RETURN_GENERATED_KEYS)) {
        
        pstmtPersona.setInt(1, persona.getDiasVPermitidos());
        pstmtPersona.setInt(2, persona.getNumeroActualVisitas());
        pstmtPersona.setString(3, persona.getFechaIngreso());
        pstmtPersona.setString(4, persona.getNombre());
        pstmtPersona.setString(5, persona.getNacionalidad());
        pstmtPersona.setString(6, persona.getGenero());
        pstmtPersona.setInt(7, persona.getEdad());

        int affectedRows = pstmtPersona.executeUpdate();

        if (affectedRows == 0) {
            throw new SQLException("fallo al crear");
        }

        try (ResultSet generatedKeys = pstmtPersona.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                int personaId = generatedKeys.getInt(1);

                // Insertar los delitos
                insertarDelitos(personaId, persona.getDelitos());

                // Insertar los agravantes
                insertarAgravantes(personaId, persona.getAgravantes());

                // Insertar las visitas
                insertarVisitas(personaId, persona.getVisitas());
            } else {
                throw new SQLException("faloo crear no id");
            }
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}

private static void insertarVisitas(int personaId, ArrayList<H3_TH1_PersonaVisita> visitas) throws SQLException {
    String sqlVisita = "INSERT INTO PersonaVisita(personaId, relacionConPPL, telefono, direccion, identificacion, nombre, nacionalidad, genero, edad) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
    try (Connection conn = DAO_DatabaseConnector.connectPPL();
         PreparedStatement pstmtVisita = conn.prepareStatement(sqlVisita)) {
        for (H3_TH1_PersonaVisita visita : visitas) {
            pstmtVisita.setInt(1, personaId);
            pstmtVisita.setString(2, visita.getRelacionConPPL());
            pstmtVisita.setString(3, visita.getTelefono());
            pstmtVisita.setString(4, visita.getDireccion());
            pstmtVisita.setString(5, visita.getIdentificacion());
            pstmtVisita.setString(6, visita.getNombre());
            pstmtVisita.setString(7, visita.getNacionalidad());
            pstmtVisita.setString(8, visita.getGenero());
            pstmtVisita.setInt(9, visita.getEdad());
            pstmtVisita.executeUpdate();
        }
    }
}

private static void insertarDelitos(int personaId, ArrayList<H1_T_Delito> delitos) throws SQLException {
        String sqlDelito = "INSERT INTO Delito(personaId, tipoDelito, gravedad, descripcion) VALUES(?, ?, ?, ?)";
        try (Connection conn = DAO_DatabaseConnector.connectPPL();
             PreparedStatement pstmtDelito = conn.prepareStatement(sqlDelito)) {
            for (H1_T_Delito delito : delitos) {
                pstmtDelito.setInt(1, personaId);
                pstmtDelito.setString(2, delito.getTipoDelito());
                pstmtDelito.setString(3, delito.getGravedad());
                pstmtDelito.setString(4, delito.getDescripcion());
                pstmtDelito.executeUpdate();
            }
        }
    }

    public static void insertarAgravantes(int personaId, ArrayList<H1_T_Agravante> agravantes) throws SQLException {
        String sqlAgravante = "INSERT INTO Agravante(personaId, descripcion) VALUES(?, ?)";
        try (Connection conn = DAO_DatabaseConnector.connectPPL();
             PreparedStatement pstmtAgravante = conn.prepareStatement(sqlAgravante)) {
            for (H1_T_Agravante agravante : agravantes) {
                pstmtAgravante.setInt(1, personaId);
                pstmtAgravante.setString(2, agravante.getDescripcion());
                pstmtAgravante.executeUpdate();
            }
        }
    }
    public static List<H1_PersonaPrivadaLibertad> obtenerPersonasPrivadasLibertad() {
    String sqlPersona = "SELECT * FROM PersonaPrivadaLibertad";
    List<H1_PersonaPrivadaLibertad> personas = new ArrayList<>();

    try (Connection conn = DAO_DatabaseConnector.connectPPL();
         Statement stmt = conn.createStatement();
         ResultSet rsPersona = stmt.executeQuery(sqlPersona)) {

        while (rsPersona.next()) {
            int id = rsPersona.getInt("id");
            int diasVPermitidos = rsPersona.getInt("diasVPermitidos");
            int numeroActualVisitas = rsPersona.getInt("numeroActualVisitas");
            String fechaIngreso = rsPersona.getString("fechaIngreso");
            String nombre = rsPersona.getString("nombre");
            String nacionalidad = rsPersona.getString("nacionalidad");
            String genero = rsPersona.getString("genero");
            int edad = rsPersona.getInt("edad");

            H1_PersonaPrivadaLibertad persona = new H1_PersonaPrivadaLibertad(
                diasVPermitidos, numeroActualVisitas, fechaIngreso, nombre, nacionalidad, genero, edad);

            // Obtener delitos y agravantes
            persona.setDelitos(obtenerDelitos(id));
            persona.setAgravantes(obtenerAgravantes(id));

            // Obtener visitas
            persona.setVisitas(obtenerVisitas(id));

            personas.add(persona);
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }

    return personas;
}
public static ArrayList<H1_T_Delito> obtenerDelitos(int personaId) {
        String sqlDelito = "SELECT tipoDelito, gravedad, descripcion FROM Delito WHERE personaId = ?";
        ArrayList<H1_T_Delito> delitos = new ArrayList<>();

        try (Connection conn = DAO_DatabaseConnector.connectPPL();
             PreparedStatement pstmtDelito = conn.prepareStatement(sqlDelito)) {
            pstmtDelito.setInt(1, personaId);
            try (ResultSet rsDelito = pstmtDelito.executeQuery()) {
                while (rsDelito.next()) {
                    String tipoDelito = rsDelito.getString("tipoDelito");
                    String gravedad = rsDelito.getString("gravedad");
                    String descripcion = rsDelito.getString("descripcion");
                    delitos.add(new H1_T_Delito(tipoDelito, gravedad, descripcion));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return delitos;
    }

    public static ArrayList<H1_T_Agravante> obtenerAgravantes(int personaId) {
        String sqlAgravante = "SELECT descripcion FROM Agravante WHERE personaId = ?";
        ArrayList<H1_T_Agravante> agravantes = new ArrayList<>();

        try (Connection conn = DAO_DatabaseConnector.connectPPL();
             PreparedStatement pstmtAgravante = conn.prepareStatement(sqlAgravante)) {
            pstmtAgravante.setInt(1, personaId);
            try (ResultSet rsAgravante = pstmtAgravante.executeQuery()) {
                while (rsAgravante.next()) {
                    agravantes.add(new H1_T_Agravante(rsAgravante.getString("descripcion")));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return agravantes;
    }
public static ArrayList<H3_TH1_PersonaVisita> obtenerVisitas(int personaId) {
    String sqlVisita = "SELECT relacionConPPL, telefono, direccion, identificacion, nombre, nacionalidad, genero, edad FROM PersonaVisita WHERE personaId = ?";
    ArrayList<H3_TH1_PersonaVisita> visitas = new ArrayList<>();

    try (Connection conn = DAO_DatabaseConnector.connectPPL();
         PreparedStatement pstmtVisita = conn.prepareStatement(sqlVisita)) {
        pstmtVisita.setInt(1, personaId);
        try (ResultSet rsVisita = pstmtVisita.executeQuery()) {
            while (rsVisita.next()) {
                String relacionConPPL = rsVisita.getString("relacionConPPL");
                String telefono = rsVisita.getString("telefono");
                String direccion = rsVisita.getString("direccion");
                String identificacion = rsVisita.getString("identificacion");
                String nombre = rsVisita.getString("nombre");
                String nacionalidad = rsVisita.getString("nacionalidad");
                String genero = rsVisita.getString("genero");
                int edad = rsVisita.getInt("edad");

                visitas.add(new H3_TH1_PersonaVisita(relacionConPPL, telefono, direccion, identificacion, nombre, nacionalidad, genero, edad));
            }
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    return visitas;
}

}

    


