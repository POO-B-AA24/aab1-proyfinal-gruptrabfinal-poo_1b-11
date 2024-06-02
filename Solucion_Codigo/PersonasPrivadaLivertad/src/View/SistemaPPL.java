package View;
import Controller.*;
import Model.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class SistemaPPL {

    public static void main(String[] args) {
        //variables principales
        Scanner entrada =new Scanner(System.in);
        String archivoData = "archivo.data";
        LecturaPPL leer=new LecturaPPL(archivoData);
        ArrayList<PersonaPrivadaLibertad> objetosLeidos;
        ArrayList<PersonaPrivadaLibertad> listPPL= new ArrayList<>();
        EscrituraPPL escribir = new EscrituraPPL(archivoData,listPPL);
        Delito delito;
        PersonaPrivadaLibertad ppl;
        Agravante listAgravante;
        //variables delito
        String tipoDelito,gravedad,descripcion;
        char salird='[',salira='[';
        //variables PPL
        String nombre;
        int edad,diasMaximosVisitas,numeroActualVisitas;
        Date fechaIngreso;
        //variables agravantes
        String agravantes;
        // INICIO
        int cont=3;
        while((cont!=0 )&& (salird !='s')){
            System.out.println("escriba la contrasena");
            String contrasena=entrada.next();
            if(contrasena.equals("123456789")){
                while(salird !='s'){
                System.out.println(" (1) cargar databse de prueva\n (2) crear nueva base de datos\n (3) agregar PPL\n (4) imprimir listPPL\n "
                        + "(5) eliminar PPL \n (7) salir");
                int opc=entrada.nextInt();
                switch(opc){
                    case 1:
                        System.out.println("");
                        System.out.println("cargar base de datos de pureva");
                        // Crear  objetos Delito
                         Delito delito1 = new Delito("Robo", "Menor", "Robo de objetos de valor");
                         Delito delito2 = new Delito("Asalto", "Grave", "Asalto a mano armada");
                         Delito delito3 = new Delito("Fraude", "Moderado", "Fraude financiero");

                         // Crear objetos PersonaPrivadaLibertad
                         PersonaPrivadaLibertad persona1 = new PersonaPrivadaLibertad("Juan", 25, 7, 0, new Date());
                         persona1.agregarDelito(delito1);
                         persona1.agregarDelito(delito2);
                         persona1.agregarAgravante(new Agravante("Agravante 1"));
                         persona1.agregarAgravante(new Agravante("Agravante 2"));

                         PersonaPrivadaLibertad persona2 = new PersonaPrivadaLibertad("Ana", 30, 5, 2, new Date());
                         persona2.agregarDelito(delito2);
                         persona2.agregarDelito(delito3);
                         persona2.agregarAgravante(new Agravante("Agravante 3"));

                         PersonaPrivadaLibertad persona3 = new PersonaPrivadaLibertad("Luis", 22, 10, 4, new Date());
                         persona3.agregarDelito(delito3);
                         persona3.agregarDelito(new Delito("Homicidio", "Grave", "Asesinato")); // Agregar un tercer delito
                         persona3.agregarAgravante(new Agravante("Agravante 4"));

                         // Crear ArrayList de objetos PersonaPrivadaLibertad
                         listPPL.add(persona1);
                         listPPL.add(persona2);
                         listPPL.add(persona3);

                         // Escribir los objetos en el archivo              
                         escribir.escribirListPPL();
                         // Leer los objetos desde el archivo          
                         objetosLeidos = leer.leerObjetos();
                         // Imprimir los objetos leídos 
                         for (PersonaPrivadaLibertad persona : objetosLeidos) {
                             System.out.println(persona);
                         }
                    break;

                    case 2:
                        escribir = new EscrituraPPL(archivoData,listPPL);
                        escribir.escribirListPPL();
                        System.out.println("archivodata en blanco");
                    break;
                    case 3:
                        System.out.println("Persona privada de libertad");
                        System.out.print(" nombre: ");
                        nombre=entrada.next();
                        System.out.print(" edad: ");
                        edad=entrada.nextInt();
                        System.out.print(" diasMaximosVisitas: ");
                        diasMaximosVisitas=entrada.nextInt();
                        System.out.print(" numeroActualVisitas: ");
                        numeroActualVisitas=entrada.nextInt();

                        ppl = new PersonaPrivadaLibertad(nombre, edad, diasMaximosVisitas, numeroActualVisitas, new Date());
                        System.out.println("lista de delitos");
                        while(salird !='x'){
                            System.out.println("Delito");
                            System.out.print(" tipo: ");
                            tipoDelito=entrada.next();
                            System.out.print(" gravedad: ");
                            gravedad=entrada.next();
                            System.out.print(" descripcion:");
                            descripcion=entrada.next();
                            delito = new Delito(tipoDelito, gravedad, descripcion);
                            ppl.agregarDelito(delito);
                            System.out.println(" salir = x");
                            salird=entrada.next().charAt(0);
                        }
                        System.out.println("lista de agravantes");
                        while(salira !='x'){
                            System.out.print(" Agravante:");
                            agravantes=entrada.next();
                            listAgravante = new Agravante(agravantes);
                            ppl.agregarAgravante(listAgravante);
                            System.out.println(" salir = x");
                            salira=entrada.next().charAt(0);
                        }
                        listPPL.add(ppl);
                        ppl.CalcularDMV();
                        escribir.escribirListPPL();
                    break;
                    case 4:
                        objetosLeidos = leer.leerObjetos();
                         // Imprimir los objetos leídos 
                        for (PersonaPrivadaLibertad persona : objetosLeidos) {
                             System.out.println(persona);
                             System.out.println("");
                        }
                    break;
                    case 5:
                        // Eliminar una persona de la lista
                         System.out.println("escribir la posision de la PPL a elinar empieza de 0");
                         escribir.setIdx(entrada.nextInt());
                         escribir.eliminarPPL();
                         objetosLeidos = leer.leerObjetos();
                         // Imprimir la lista actualizada
                         System.out.println("Lista actualizada:");
                         for (PersonaPrivadaLibertad persona : objetosLeidos) {
                             System.out.println(persona);
                        }
                    break;
                    case 7:
                        salird='s';
                    break;
                    default:
                        System.out.println(" inserte una opcion dentro de los parametros");
                    break;
                }
            }
        }else{
            cont--;
            System.out.println(" quedan "+cont+" intentos \n");
        }  
    }
        
        
        
        
        
        
    }
    
}

