package day08_switchStatements_StringManipulation;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
        //no 50

        // Soru 1- Kullanicidan bir rakam alip, rakami yaziyla yazdirin.

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen Rakamı Giriniz");
        int sayi=scanedilen.nextInt();

        switch (sayi) //sayiyi kontrol edecegz
        {
            case 0 //eger rakam sıfırsa 0
                :
                System.out.println("sifir");break;
            case 1:
                System.out.println("bir");break;
            case 2 :
                System.out.println("iki");break;
            case 3:
                System.out.println("üç");break;
            case 4 :
                System.out.println("dört");break;
            case 5:
                System.out.println("beş");break;
            case 6 :
                System.out.println("altı");break;
            case 7:
                System.out.println("yedi");break;
            case 8 :
                System.out.println("sekiz");break;
            case 9:
                System.out.println("dokuz");break;
            default:
                System.out.println("Geçersiz Bilgi Girdiniz");
        }










    }
}
