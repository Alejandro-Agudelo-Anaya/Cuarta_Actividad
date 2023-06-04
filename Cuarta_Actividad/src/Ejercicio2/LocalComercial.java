package Ejercicio2;

public class LocalComercial extends Local{
    protected static double priceArea = 3000000;
    protected String Mall;

    public LocalComercial(int id,int area,String address,type typeLocal,String Mall){
        super(id,area,address,typeLocal);
        this.Mall = Mall;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        println.accept("Centro Comercial: "+Mall);
    }
}
