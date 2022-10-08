package day08_switchStatements_StringManipulation;

import java.util.Scanner;

public class C02_SwitchCase {

    public static void main(String[] args) {
        //52 no
        /*
         Kullanicidan gun numarasini alip
         gun ismini yazdiran bir program yazin
         */

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Gun numarasını Giriniz");
        int numara=scanedilen.nextInt();

        /*if (numara<=0 || numara>7 ) {
            System.out.println("Yanlış Gün Bilgisi");}
        else if (numara==1) {
            System.out.println("Pazartesi");
        } else if (numara==2) {
            System.out.println("Salı");
        } else if (numara==3) {
            System.out.println("ÇArşamba");
        } else if (numara==4) {
            System.out.println("Perşembe");
        } else if (numara==5) {
            System.out.println("Cuma");
        } else if (numara==6) {
            System.out.println("Cumartesi");
        } else if (numara==7) {
            System.out.println("Pazar");
        } else {
            System.out.println("Giriş Bilgisi Hatalı");
        } //burda else yi eklemeye de bilirsin, çünkü ilk if de bunu belirtmiştin.

        // switch case, uzun if li cumlelelri daha derli toplu ypamak için üterilmiştir.

         */

        switch (numara) //switch dedik ve daha sonra hangi degişkene göre hareket edecegı talımatını verdik ki burada
        //gun numarasını göre hareket et dedik.
        {
            case 1: //eger 1 girerse aşagıdakini döndür ve durdur, durdur ki çünkü aşağıdakiler de sout un içinde oldugundan
                //aşağıdakileri de döndürür, bunu engellenmk için de dondurmek istedigimz talimattan sonra break diyerek
                //durdurup aşağıya geçmesini engellemiş olduk.
                System.out.println("Pazartesi"); break;
            case 2:
                System.out.println("Salı"); break;
            case 3:
                System.out.println("Çarşamba"); break;
            case 4:
                System.out.println("Perşembe"); break;
            case 5:
                System.out.println("Cuma"); break;
            case 6:
                System.out.println("Cumartesi"); break;
            case 7:
                System.out.println("Pazar"); break;
            default:
                System.out.println("geçersiz gun numarası");
        }









    }
}
