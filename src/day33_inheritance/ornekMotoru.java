package day33_inheritance;

public class ornekMotoru extends ornekAraba {

    int sayi1=30;
    int sayi3=40;
    String isim2="Ayse";
    String isim3="Fatma";

    ornekMotoru(){
        //super();---okul constructor
        System.out.println("Sınıf Constructor");
        System.out.println(this.sayi1);//30
        System.out.println(super.sayi);//10
        System.out.println(this.sayi2);//bu class da sayi2 yi bulamazsam parentte ararım//15
        System.out.println(super.sayi2);//15
        System.out.println(this.sayi3);//40
        //System.out.println(super.sayi3);//cunku parent ta sayi3 yok.
        //yani ben de yoksa babamdan bakarım, ama babam kendısınde yoksa benden istemez
        super.isim1="Hatice";//
        System.out.println(super.isim1);//hatice
        System.out.println(super.isim1);//hatice
        this.isim2="Kemal";
        System.out.println(this.isim2);//kemal
        System.out.println(super.isim2);//veli
        System.out.println(this.isim3);//fatma
        //System.out.println(super.isim3);//cunku parent ta isim3 yok.
    }

    public static void main(String[] args) {

        ornekMotoru arb1=new ornekMotoru();
    }


}
