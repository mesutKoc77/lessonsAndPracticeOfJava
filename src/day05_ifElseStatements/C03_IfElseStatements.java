package day05_ifElseStatements;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin,
        // degilse “Eskenar degil” yazdirin.

        Scanner scanedilen = new Scanner(System.in);
        System.out.println("Değerinizi Giriniz");
        int kenar1 = scanedilen.nextInt();
        int kenar2 = scanedilen.nextInt();
        int kenar3 = scanedilen.nextInt();

        if (kenar1 == kenar2 && kenar2 == kenar3) {
            System.out.println("Eşkenar");
        } else {
            System.out.println("Maalesef Değil");
        }
        //sonuç olarak sadece iki sonuç varsa if else kullanılır.



    }
}

