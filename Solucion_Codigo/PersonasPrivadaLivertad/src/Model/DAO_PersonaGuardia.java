package Model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class DAO_PersonaGuardia {
    public static void crearTabla() {
        String sql = "CREATE TABLE IF NOT EXISTS H2_PersonaGuardia ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "especialidad TEXT NOT NULL, "
                + "departamento TEXT NOT NULL, "
                + "contrasena TEXT NOT NULL, "
                + "numIdentificacion INTEGER NOT NULL, "
                + "nombre TEXT NOT NULL, "
                + "nacionalidad TEXT NOT NULL, "
                + "genero TEXT NOT NULL, "
                + "edad INTEGER NOT NULL"
                + ");";

        try (Connection conn =  DAO_DatabaseConnector.connectGuardia();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
