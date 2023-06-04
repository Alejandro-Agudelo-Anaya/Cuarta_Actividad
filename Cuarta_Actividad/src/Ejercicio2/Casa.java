package Ejercicio2;

public class Casa extends InmuebleVivienda{

    protected int floors;

    public Casa(int id, int area, String address,int bedrooms,int bathrooms,int floors){
        super(id,area,address,bedrooms,bathrooms);
        this.floors = floors;
    }
    @Override
    public void showInfo(){
        super.showInfo();
        println.accept("Numero de pisos"+floors);
    }
}
