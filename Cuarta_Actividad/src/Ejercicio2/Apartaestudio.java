package Ejercicio2;

public class Apartaestudio extends Apartamento {
    protected static double priceArea = 1500000;

    public Apartaestudio(int id,int area,String address){
        super(id,area,address,1,1);
    }

    @Override
    public void showInfo(){
        super.showInfo();
    }
}
