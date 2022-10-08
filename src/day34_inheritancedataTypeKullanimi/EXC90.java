package day34_inheritancedataTypeKullanimi;

public class EXC90 extends DVolvo{

    void yakit(){

        System.out.println("XC90 benzin kullanır");
    }
    void motor(){

        System.out.println("XC90 2000 motor kullanır");
    }

    void kasa(){

        System.out.println("XC90 SUV kasa kullanır");
    }
    /*
    overriding;(yani etkisiz hale getirmek) biz bir özelligi, bir hamle ile etkisiz hale getiirypruz. buna overriding di
    yoruz. mesela hayvanlar hareket ederler ama yırtıcı kuşlar da bir haynav oldugu halde hareket ozellikleri ucarlar
    olarak guncellernir yani override edilir.

     */

    public static void main(String[] args) {

        EXC90 arb1=new EXC90();
        arb1.yakit();//e
        arb1.motor();//e
        arb1.kasa();//e
        arb1.guvenlik();//D

    }
    /*
    eşitilin sagı constructor idi yani uretim yerimiz. meslea hastane projesi dusunelım; eşitlipin sagı doktor yani
    biz doktor uretmek istiyoruz fakt bunun ozelliklerini insan kaynakalrı class ının data sını kullanmak istersem
    bu sefer doktor. dedigimde insan kaynakalrının ve bunun parentının variable ve methodlarını deger olarak kullanırım.
    */



}
