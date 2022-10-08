package day12_forLoops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

        //no 47

        // kullanicidan 20'den kucuk bir pozitif tamsayi alip
        // bu sayinin faktoryel'ini yazdirin
        // 5 ! = 5 * 4 * 3 * 2 * 1 = 120

        Scanner scanedilen=new Scanner(System.in);

        System.out.println("Lutfen 20 dne kucuk bir tamsyi giirniz");

        int sayi1=scanedilen.nextInt();
        int faktoriyel=1;

        System.out.print(sayi1 + "!=");


        for (int i = sayi1; i >0 ; i--) {

            System.out.print(i+"*");

            faktoriyel=faktoriyel*=i;//eşitiligin sagındlan başladık, or 5 ile başladık. i=5 dedik sonra bunu faktöriyel ile
            //çarptı, suan faktoiryelin degeri 5 oldu. sonra i 4 oldu. 4 u aldık faktoriyel olan 5 ile çarptik 20 oldu
            //sonra i 3 oldu. 3 fakrtöriyel aldık 20 ile çarptık ve 60 oldu. sonra i 2 oldu. 2 u aldık faktorıyel eski
            //faktoriyel 60 ile çarptik. 120 oldu. i 1 oldu ve eski faktoriyel ile çarptk.

            /*
             fot un içine yazdıgın her şeyi her donuşte yazacaktı. onun için dikkatli olmak gerekiyorç
             ornegın aşagıdakı sout u eklersn, her seferinde yani i her degştıgınde sotun yeni degerini, yanına yaz
             konutu vermişş oluryorsun
               System.out.print(faktoriyel);
             */
        }
        System.out.println("=" +faktoriyel);



        // 5 ! = 5 * 4 * 3 * 2 * 1 = 120   bu sekilde yazdirarak sonucu kullaniciya verelim





    }
}
