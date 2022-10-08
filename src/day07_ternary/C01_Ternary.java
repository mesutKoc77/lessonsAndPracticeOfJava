package day07_ternary;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        //35 e 1

        // Soru 1- Kullanicidan bir sayi isteyin,
        // sayiyi kontrol edip 5 ile bolunebiliyorsa “Sayi 5’in tam kati”
        // 5 ile bolunemiyorsa "Sayi 5'in tam kati degil" yazdirin.


        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen bir deger giriniz");
        int deger=scanedilen.nextInt();

        System.out.println(deger % 5 == 0 ? "Sayi 5’in tam kati" : "Sayi 5’in tam kati değil");

        /*Bunu if ile yaparsak
        if (deger%5==0)
        {System.out.println("Sayi 5’in tam kati");}
        else {System.out.println("Sayi 5’in tam kati degıl");}
         */




















    }
}

