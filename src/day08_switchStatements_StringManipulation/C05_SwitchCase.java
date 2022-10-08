package day08_switchStatements_StringManipulation;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
        // no 49

        // Soru 6- Kullanicidan ay ismini alip mevsimi yazdirin.

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen ay ismini giriniz");
        String aslindakullaniciningirdigiayismi=scanedilen.next();//KULLANICI İSİM GİRER
        String sonayismi=aslindakullaniciningirdigiayismi.toLowerCase();//AMA KUCUK BUYUGE DİKKAT EDEMEYECEGI
        //İÇİN, HEPSİNİ KUUCK HARFE DONUSTURUDK VE SWİTCH İ DE BU VARİABLE ATAMA YAPARAK BINAMIZI KURDUK.


        switch (sonayismi) {
            case "ocak":
            case "şubat":
            case "mart":
            case "nisan":
                System.out.println("Girdiginiz ay olan "+ aslindakullaniciningirdigiayismi +", SONBAHAR'dadır")
                ;break;
            case "mayıs":
            case "haziran":
            case "temmuz":
            case "ağustos":
                System.out.println("Girdiginiz ay olan "+ aslindakullaniciningirdigiayismi +", KIŞ'tadır")
                ;break;
            case "eylül":
            case "ekim":
            case "kasım":
            case "aralık":
                System.out.println("Girdiginiz ay olan "+ aslindakullaniciningirdigiayismi +", İLKBAHAR'dadır")
                ;break;
            default:
                System.out.println("Yanlış Bilgi Girdiniz");

        }







    }
}
