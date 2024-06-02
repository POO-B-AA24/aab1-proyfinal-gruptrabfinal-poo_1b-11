package Controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonaPrivadaLibertad implements Serializable {
        private String nombre;
        private int edad;
        private int diasVPermitidos;
        private int numeroActualVisitas;
        private Date fechaIngreso;
        private ArrayList<Delito> delitos;
        private ArrayList<Agravante> agravantes;

        public PersonaPrivadaLibertad(String nombre, int edad, int diasMaximosVisitas, int numeroActualVisitas, Date fechaIngreso) {
            this.nombre = nombre;
            this.edad = edad;
            this.diasVPermitidos = diasMaximosVisitas;
            this.numeroActualVisitas = numeroActualVisitas;
            this.fechaIngreso = fechaIngreso;
            this.delitos = new ArrayList<>();
            this.agravantes = new ArrayList<>();
        }

        public void agregarDelito(Delito delito) {
            delitos.add(delito);
        }

        public void agregarAgravante(Agravante agravante) {
            agravantes.add(agravante);
            // Restar 1 a diasMaximosVisitas por cada agravante agregado
            diasVPermitidos--; 
        }
        public void CalcularDMV() {
            if(diasVPermitidos<=0){
                System.out.println(" el numero maximo de visitas llego a 0  ");
            }
        }

        @Override
        public String toString() {
            return String.format("\n//////////////////////////////////////////////////////\nPersonaPrivadaLibertad:\n nombre=%s \n edad=%d \n diasMaximosVisitas=%d \n numeroActualVisitas=%d \n fechaIngreso=%s \n   delitos=%s \n   agravantes=%s"
                    + "\n//////////////////////////////////////////////////////)", nombre, edad, diasVPermitidos, numeroActualVisitas, fechaIngreso, delitos, agravantes);
        }
    }