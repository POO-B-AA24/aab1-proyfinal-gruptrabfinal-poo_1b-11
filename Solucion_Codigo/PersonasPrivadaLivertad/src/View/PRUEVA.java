package View;
import interfas.Pantalla;
import Controller.*;
import Model.*;
import interfas.PantallaPrincipal;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class PRUEVA {

    public static void main(String[] args) {
        PantallaPrincipal panta = new PantallaPrincipal();
        panta.setVisible(true);
        panta.setLocationRelativeTo(null);
        
        
        
         // Crear las tablas en la base de datos: 
        DAO_PersonaPrivadaLibertad.crearTabla();

        // Crear una instancia de PersonaPrivadaLibertad
        H1_PersonaPrivadaLibertad persona = new H1_PersonaPrivadaLibertad(
                10, 2, "2023-07-01", "Juan Perez", "Mexicana", "Masculino", 30);

        // Agregar algunos delitos y agravantes
        persona.agregarDelito(new H1_T_Delito("Robo", "Alta", "Robo a mano armada"));
        persona.agregarDelito(new H1_T_Delito("Fraude", "Media", "Fraude bancario"));
        persona.agregarVisita(new H3_TH1_PersonaVisita("sa","as","asd","ASd","saf","sfa","f",8));
        persona.agregarAgravante(new H1_T_Agravante("Reincidencia"));

        // Insertar la persona en la base de datos
        
        ProcesarPPL.insertarPersonaPrivadaLibertad(persona);

        // Obtener todas las personas privadas de libertad de la base de datos
        List<H1_PersonaPrivadaLibertad> personas = ProcesarPPL.obtenerPersonasPrivadasLibertad();
        for (H1_PersonaPrivadaLibertad p : personas) {
            System.out.println(p);
        }
        
        
        
        //Crear la tabla
        DAO_PersonaGuardia.crearTabla();

        // Crear una instancia de H2_PersonaGuardia
        H2_PersonaGuardia guardia = new H2_PersonaGuardia("Seguridad", "Departamento A", "contrasena123", 123456, "Juan Perez", "Colombiano", "Masculino", 30);

        // Insertar la instancia en la base de datos
        ProcesarGuardia.insertarPersonaGuardia(guardia);

        // Obtener y mostrar las personas guardia
        List<H2_PersonaGuardia> personasGuardia = ProcesarGuardia.obtenerPersonasGuardia();
        for (H2_PersonaGuardia p : personasGuardia) {
            System.out.println(p);
        }
    }
        
    }
