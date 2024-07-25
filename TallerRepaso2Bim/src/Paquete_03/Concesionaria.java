/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_03;

import Paquete_02.TipoVehiculo;
import java.util.ArrayList;

/**
 *
 * @author Usuario iTC
 */
public class Concesionaria {
    private String nombre;
    private TipoVehiculo vehiculoMasBarato;
    private TipoVehiculo vehiculoMasCaro;
    private double ventasTotales;
    public ArrayList<TipoVehiculo> listaVentas;
    
    public Concesionaria (String n,ArrayList<TipoVehiculo> lista ){
        nombre = n;
        listaVentas = lista;
        
    }
    
    
    public void establecerVentasTotales(){
        ventasTotales = 0;
        for (int i = 0; i < listaVentas.size(); i++ ){
            ventasTotales += listaVentas.get(i).obtenerPrecioFinal();
        }
    }
    
    public double obtenerVentasTotales(){
        return ventasTotales;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public TipoVehiculo obtenerVehiculoMasBarato() {
        return vehiculoMasBarato;
    }

    public void establecerVehiculoMasBarato() {
        vehiculoMasBarato = listaVentas.get(0);
        for(int i = 0; i < listaVentas.size(); i++ ){
            if (listaVentas.get(i).obtenerPrecioFinal() < vehiculoMasBarato.obtenerPrecioFinal()){
                vehiculoMasBarato = listaVentas.get(i);
            }  
        }
    }

    public TipoVehiculo obtenerVehiculoMasCaro() {
        return vehiculoMasCaro;
    }

    public void establecerVehiculoMasCaro() {
        vehiculoMasCaro = listaVentas.get(0);
        for(int i = 0; i < listaVentas.size(); i++ ){
            if (listaVentas.get(i).obtenerPrecioFinal() > vehiculoMasCaro.obtenerPrecioFinal()){
                vehiculoMasCaro = listaVentas.get(i);
            }  
        }
    }

    public ArrayList<TipoVehiculo> obtenerListaVentas() {
        return listaVentas;
    }

    public void establecerListaVentas(ArrayList<TipoVehiculo> lista) {
        listaVentas = lista;
    }
    
    public String toString (){
        String cadena = String.format("Nombre Concesionaria: %s\n"
   
                + "Vehiculo mas Barato: %s\n"
                + "Vehiculo mas Caro: %s \n"
                + "Lista de Ventas: "
                ,nombre,
                vehiculoMasBarato,vehiculoMasCaro);
                
        for (int i = 0; i < listaVentas.size(); i++) {
            cadena = String.format("%s\n%s\n", cadena,
                     listaVentas.get(i));
        }
        
        cadena = String.format("%sVentas Totales: %.2f\n", cadena,ventasTotales);
        return cadena;
    }
    
    
    
}
