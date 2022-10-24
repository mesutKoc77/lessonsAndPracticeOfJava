package day02_scanner_dataCasting;

public class C08_DataCasting {
    public static void main(String[] args) {

        double doubleSayi=23.4;
        int intSayi= (int) doubleSayi;
        System.out.println(intSayi); //23

        // verilen 3 tamsayinin, ortalamasi yazdirin

        int sayi1=12;
        int sayi2=13;
        int sayi3=16;
        System.out.println((sayi1+sayi2+sayi3)/3); // normalde 41/3= 13.66666 ama int oldughu ııcn 13
        /*
          Eger islem yapilan tum sayilar int ise java sonucu da integer olarak verir
          ama sayilardan biri double olursa,sonucu genis olana otomatik cast eder
         */


        double sayi4=15;

        System.out.println((sayi1+sayi4)/2);//13.5

        // verilen 3 tamsayinin, ortalamasini double yazdirin

        System.out.println((double) ((sayi1+sayi2+sayi3)/3) );//burda sen sonucu double cast etmeye çalışıyorsun
        //ama java once parantezi halledecgnden dolayısyla sonucu 13 bulacağı ndan double yapabılmesi için
        //nokta sıfır koyup double goruntusu de verecek ve dogru sonuca ulaşamayacgız.
        //diğer bir nokta double yazarken hangi degeri double yapacaksan onun yanına parantezli double yazısıyla
        //gelmen gerekiyor.

        System.out.println(( (double) sayi1+sayi2+sayi3)/3);
        //burda sayı1 im double a cast edildiği için
        //yani içlerinden birii artık double oldugu için sonuçta double cınsınden yazılabılecktir.



















    }
}
