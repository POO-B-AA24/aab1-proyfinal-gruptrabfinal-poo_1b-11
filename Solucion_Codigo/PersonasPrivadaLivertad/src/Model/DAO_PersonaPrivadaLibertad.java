package Model;
import java.sql.*;
public class DAO_PersonaPrivadaLibertad {
      public static void crearTabla() {
        String sqlPersona = "CREATE TABLE IF NOT EXISTS PersonaPrivadaLibertad ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "diasVPermitidos INTEGER, "
                + "numeroActualVisitas INTEGER, "
                + "fechaIngreso TEXT, "
                + "nombre TEXT, "
                + "nacionalidad TEXT, "
                + "genero TEXT, "
                + "edad INTEGER"
                + ");";

        String sqlDelito = "CREATE TABLE IF NOT EXISTS Delito ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "personaId INTEGER NOT NULL, "
                + "tipoDelito TEXT NOT NULL, "
                + "gravedad TEXT NOT NULL, "
                + "descripcion TEXT NOT NULL, "
                + "FOREIGN KEY (personaId) REFERENCES PersonaPrivadaLibertad(id)"
                + ");";

        String sqlAgravante = "CREATE TABLE IF NOT EXISTS Agravante ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "personaId INTEGER NOT NULL, "
                + "descripcion TEXT NOT NULL, "
                + "FOREIGN KEY (personaId) REFERENCES PersonaPrivadaLibertad(id)"
                + ");";
        
        String sqlVisita = "CREATE TABLE IF NOT EXISTS PersonaVisita ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "personaId INTEGER NOT NULL, "
                + "relacionConPPL TEXT NOT NULL, "
                + "telefono TEXT NOT NULL, "
                + "direccion TEXT NOT NULL, "
                + "identificacion TEXT NOT NULL, "
                + "nombre TEXT NOT NULL, "
                + "nacionalidad TEXT NOT NULL, "
                + "genero TEXT NOT NULL, "
                + "edad INTEGER NOT NULL, "
                + "FOREIGN KEY (personaId) REFERENCES PersonaPrivadaLibertad(id)"
                + ");";

        try (Connection conn = DAO_DatabaseConnector.connectPPL();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sqlPersona);
            stmt.execute(sqlDelito);
            stmt.execute(sqlAgravante);
            stmt.execute(sqlVisita);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

