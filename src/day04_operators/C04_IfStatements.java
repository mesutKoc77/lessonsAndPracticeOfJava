package day04_operators;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        // NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        // Kullanici o veya O yazdiginda output Ocak olsun.

         /*
          O ocak
          S subat
          M Mart, Mayis
          N Nisan
          H Haziran
          T temmuz
          A Agustos, Aralik
          E Eylul, Ekim
          K Kasim
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);

        if (harf=='O' || harf=='o' ){
            System.out.println("Ocak");
        }

        if (harf=='s' || harf=='S'){
            System.out.println("Subat");
        }

        if (harf=='M' || harf=='m') {
            System.out.println("Mart veya Mayıs");
        }
        if (harf=='N' || harf=='n') {
            System.out.println("Nisan");}

        if (harf=='H'|| harf=='h'){
            System.out.println("Haziran");}

        if (harf=='T' || harf=='t'){
            System.out.println("Temmuz");}

        if (harf=='A' || harf=='a') {
            System.out.println("Agustos veya Aralık");}

        if (harf=='E' || harf=='e') {
            System.out.println("Eylul veya Ekim");
        }

        if (harf=='K' || harf=='k') {
            System.out.println("Kasım");}





















    }
}
