package classroom;

public class Persona {

    protected final long cedula;
    public String nombre;
    private static int totalPersonas =0;
    

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        newPersona();
    }
    
    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        newPersona();
    }

    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        newPersona();
    }

    public Persona(String nombre) {
        this.nombre = "";
        cedula=1;
        newPersona();
    }
    public Persona(){
        cedula = 0;
        nombre = "";
        newPersona();
    }
    
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public static void newPersona(){
        totalPersonas++;
    }
}
