package Ejercicio2;

public class CasaRural extends Casa{

    protected static double priceArea = 1500000;
    protected int altitude;

    protected int distanceToTown;

    public CasaRural(int id, int area, String address,int bedrooms,int bathrooms,int floors, int distanceToTown,int altitude){
        super(id,area, address, bedrooms, bathrooms,floors);
        this.distanceToTown = distanceToTown;
        this.altitude = altitude;
    }
    @Override
    public void showInfo(){
        super.showInfo();
        println.accept("Distancia a la cabecera municipal: "+distanceToTown+" Km");
        println.accept("Altitud sobre el nivel del mar: "+altitude+" metros");
    }

}
