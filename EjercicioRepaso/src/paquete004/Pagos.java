/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

/**
 *
 * @author Jhonder
 */
public abstract class Pagos {
    protected double total;
    
    public abstract void establecerTotal();
    
    public double obtenerTotal(){
        return total;
    }
    
    
}
