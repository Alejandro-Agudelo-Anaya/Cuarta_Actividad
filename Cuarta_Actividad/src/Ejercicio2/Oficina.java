package Ejercicio2;

public class Oficina extends Local{
    protected static double priceArea = 3500000;
    protected boolean gobUses;

    public Oficina(int id,int area,String address,type typeLocal,boolean gobUses){
        super(id,area,address,typeLocal);
        this.gobUses = gobUses;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        if(gobUses){
            println.accept("Es una oficina gubernamental");
        }else{
            println.accept("No es una oficina gubernamental");
        }
    }
}
