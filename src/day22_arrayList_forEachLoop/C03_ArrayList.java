package day22_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_ArrayList {
    public static void main(String[] args) {
         /*
          kullanicidan bir tam sayi alip
          o tamsayidan kucuk fibonacci sayilarini bir liste olarak donduren
          bir method olusturun
         fibonacci serisi = 0 1 1 2 3 5 8 13 21 34 .....
         */

        //sınırı belli olmayan loop lar da whileLoop kullanılmalı. for loop sınır belli iken kullanılırdı.

        List<Integer> fibonacciSerimiz=new ArrayList<>();
        fibonacciSerimiz=fibonacciMethodu();
        System.out.println(fibonacciSerimiz);
    }
    private static List<Integer> fibonacciMethodu() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen fibonacci serisi için bir ust sınır giriniz");
        int sinir=scan.nextInt();

        int sayi1=0;
        int sayi2=1;
        int sayi3=1;

        List<Integer> fibonacciListesi=new ArrayList<>();
        fibonacciListesi.add(0);
        fibonacciListesi.add(1);

        while (sayi3<=sinir){
            sayi3=sayi1+sayi2;
            if (sayi3<=sinir){
                fibonacciListesi.add(sayi3);
            }
            sayi1=sayi2;
            sayi2=sayi3;
        }

        return fibonacciListesi;
    }


}
