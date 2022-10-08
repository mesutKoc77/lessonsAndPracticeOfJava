package day41_interfaces;

public class NChildOfI06 implements I06_Interface{
    @Override
    public void method1() {

    }//goruldugu gibi bodys olan default ve static method ları override etme zorunlulugunu benden istemedi.
    //ama tabii ki onlara aşağıda goruldugu uzere ulaşabailirim.

    public static void main(String[] args) {
        I06_Interface.method3();//static yontemle ulaştık
        NChildOfI06 obj=new NChildOfI06();
        obj.method2();//default a da obj uzerinden ulaştık.
    }
}
