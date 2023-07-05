package paquete004;

import java.util.ArrayList;

/**
 *
 * @author Jhonder
 */
public class TiposPagos {
    private double totalPagos;
    private ArrayList<Pagos> pagos;
    
    
    
    public double obtenerTotalPagos() {
        return totalPagos;
    }
    
    public ArrayList<Pagos> obtenerPagos() {
        return pagos;
    }
    
    public void establecerPromedioPagos() {
        
        String cadena = "";
        
        for (int i = 0; i < obtenerPagos().size(); i++) {
            
            Pagos p = new Pagos() {
                @Override
                public void establecerTotal() {
                    
                }
            }
            String.format("%sPago agua Potable: %.2f\n", cadena);
        }
        
    }
    
    public void establecerPagos(ArrayList<Pagos> x) {
        pagos = x;
    }
}
