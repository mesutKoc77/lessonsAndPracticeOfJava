package day11_stringManipulations_forLoop;

import java.util.Scanner;

public class C02_lastIndexOf {

    public static void main(String[] args) {

        String str="Java cok guzel, cok";

        System.out.println(str.indexOf("cok"));//5//baştan başlayarak cok u bul.
        System.out.println(str.lastIndexOf("cok"));//cok u sondan başlayarak bulmaya çalış, bulunca da baştan başla
        //ve indeksini tespit et.//16

        System.out.println(str.indexOf('o'));//6//aramaya baştan başlayacak

        System.out.println(str.lastIndexOf('o'));//17, aramaya sondan başlayacak. ikisinin ortak ozelliği indeksi
        //baştan başlayarak tespit ediyor.

        System.out.println(str.indexOf("cok", 10));//10. indeks ve sonrasında arama yapar ve soyler indeksını
        //yani 16. indeks diyecek bize

        System.out.println(str.lastIndexOf("cok", 10));//buraya gelcek ve 10. indeksden itibaren soldan saga
        //dogru tarama yapacak ve buldugunu yazdıracak.yani baştan 10.indeks olan u ya gidecek ve sonra başa dogru gidecek
        //cok u bulacak ve o buldugu cok baştan başlayarak indeksını hesap edecek.//5

          /*
          Kullanicidan bir cumle ve bir kelime isteyin
          cumlede kelimenin kullanimina gore
          asagidaki cumlelerden uygun olani yazdirin
          - cumle aradiginiz kelimeyi icermiyor
          - aradiginiz kelime cumlede sadece 1 tane var
          - aradiginiz kelime cumlede birden fazla var
         */

        String aranankelime="guzel";

        int ilkIndex=str.indexOf(aranankelime);
        int sonIndex=str.lastIndexOf(aranankelime);

        //cumle aradıgımız kelimeyi içermiyor

        if (!str.contains(aranankelime)){
            System.out.println("cumle aradiginiz kelimeyi icermiyor");} else if (ilkIndex==sonIndex) {
            System.out.println("aradiginiz kelime cumlede sadece 1 tane var");} else {
            System.out.println("aradiginiz kelime cumlede birden fazla var");
        }

    }
}
