/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Paquete_01;


import Paquete_02.*;
import Paquete_03.*;
import java.util.ArrayList;

/**
 *
 * @author Usuario iTC
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<TipoVehiculo> lista = new ArrayList<TipoVehiculo>() ;
        Comprador comprador = new Comprador ("Daniel Campoverde", "1900635705");
        Comprador comprador2 = new Comprador ("Felipe Caicedo", "101010101010");
        
        TipoSedan sedan1 = new TipoSedan(comprador, "totoya", 12000, 2.6);
        TipoSedan sedan2 = new TipoSedan(comprador2, "mazda", 23000, 3.8);
        sedan1.establecerValordescuento();
        sedan2.establecerValordescuento();
        
        lista.add(sedan1);
        lista.add(sedan2);
        
        Comprador comprador3 = new Comprador ("Antonio Valencia", "0900000000000");
        
        TipoSuv suv = new TipoSuv(comprador3, "Mustang", 80000, 1.7);
        suv.establecerSeguroPersona();
        
        lista.add(suv);
        
        Comprador comprador4 = new Comprador ("Roberto Gomez", "2300000000");
        TipoCamioneta camioneta = new TipoCamioneta(comprador4, "citroen", 19000, 6.1);
        camioneta.establecerSeguroMantenimiento();
        camioneta.establecerValorImportacion();
        lista.add(camioneta);
        
        for (int i = 0; i < lista.size(); i++){
            lista.get(i).establecerPrecioFinal();
        }
        
        Concesionaria consecionaria = new Concesionaria("Mirasol", lista);
        consecionaria.establecerVehiculoMasBarato();
        consecionaria.establecerVehiculoMasCaro();
        consecionaria.establecerVentasTotales();
        System.out.println(consecionaria);
        
        
    }
    
}
