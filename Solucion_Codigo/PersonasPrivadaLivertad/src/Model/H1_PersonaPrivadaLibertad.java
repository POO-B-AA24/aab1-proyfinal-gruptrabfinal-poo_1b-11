package Model;
import java.util.ArrayList;
import java.util.List;
public class H1_PersonaPrivadaLibertad extends H_Persona  {      
    private int diasVPermitidos;
    private int numeroActualVisitas;
    private String fechaIngreso;
    private ArrayList<H1_T_Delito> delitos;
    private ArrayList<H1_T_Agravante> agravantes;
    private ArrayList<H3_TH1_PersonaVisita> visitas;

    public H1_PersonaPrivadaLibertad(int diasVPermitidos, int numeroActualVisitas, String fechaIngreso, String nombre, String nacionalidad, String genero, int edad) {
        super(nombre, nacionalidad, genero, edad);
        this.diasVPermitidos = diasVPermitidos;
        this.numeroActualVisitas = numeroActualVisitas;
        this.fechaIngreso = fechaIngreso;
        this.delitos = new ArrayList<>();
        this.agravantes = new ArrayList<>();
        this.visitas = new ArrayList<>();
    }

    public void agregarDelito(H1_T_Delito delito) {
        delitos.add(delito);
    }

    public void agregarAgravante(H1_T_Agravante agravante) {
        agravantes.add(agravante);
        diasVPermitidos--; 
    }

    public void agregarVisita(H3_TH1_PersonaVisita visita) {
        visitas.add(visita);
    }

    public String CalcularDMV() {
        if(diasVPermitidos <= 0){
            return "El número máximo de visitas llegó a 0";
        }
        return "Aún puede recibir visitas";
    }

    public void setDelitos(ArrayList<H1_T_Delito> delitos) {
        this.delitos = delitos;
    }

    public void setAgravantes(ArrayList<H1_T_Agravante> agravantes) {
        this.agravantes = agravantes;
    }
    public void setVisitas(ArrayList<H3_TH1_PersonaVisita> visitas) {
        this.visitas = visitas;
    }
    public ArrayList<H1_T_Delito> getDelitos() {
        return delitos;
    }
    public ArrayList<H1_T_Agravante> getAgravantes() {
        return agravantes;
    }
    public ArrayList<H3_TH1_PersonaVisita> getVisitas() {
        return visitas;
    }
    public int getDiasVPermitidos() {
        return diasVPermitidos;
    }
    public int getNumeroActualVisitas() {
        return numeroActualVisitas;
    }
    public String getFechaIngreso() {
        return fechaIngreso;
    }
    @Override
    public String toString() {
        return String.format("\n//////////////////////////////////////////////////////\nPersonaPrivadaLibertad:"
                + super.toString()
                + "\n diasVPermitidos=%d "
                + "\n numeroActualVisitas=%d \n fechaIngreso=%s \n   delitos=%s \n   agravantes=%s \n   visitas=%s"
                + "\n//////////////////////////////////////////////////////", 
                diasVPermitidos, numeroActualVisitas, fechaIngreso, delitos, agravantes, visitas);
    }
}