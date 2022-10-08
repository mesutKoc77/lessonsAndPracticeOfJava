package day35_overriding;

public class HChild extends GParent{

    /*

    Kural1: private, static ve final method lar override
    edilemez.
   child class da, parent class da static veya final olarak tanımlanan
   methdodun ismi ile ayni isimde method oluşturamayız.JTE verir.

   ancak parent da private olarak tanımlaann bir method un ismi ile
   ayni isimde bir method child class oluşturulursa CTE vermez Java.

   cunku private methodlar override edilemeyecgi için child class daki
   method u tamamen farklı bir method  olarak algilar.

     */

   //parnettaki private ı override edemez cunku zaten ona ulaşamaz.
    //ınun için @override talimati da veremem. peki altını şuan
    //neden çizmedi.Çünkü: private i tamamen kendine has olarak kabul
    //ediyor ve farklı bir method olarak tasavvur ediyor.


    //@Override---neden kabul etmiyor yukarıda açıklandı.
    void method1() {
        System.out.println("child method1");

    }
    @Override
    void method2() {
        System.out.println("child method2");
    }

    public static void main(String[] args) {

        GParent obj=new HChild();
        obj.method2();//"child method2"
       // obj.method1();//CTE verir cunku ben privat olana kesinlikle eri-
        //şemem diyor.

    }


}
