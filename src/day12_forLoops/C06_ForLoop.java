package day12_forLoops;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {

        //no 48
        //2.12

        // Kullanicidan pozitif bir sayi alip
        // sayinin rakamlar toplamini yazdirin

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi=scanedilen.nextInt();

        String yenisayi=sayi+"";
        int basamaksayisi=yenisayi.length();

        int rakamlartoplami=0;



        for (int i = 1; i <=basamaksayisi//(bu işlmi ne kadar donduruo yapayım? cevap: satının basamak sayısı kadar tekrar et
         ; i++) {

            int birlerbasamagi=sayi%10;//aldık sayıyı, 10 a bolduk birler basaagıbı bulduk

            rakamlartoplami+=birlerbasamagi;//bu birler basamagını ralkamlar toplamnı ekledik.

            sayi=sayi/10;//eklenen rakamdan kurtulmak için sayıyı 10 o bolduk ve yeni sayıyı olarak tanımladık. yukarıya verdik
            //ve donguye yeni sayıyla girdik.

       }
        System.out.println("Rakamlar Toplami: "+rakamlartoplami);

        //for un içinde tanımlayacagımız i lerin başlangıç ve bitiş sayısı içerideki işlemin kaç kkere yapılacagını bize verir.
        //ornegin  basmaka sayısı 10 olsunbu işlemi 10 kere yap diyebilmem için 1 den başla 10 a kadar 10 ddahil bu işlemi
        //tekrar et demem gerekiyor. velhasııslı kelam for un içi işlemi kaç kere dondurecegımı gösteriyor.















    }
}
