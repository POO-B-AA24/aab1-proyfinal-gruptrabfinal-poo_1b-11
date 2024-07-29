package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class DAO_DatabaseConnector {
    private static final String URLPPL = "jdbc:sqlite:personasPrivadasLibertad.db";
    private static final String URLGuardia = "jdbc:sqlite:personaGuardia.db";

    public static Connection connectPPL() throws SQLException {
        return DriverManager.getConnection(URLPPL);
    }
    public static Connection connectGuardia() throws SQLException {
        return DriverManager.getConnection(URLGuardia);
    }
}
