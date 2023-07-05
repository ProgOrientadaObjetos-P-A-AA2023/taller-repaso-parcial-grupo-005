

import paquete001.Persona;


public class Ciudad extends Persona{
    
    private String nombreCiudad;

    public Ciudad(String n, String ap, int ed, String ced, Object c) {
        super(n, ap, ed, ced, c);
    }

    
    
    
    public String obtenerNombreCiudad() {
        return nombreCiudad;
    }
    
    public void establecerNombreCiudad(String x) {
        nombreCiudad = x;
    }
    
    
    
}
