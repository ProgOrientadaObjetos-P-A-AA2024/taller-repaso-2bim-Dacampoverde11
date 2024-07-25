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
public class TipoCamioneta extends TipoVehiculo {

    private double porcentajeImportacion;
    private double valorImportacion;
    private double seguroMantenimiento;

    public TipoCamioneta(Comprador c, String m, double pB, double porIm) {
        super(c, m, pB);

        porcentajeImportacion = porIm;

    }

    public double obtenerPorcentajeImportacion() {
        return porcentajeImportacion;
    }

    public void establecerPorcentajeImportacion(double p) {
        porcentajeImportacion = p;
    }

    public double obtenerValorImportacion() {
        return valorImportacion;
    }

    public void establecerValorImportacion() {
        valorImportacion = precioBase * (porcentajeImportacion / 100);
    }

    public double obtenerSeguroMantenimiento() {
        return seguroMantenimiento;
    }

    public void establecerSeguroMantenimiento() {
        seguroMantenimiento = valorImportacion * 1.5;
    }

    @Override
    public void establecerPrecioFinal() {
        precioFinal = precioBase + valorImportacion + seguroMantenimiento;
    }

    public String toString() {
        String cadena = String.format("Vehiculo camioneta\n"
                +"%sPorcentaje Importación: %.2f\n"
                + "Valor Importacion: %.2f\n"
                + "Valor Seguro mantenimiento: %.2f\n"
                + "Precio Final %.2f\n",
                super.toString(),
                porcentajeImportacion,
                valorImportacion,
                seguroMantenimiento,
                precioFinal);

        return cadena;
    }
    
    
    
}
