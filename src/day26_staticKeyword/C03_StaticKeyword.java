package day26_staticKeyword;

public class C03_StaticKeyword {
    public static void main(String[] args) {
        /*
    hiç obje oluşturmadan başka bir class daki static variable ları
    çağırabilriiz.
    classadi.static variable ismi
     */

        System.out.println(C01_StaticKeyword.sayi);//10
        C01_StaticKeyword.sayi=20;
        System.out.println(C01_StaticKeyword.sayi);//20
//peki obje uzerinden ulaşabilir miyiz

        C01_StaticKeyword obj1=new C01_StaticKeyword();//hemen bir obje oluştururlacak
        System.out.println(obj1.no+" "+obj1.sayi);//20,20

        //static variable class a baglıdır surekli oluşturulmaz birkez oluşturulur ve
        //degerlerini sen takip edersin.
        /*
        static variable lar  class a aitttirler ve class ile birlikte oluşturulurlar.
        hiç obje oluşturmeasak da static variable lar kullanılabilir veya update edilebilirler.
        mesela 17. satırda instance variable olan no nun degerini, tespit etmek için 16. satırdan
        yanı obj1 ın oluşturuldugu satırdan ititbraen takip ediyrm.
        fakat 17 de deki static variable ın degerini gormek için class ın başından ititbaren takip
        etmem gerekiyor.
         */

    }

}
