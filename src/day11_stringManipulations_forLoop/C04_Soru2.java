package day11_stringManipulations_forLoop;

import java.util.Scanner;

public class C04_Soru2 {
    public static void main(String[] args) {

        /* no 68

          Kullanicidan bir sayi alin
          sayi 3 ile bolunuyorsa "3 ile bolunen sayi"
          5 ile bolunuyordsa "5 ile bolunen sayi"
          hem 3, hem 5 ile bolunuyorsa "Super sayi"
          geriye kalanlar icin "onemsiz sayi"

         */

        //şartlari en agır olandan başlayacagız.

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen Bir Sayi Giriniz");
        int sayi=scanedilen.nextInt();

        if (sayi%3==0 && sayi%5==0) {
            System.out.println("Super Sayi");} else if (sayi%3==0) {
            System.out.println("3 ile bolunen sayi");} else if (sayi%5==0) {
            System.out.println("5 ile bolunen sayi");}
        else {
            System.out.println("onemsiz sayi");

        }


    }

}
