package day03_matematikselIslemler_Increment;

import java.util.Scanner;

public class C01_Casting {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin,
        // o sayiyi -128 ile 127 arasindaki bir sayiya donusturup yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        double girilenSayi=scan.nextDouble();
        byte donusenSayi=(byte)girilenSayi;

        System.out.println("girdiğiniz değerin sistemdeki karşılığı :" + donusenSayi);//bu çıkan sayıyı
        //-128 ile 127 arasında bir değer lamasını istiyorsak, -128 ile 127 arasında bir değer olan byte
        //seçtik








    }
}
