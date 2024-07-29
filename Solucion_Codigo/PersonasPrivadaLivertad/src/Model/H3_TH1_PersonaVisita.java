package Model;
public class H3_TH1_PersonaVisita extends H_Persona {
    public String relacionConPPL;
    public String telefono;
    public String direccion;
    public String identificacion ;
    public H3_TH1_PersonaVisita(String relacionConPPL, String telefono, String direccion, String identificacion, String nombre, String nacionalidad, String genero, int edad) {
        super(nombre, nacionalidad, genero, edad);
        this.relacionConPPL = relacionConPPL;
        this.telefono = telefono;
        this.direccion = direccion;
        this.identificacion = identificacion;
    }
    public String getRelacionConPPL() {
        return relacionConPPL;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    @Override
    public String toString() {
        return "PersonaVisita{"+super.toString() + "relacionConPPL=" + relacionConPPL + ", telefono=" + telefono + ", direccion=" + direccion + ", identificacion=" + identificacion + '}';
    }   
}