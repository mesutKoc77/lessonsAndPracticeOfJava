package day35_overriding;

public class NChild extends MParent {
   /*
    Kural 3:return type

    cgild class taki ovverriding method un return type ı ya
    parent taki method ile aynı olmalı ya da covariant olmalı.

    covariant data turu:

    data turleri arasında parent ve child ilişkiasi olması demektri.
    primitive data turlerinde parent child ilişkisi olamayacgından
    child ile oarenttaki methıdların return type ları birebir aynı olmalı.


     */


    @Override
    void method1() {

    }
    /*
    parent class daki method2 nin return type i primitve oldugundan child class daki
    overriding method un return type ı da primitive olmalı.
     */

    @Override
    int  method2() {
        return 5;

    }
    /*
    Child class daki method 3 un return type'ı String;
    Parent class daki method3 un return type ı ya String
    olmalı veya String in parent i olan bir class olmalı.
    Mesela object.
     */

    @Override
    String method3() {
        return "Hava";
    }
}
