package day07_ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("kenar1 \nkenar2 \nkenar3 giriniz");
        int kenar1=scanedilen.nextInt();
        int kenar2=scanedilen.nextInt();
        int kenar3=scanedilen.nextInt();

        System.out.println(kenar1 == kenar2 && kenar2 == kenar3 ? "Eşkenar Üçgen" : "Eşkenar Degil");


    }
}
