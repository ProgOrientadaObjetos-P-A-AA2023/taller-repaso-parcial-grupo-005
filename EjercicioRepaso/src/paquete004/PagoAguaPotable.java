package paquete004;


/**
 *
 * @author reroes
 */
public class PagoAguaPotable extends Pagos{
    
    private String tipo;
    
    
    
    public double calcularPago(String tipo){
        double pago = 0;
        if(tipo.equals("comercial")){
            double tarifaFija = 2.20;
            double metrosCubicosConsumo = 100.2;
            double costoConsumoCubicos = 0.2;
            pago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos) + 15;
        }else{
            double tarifaFija = 2.20;
            double metrosCubicosConsumo = 100.2;
            double costoConsumoCubicos = 0.2;
            pago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos);
        }
        
        return pago;
    }

    
    @Override
    public void establecerTotal(){
        calcularPago(obtenerTipo());
    }
    
    public String obtenerTipo() {
        return tipo;
    }
    
    public void establecerTipo(String x) {
        tipo = x;
    }
}
