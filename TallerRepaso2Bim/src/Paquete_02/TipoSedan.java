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
public class TipoSedan extends TipoVehiculo {
    private double porcentajedescuento;
    private double valordescuento;
    private double seguroMecanico;
    
    public TipoSedan (Comprador c, String m, double pB, double porDes){
        super(c, m, pB);
        porcentajedescuento = porDes;
    }

    public double obtenerPorcentajedescuento() {
        return porcentajedescuento;
    }

    public void establecerPorcentajedescuento(double p) {
        porcentajedescuento = p;
    }

    public double obtenerValordescuento() {
        return valordescuento;
    }

    public void establecerValordescuento() {
        valordescuento = precioBase *(porcentajedescuento/100);
    }

    public double obtenerSeguroMecanico() {
        return seguroMecanico;
    }

    public void establecerSeguroMecanico() {
        seguroMecanico = precioBase * 0.1;
    }
    
    @Override
    public void establecerPrecioFinal(){
        precioFinal = precioBase - valordescuento + seguroMecanico;
    }
    
    public String toString() {
        String cadena = String.format("Vehiculo Sedan\n"
                +"%sPorcentaje Descuento: %.2f\n"
                + "Valor Descuento: %.2f\n"
                + "Seguro Mecanico: %.2f\n"
                + "Precio Final %.2f\n",
                super.toString(),
                porcentajedescuento,
                valordescuento,
                seguroMecanico,
                precioFinal);

        return cadena;
    }
    
    
    
}
