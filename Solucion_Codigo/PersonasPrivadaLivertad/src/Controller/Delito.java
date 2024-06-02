package Controller;

import java.io.Serializable;

public class Delito implements Serializable {
    

    private String tipoDelito;
    private String gravedad;
    private String descripcion;

    public Delito(String tipoDelito, String gravedad, String descripcion) {
        this.tipoDelito = tipoDelito;
        this.gravedad = gravedad;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return String.format("\n\nDelito: \n   tipoDelito=%s \n   gravedad=%s \n   descripcion=%s)",
        tipoDelito, gravedad, descripcion);
    }
}
