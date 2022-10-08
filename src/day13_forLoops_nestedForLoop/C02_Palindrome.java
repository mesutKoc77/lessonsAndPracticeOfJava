package day13_forLoops_nestedForLoop;

import java.util.Scanner;

public class C02_Palindrome {
    public static void main(String[] args) {
            /*
          Tersten okunusu orjinal metnin okuyusu ile ayni olan metin'lere palindrome denir
          Kullanicidan bir cumle veya sayi alin
          palindrome olup olmadigini kontrol edip yazdirin
         */

        // Kullanicidan bir String alip tersten yazdirin

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle=scanedilen.nextLine();//sayı  da girse ben onunla mateatiksel işlem yapmayacagö için String olarak aldım.

        String yeniterscumle = "";//once ters cumleyi bir degerle beraber bir variable a atamak gerekiyor.

        //Ahmet

        for (int i =cumle.length()-1; i>=0 ; i--) {

            yeniterscumle+=cumle.charAt(i);//yeniterscumle=yeniterscumle+=cumle.charAt(i); ifadesiyle aynıdır. Alışmak gerekıyor.
            //System.out.println(yeniterscumle);//eger buraya sout u eklersem, ilk aşama yapılır ve yazılır ve de işlem durup
            //ikinci aşamaya geçmez. dolayısıyla dıarı almam gerekiyor.
        }
        System.out.println(yeniterscumle);


        if (cumle.equalsIgnoreCase(yeniterscumle)) {
            System.out.println("Girdiginiz metin palindrome");}
        else {
            System.out.println("Girdiginiz metin palindrome degıl");
        }













    }
}
