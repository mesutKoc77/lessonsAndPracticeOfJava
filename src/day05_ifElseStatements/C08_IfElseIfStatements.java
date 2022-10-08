package day05_ifElseStatements;

import java.util.Scanner;

public class C08_IfElseIfStatements {
    public static void main(String[] args) {

         /*
        Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        (kilo*10000 / (boy *boy))
        vucut kitle endeksi 30’dan buyukse obez,
        25-30 arasi ise kilolu,
        20-25 arasi ise normal,
        20’den kucukse zayif yazdirin.

        */

        Scanner scanedilen = new Scanner(System.in);

        System.out.println("Lutfen kilonuzu giriniz");
        double kilosu = scanedilen.nextDouble();

        System.out.println("Lutfen Boyunuzu giriniz");
        double boyu = scanedilen.nextDouble();

        double vke = (kilosu * 10000) / (boyu * boyu);

        System.out.println("Vucut Kitle Endeksiniz" + vke);

        if (vke > 30) {
            System.out.println("obez");
        } else if (vke >= 25) {
            System.out.println("Kilolu");
        } else if (vke >= 20) {
            System.out.println("Normal");
        } else {
            System.out.println("Zayif");
        }


    }


}




