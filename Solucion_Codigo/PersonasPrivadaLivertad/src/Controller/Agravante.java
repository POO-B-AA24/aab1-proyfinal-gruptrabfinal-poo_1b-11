package Controller;
import java.io.Serializable;
public class Agravante implements Serializable {
    private String descripcion;
    public Agravante(String descripcion) {
        this.descripcion = descripcion;
    }
    @Override
    public String toString() {
        return String.format("\n\nAgravante: \n   descripcion=%s ",this.descripcion);
    }
}