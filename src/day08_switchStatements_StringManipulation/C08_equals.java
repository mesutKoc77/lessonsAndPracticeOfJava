package day08_switchStatements_StringManipulation;

import java.util.Scanner;

public class C08_equals {
    public static void main(String[] args) {
        //no 46

         /*
          Kullanicidan gun ismini alin
          ve girilen gun ismine gore

          hafta ici veya hafta sonu yazdirin
         */

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");//dikkat buyuk kucuk harfe dikkat etmez
        String ilkyazilandeger=scanedilen.next();//yazdıgı degeri aldım
        String kabulettigimdeger=ilkyazilandeger.toLowerCase(); //yazdıgı degeri kucuk harfe cevirdim

        System.out.println(ilkyazilandeger);//mesela PAZar olarak girsin
        System.out.println(kabulettigimdeger);//ben onu pazar olarak kabul edip, tüm metodu kucuk harf uzerine
        //bina edeyim ki aşağıda kucuk harfli olanları variable olarak atadım.

        if (kabulettigimdeger.equals("pazartesi") || kabulettigimdeger.equals("salı") ||
                kabulettigimdeger.equals("çarşamba") || kabulettigimdeger.equals("perşembe") ||
        kabulettigimdeger.equals("cuma")) {
            System.out.println("Belirttiginiz Gün Olan "  +ilkyazilandeger + " Hafta İçindedir" );}
        else if (kabulettigimdeger.equals("cumartesi") || kabulettigimdeger.equals ("pazar" )) {
            System.out.println("Belirttiginiz Gün Olan " + ilkyazilandeger + " Hafta Sonundadır" );}
        else {
            System.out.println("Verilen Bilgiler Hatalıdır");}




    }


}
