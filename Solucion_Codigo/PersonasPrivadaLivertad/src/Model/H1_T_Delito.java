package Model;
public class H1_T_Delito  {
    private String tipoDelito;
    private String gravedad;
    private String descripcion;
    public H1_T_Delito(String tipoDelito, String gravedad, String descripcion) {
        this.tipoDelito = tipoDelito;
        this.gravedad = gravedad;
        this.descripcion = descripcion;
    }
    public String getTipoDelito() {
        return tipoDelito;
    }
    public String getGravedad() {
        return gravedad;
    }
    public String getDescripcion() {
        return descripcion;
    }
    @Override
    public String toString() {
        return String.format("\n\nDelito: \n   tipoDelito=%s \n   gravedad=%s \n   descripcion=%s)",
        tipoDelito, gravedad, descripcion);
    }
}