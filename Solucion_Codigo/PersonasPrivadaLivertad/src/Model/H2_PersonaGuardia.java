package Model;
public class H2_PersonaGuardia extends H_Persona {
    public String especialidad;
    public String departemento;
    public String contrasena;
    public int numIdentificacion ;
    public H2_PersonaGuardia(String especialidad, String departemento, String contrasena, int numIdentificacion, String nombre, String nacionalidad, String genero, int edad) {
        super(nombre, nacionalidad, genero, edad);
        this.especialidad = especialidad;
        this.departemento = departemento;
        this.contrasena = contrasena;
        this.numIdentificacion = numIdentificacion;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public String getDepartamento() {
        return departemento;
    }
    public String getContrasena() {
        return contrasena;
    }
    public int getNumIdentificacion() {
        return numIdentificacion;
    }
    @Override
    public String toString() {
        return "PersonaGuardia{" +super.toString() +"especialidad=" + especialidad + ", departemento=" + departemento + ", contrasena=" + contrasena + ", numIdentificacion=" + numIdentificacion + '}';
    }

}
