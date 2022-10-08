package day06_nestedIfELse_Ternary;

import java.util.Scanner;

public class C02_IfElseIf_Emeklilik {
    public static void main(String[] args) {
         /*
        Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri
        Erkek 65 yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

         */

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen Cinsiyetinizi (Bayan için B, Erkek için E) Giriniz");
        char cinsiyet=scanedilen.next().toUpperCase().charAt(0);//kullanıcıdan değeri aldık, ne girerse girsin
        //bunu buyuk harflere çevirip (touppercase) ilk harfini (char 0 ) aldık.
        System.out.println("şimdi ise yaşınızı giriniz");
        double yas=scanedilen.nextDouble();

        if (cinsiyet=='B' && yas>=60) {
            System.out.println("Emekli olabilirsiniz");}
        else if (cinsiyet=='B' && yas<60) {
            System.out.println("Emekli olabilmeniz icin" +(60-yas) + "yıl daha var" );}
        else if (cinsiyet=='E' && yas>=65) {
            System.out.println("Emekli olabilirsiniz");}
        else if (cinsiyet=='E' && yas<65) {
            System.out.println("Emekli olabilmeniz icin" +(65-yas) + "yıl daha var" );}
        else {System.out.println("Geçersiz Bilgi");}

        }

    }





