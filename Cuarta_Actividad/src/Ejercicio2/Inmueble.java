package Ejercicio2;

import java.util.function.*;

public class Inmueble {
    protected int id;
    protected int area;
    protected String address;
    protected double value;

    static Consumer<String> println = System.out::println;

    public Inmueble(int id,int area,String address){
        this.id = id;
        this.area = area;
        this.address = address;
    }

    public double calculateSellPrice(double priceArea){
        value = area*priceArea;
        return value;
    }

    void showInfo(){
        println.accept("Identificador Inmobiliario: "+id);
        println.accept("Area: "+area);
        println.accept("Direccion: "+address);
        println.accept("Precio de Venta: $"+value);
    }
}
