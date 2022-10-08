package day08_switchStatements_StringManipulation;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

         /* 39 no

        Kullanicidan bir tamsayi alin.
	    Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
	    Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin

         */

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayı giriniz");
        int sayi=scanedilen.nextInt();

        String sonuc=sayi>0 ?(sayi%2==0 ? "Çift Sayi" : "Çift Sayi Degil"): ( sayi<-100 && sayi>-999 ?
                "Üç basamaklı" : "Üç Basamaklı Degil " );//burada değerler hep string oldugu için
        //variable da string olmalı.

        System.out.println(sonuc);

        //bir poztif olup olmaması iki ise çift olup olmaması veya 3 basamaklı ya da degıl.
        //yani iki durumun içinde iki durum var; buna göre iskelet oluşturuldu.













    }






}
