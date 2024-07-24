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
public class TipoSuv extends TipoVehiculo{
    private double porSegPersona;
    private double seguroPersona;
    
    public TipoSuv(Comprador c, String m, double p, double por){
        super(c, m, p);
        porSegPersona = por;
        
    }

    public double obtenerPorSegPersona() {
        return porSegPersona;
    }

    public void establecerPorSegPersona(double p) {
        porSegPersona = p;
    }

    public double obtenerSeguroPersona() {
        return seguroPersona;
    }

    public void establecerSeguroPersona() {
        seguroPersona = precioBase * (porSegPersona / 100);
        
    }
    
    @Override
    public void establecerPrecioFinal (){
        precioFinal = precioBase + seguroPersona;
    }
    
    public String toString() {
        String cadena = String.format("Vehiculo Suv\n"
                +"%sPorcentaje Seguro Persona: %.2f\n"
                + "Valor Seguro: %.2f\n"
                + "Precio Final %.2f\n",
                super.toString(),
                porSegPersona,
                seguroPersona,
                precioFinal);

        return cadena;
    }
    
    
    
        
}
