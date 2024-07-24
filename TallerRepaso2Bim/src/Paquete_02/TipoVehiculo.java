/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_02;

import Paquete_03.Comprador;

/**
 *
 * @author Usuario iTC
 */
public abstract class TipoVehiculo {
    
    protected Comprador propietario;
    protected String marca;
    protected double precioBase;
    protected double precioFinal;
    
    public TipoVehiculo (Comprador p, String m, double b){
        propietario = p;
        marca = m;
        precioBase = b;
    
    }

    public Comprador obtenerPropietario() {
        return propietario;
    }

    public void establecerPropietario(Comprador p) {
        propietario = p;
    }

    public String obtenerMarca() {
        return marca;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public double obtenerPrecioBase() {
        return precioBase;
    }

    public void establecerPrecioBase(double p) {
        precioBase = p;
    }

    public double obtenerPrecioFinal() {
        return precioFinal;
    }

    public abstract void establecerPrecioFinal();
    
    public String toString (){
        String cadena = String.format(
                "Informacion comprador\n"
                + "--- Nombres: %s\n"
                + "--- Cedula: %s\n"
                + "Marca: %s\n"
                + "Precio Base: %.2f\n"
                 ,propietario.obtenerNombres(),
                propietario.obtenerCedula(),
                marca, precioBase);
        
        return cadena;
    }
    
}
