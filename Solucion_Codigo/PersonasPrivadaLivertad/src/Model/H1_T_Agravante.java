package Model;
public class H1_T_Agravante  {
    private String descripcion;
    public H1_T_Agravante(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }
    @Override
    public String toString() {
        return String.format("\n\nAgravante: \n   descripcion=%s ",this.descripcion);
    }   
}