package Controller;

import Model.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProcesarGuardia {
    
    public static void insertarPersonaGuardia(H2_PersonaGuardia guardia) {
        String sql = "INSERT INTO H2_PersonaGuardia(especialidad, departamento, contrasena, numIdentificacion, nombre, nacionalidad, genero, edad) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DAO_DatabaseConnector.connectGuardia();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, guardia.getEspecialidad());
            pstmt.setString(2, guardia.getDepartamento());
            pstmt.setString(3, guardia.getContrasena());
            pstmt.setInt(4, guardia.getNumIdentificacion());
            pstmt.setString(5, guardia.getNombre());
            pstmt.setString(6, guardia.getNacionalidad());
            pstmt.setString(7, guardia.getGenero());
            pstmt.setInt(8, guardia.getEdad());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<H2_PersonaGuardia> obtenerPersonasGuardia() {
        String sql = "SELECT * FROM H2_PersonaGuardia";
        List<H2_PersonaGuardia> personasGuardia = new ArrayList<>();

        try (Connection conn = DAO_DatabaseConnector.connectGuardia();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                String especialidad = rs.getString("especialidad");
                String departamento = rs.getString("departamento");
                String contrasena = rs.getString("contrasena");
                int numIdentificacion = rs.getInt("numIdentificacion");
                String nombre = rs.getString("nombre");
                String nacionalidad = rs.getString("nacionalidad");
                String genero = rs.getString("genero");
                int edad = rs.getInt("edad");

                H2_PersonaGuardia guardia = new H2_PersonaGuardia(especialidad, departamento, contrasena, numIdentificacion, nombre, nacionalidad, genero, edad);
                personasGuardia.add(guardia);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return personasGuardia;
    }
}
