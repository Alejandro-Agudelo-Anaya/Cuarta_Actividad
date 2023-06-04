package Ejercicio2;

public class CasaIndependiente extends CasaUrbana{
    protected static double priceArea = 3000000;

    public CasaIndependiente(int id, int area, String address,int bedrooms,int bathrooms,int floors){
        super(id,area,address,bedrooms,bathrooms,floors);
    }

    @Override
    public void showInfo(){
        super.showInfo();
    }
}
