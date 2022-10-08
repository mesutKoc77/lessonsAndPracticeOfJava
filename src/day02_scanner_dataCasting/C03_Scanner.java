package day02_scanner_dataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.
        //Çözüm: Sonuçta burada kullanıcdan bilgi almak istiyorsun dolayısıyla burda bir scanner
        //objesi oluşturman gerekiyor.

        Scanner scan=new Scanner(System.in);
        //şimdi dılarıdaki kullanıcıya bir mesaj verecegm, onu yonlendirecegim
        System.out.println("Lutfen bir tam sayı giriniz");
        int tamsayi= scan.nextInt();
        //şimdi kullanıcıdan bir ondalıklı sayı ıstersem
        System.out.println("Lutfen ondalıklı bir sayı giriniz");
        double ondalikliSayi= scan.nextDouble();

        System.out.println("girilensayinincarpimi:"+ tamsayi*ondalikliSayi);
        System.out.println("girilensayinintoplami:" + (tamsayi+ondalikliSayi));









    }
}
