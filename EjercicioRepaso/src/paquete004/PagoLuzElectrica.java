package paquete004;

import paquete001.Persona;
import paquete003.BilleteraPagos;

/**
 *
 * @author reroes
 */
public class PagoLuzElectrica extends Pagos{

    public double calcularPago() {
        double pago = 0;
        double tarifaBase = 10.20;
        double kilovatiosConsumidos = 80;
        double costoKilovatio = 0.5;
        String ciudad = "Loja";
        if (ciudad.equals("Loja")) {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }

        return pago;
    }
    
    
    
    @Override
    public void establecerTotal(){
        calcularPago();
    }
    
    public String toString(){
        String cadena = "";
        
        cadena= String.format("%sPago Predial: ",cadena, calcularPago());
        
        return cadena;
    }
    
}
