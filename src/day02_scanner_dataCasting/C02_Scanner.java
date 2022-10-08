package day02_scanner_dataCasting;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        //Hedef: Kullanıcıdan bir sayı alıp kupunu yazdıralım
        //1. birinci adım scanner objesı oluşturma
        Scanner scan = new Scanner(System.in);

        //2. kullanıcıdan ne ıstedgmz kullanacıga soyelyelım
        System.out.println("Lutfen bir tamsayı giriniz");

        //3. adım istediğimiz datayı koyabilecegimiz bir variable oluşturup kullanıcının
        //girdiği degeri uuygun metodla alalım ve olşuturdugumuz variable a atayıalım.

        int girilenSayi= scan.nextInt();

        System.out.println("Girdiğiniz Sayının Küpü:"+ (girilenSayi*girilenSayi*girilenSayi));




    }
}
