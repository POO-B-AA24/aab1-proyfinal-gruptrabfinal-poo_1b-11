package Model;
public class H_Persona {
    public String nombre;
    public String nacionalidad;
    public String genero;
    public int edad ;
    public H_Persona(String nombre, String nacionalidad, String genero, int edad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", genero=" + genero + ", edad=" + edad + '}';
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}