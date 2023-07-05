package paquete003;

import paquete001.Persona;
import paquete004.PagoAguaPotable;
import paquete004.PagoLuzElectrica;
import paquete004.PagoPredial;
import paquete004.PagoTelefonoConvencional;


public class BilleteraPagos {
    private Persona persona;
    private double gastoPagos;
    private String mes;
    private PagoAguaPotable aguaCasa;
    private PagoAguaPotable aguaComercio;
    private PagoLuzElectrica luzCasa;
    private PagoLuzElectrica luzComercio;
    private PagoPredial casa1;
    private PagoPredial casa2;
    private PagoTelefonoConvencional telefonoCasa;
    private PagoTelefonoConvencional telefonoFinca;
    
    
    public BilleteraPagos(){
        
    }
    
    
    
    public Persona obtenerPersona() {
        return persona;
    }
    
    public double obtenerGastoPagos() {
        return gastoPagos;
    }
    
    public String obtenerMes() {
        return mes;
    }
    
    public PagoAguaPotable obtenerAguaCasa() {
        return aguaCasa;
    }
    
    public PagoAguaPotable obtenerAguaComercio() {
        return aguaComercio;
    }
    
    public PagoLuzElectrica obtenerLuzCasa() {
        return luzCasa;
    }
    
    public PagoLuzElectrica obtenerLuzComercio() {
        return luzComercio;
    }
    
    public PagoPredial obtenerCasa1() {
        return casa1;
    }
    
    public PagoPredial obtenerCasa2() {
        return casa2;
    }
    
    public PagoTelefonoConvencional obtenerTelefonoCasa() {
        return telefonoCasa;
    }
    
    public PagoTelefonoConvencional obtenerTelefonoFinca() {
        return telefonoFinca;
    }
    
    public void establecerPersona(Persona x) {
        persona = x;
    }
    
    public void establecerGastoPagos(double x) {
        gastoPagos = x;
    }
    
    public void establecerMes(String x) {
        mes = x;
    }
    
    public void establecerAguaCasa(PagoAguaPotable x) {
        aguaCasa = x;
    }
    
    public void establecerAguaComercio(PagoAguaPotable x) {
        aguaComercio = x;
    }
    
    public void establecerLuzCasa(PagoLuzElectrica x) {
        luzCasa = x;
    }
    
    public void establecerLuzComercio(PagoLuzElectrica x) {
        luzComercio = x;
    }
    
    public void establecerCasa1(PagoPredial x) {
        casa1 = x;
    }
    
    public void establecerCasa2(PagoPredial x) {
        casa2 = x;
    }
    
    public void establecerTelefonoCasa(PagoTelefonoConvencional x) {
        telefonoCasa = x;
    }
    
    public void establecerTelefonoFinca(PagoTelefonoConvencional x) {
        telefonoFinca = x;
    }
    
    
    public String toString(){
        /*
            Se debe presentar el reporte que incluya
            información correspondiente oportuna
        */
        return "Presentar Reporte";
    }
}
