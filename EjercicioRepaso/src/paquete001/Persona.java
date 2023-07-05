package paquete001;

//import paquete002.Ciudad;


public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String cedula;
    //private Ciudad ciudad;
    
    
    
    public Persona(String n, String ap, int ed, String ced){
        nombre = n;
        apellido = ap;
        edad = ed;
        cedula = ced;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerApellido() {
        return apellido;
    }
    
    public int obtenerEdad() {
        return edad;
    }
    
    public String obtenerCedula() {
        return cedula;
    }
    
    /*ublic Ciudad obtenerCiudad() {
        return ciudad;
    }*/
    
    public void establecerNombre(String x) {
        nombre = x;
    }
    
    public void establecerApellido(String x) {
        apellido = x;
    }
    
    public void establecerEdad(int x) {
        edad = x;
    }
    
    public void establecerCedula(String x) {
        cedula = x;
    }
    /*
    public void establecerCiudad(Ciudad x) {
        ciudad = x;
    }*/
}
