package paquete004;


public class PagoTelefonoConvencional extends Pagos{
    
    public double calcularPago(){
        double tarifa = 6.20;
        double minutosConsumidos = 100;
        double costoMinuto = 0.2;
        double pago = tarifa + (minutosConsumidos * costoMinuto);
        return pago;
    }
    
    @Override
    public void establecerTotal(){
        calcularPago();
    }
    
    public String toString(){
        String cadena = "";
        
        cadena= String.format("%sPago Telefono Convenional: ",cadena, calcularPago());
        
        return cadena;
    }
}
