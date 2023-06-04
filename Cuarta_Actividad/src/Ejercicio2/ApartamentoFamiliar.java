package Ejercicio2;

public class ApartamentoFamiliar extends Apartamento{
    protected static double priceArea = 2000000;
    protected int valueMaintenance;

    public ApartamentoFamiliar(int id,int area,String address,int bedrooms,int bathrooms,int valueMaintenance){
        super(id,area,address,bedrooms,bathrooms);
        this.valueMaintenance = valueMaintenance;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        println.accept("Valor de la administracion: "+valueMaintenance);
    }
}
