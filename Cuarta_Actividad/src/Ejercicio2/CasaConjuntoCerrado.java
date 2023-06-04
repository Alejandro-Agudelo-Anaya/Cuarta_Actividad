package Ejercicio2;

public class CasaConjuntoCerrado extends CasaUrbana{
    protected static double priceArea = 2500000;
    protected int valueMaintenance;
    protected boolean hasPool;
    protected boolean hasDeportiveCamps;

    public CasaConjuntoCerrado(int id, int area, String address,int bedrooms,int bathrooms,int floors,int valueMaintenance,boolean hasPool, boolean hasDeportiveCamps){
        super(id,area,address,bedrooms,bathrooms,floors);
        this.valueMaintenance = valueMaintenance;
        this.hasPool = hasPool;
        this.hasDeportiveCamps = hasDeportiveCamps;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        println.accept("Valor de la administracion: $"+valueMaintenance);
        if (hasPool){
            println.accept("Tiene Piscina");
        }else{
            println.accept("No tiene Piscina");
        }
        if(hasDeportiveCamps){
            println.accept("Tiene Campos Deportivos");
        }else{
            println.accept("No tiene Campos Deportivos");
        }
    }
}
