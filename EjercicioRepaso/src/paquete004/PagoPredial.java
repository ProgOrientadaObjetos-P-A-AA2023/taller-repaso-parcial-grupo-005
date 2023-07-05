package paquete004;


public class PagoPredial extends Pagos{
    public double calcularPago(){
        double valorPropiedad = 56000;
        double porcentaje = 10;
        double pago = valorPropiedad - ((valorPropiedad*porcentaje)/100);
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
