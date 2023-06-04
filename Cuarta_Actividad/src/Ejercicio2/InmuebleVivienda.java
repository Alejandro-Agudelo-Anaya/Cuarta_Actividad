package Ejercicio2;

public class InmuebleVivienda extends Inmueble{
    protected int bedrooms;
    protected int bathrooms;

    public InmuebleVivienda(int id,int area,String address,int bedrooms,int bathrooms){
        super(id,area,address);
        this.bathrooms = bathrooms;
        this.bedrooms = bedrooms;
    }
    @Override
    public void showInfo(){
        super.showInfo();
        println.accept("Numero de Habitaciones: "+bedrooms);
        println.accept("Numero de Baños:"+bathrooms);
    }
}
