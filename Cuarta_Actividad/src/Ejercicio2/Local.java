package Ejercicio2;

public class Local extends Inmueble{
    enum type {INTERNO,CALLE};
    protected type typeLocal;

    public Local(int id,int area,String address,type typeLocal){
        super(id,area,address);
        this.typeLocal = typeLocal;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        println.accept("Tipo de Local: "+typeLocal);
    }
}
