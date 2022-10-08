package day07_ternary;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {

        //39 a 1 no

        // Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen degeri giriniz");
        int deger=scanedilen.nextInt();

        deger=deger >0 ? deger : deger*-1;

        System.out.println("Girilen Sayının Mutlak Degeri " +deger);



    }
}
