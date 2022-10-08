package day02_scanner_dataCasting;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini yazdirin.
       //mesut un çözümü
        Scanner scan=new Scanner(System.in);
        System.out.println("a kenar uzunluğunu giriniz");
        double akenar=scan.nextDouble();
        System.out.println("b kenar uzunluğunu giriniz" );
        double bkenar=scan.nextDouble();
        System.out.println("dikdortgeninAlanı :" + akenar*bkenar);

        //hocanın çözümü
        System.out.println("dıkdrtgenin bir kenarını giriniz \nbirinci kenarı girdikten sonra entera basınız");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        System.out.println("diktorgenınAlanı :" + kenar1*kenar2);





    }
}
