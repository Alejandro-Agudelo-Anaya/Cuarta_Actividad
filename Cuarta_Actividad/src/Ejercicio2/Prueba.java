package Ejercicio2;

public class Prueba {
    /**
     * Método main que crea dos inmuebles, calcula su precio de
     * acuerdo al área y se muestran sus datos en pantalla
     */
    public static void main(String args[]) {
        ApartamentoFamiliar apto1 = new ApartamentoFamiliar(103067, 120, "Avenida Santander 45-45", 3, 2, 200000);
        System.out.println("Datos apartamento");
        apto1.calculateSellPrice(ApartamentoFamiliar.priceArea);
        apto1.showInfo();

        System.out.println("Datos apartamento");
        Apartaestudio aptestudio1 = new Apartaestudio(12354, 50, "Avenida Caracas 30-15");
        aptestudio1.calculateSellPrice(Apartaestudio.priceArea);
        aptestudio1.showInfo();
    }
}
