package day47_Project;

import java.util.Scanner;

public class Depo {
    static Scanner scan=new Scanner(System.in);

    public static void anaMenu() throws InterruptedException {

        String tercih="";
        do {
            System.out.println(
                    "YILDIZ KOLEJİ \n"+
                            "ANA MENU \n"+
                            "\n"+
                            "\t 1-Okul Bilgileri goruntule\n     2-Ogretmen Menu \n "+
                            "\t 3-Ogrenci Menu\t\t \n"+
                            "\t Q-CIKIŞ\n");

            System.out.println("lutfen tercihinizi giriniz");
            tercih=scan.nextLine();

            switch (tercih){
                case "1":
                    okulBilgileriniYazdir();
                    break;
                case "2":
                    ogretmen.ogretmenMenu();
                    break;
                case "3":

                    break;
                case"q":
                case"Q":
                    break;
                default:
                    System.out.println("Lutfen gecerli bir tervih giriniz");


            }


        } while (!tercih.equalsIgnoreCase("q"));
        projeDurdur();

    }



    public static void okulBilgileriniYazdir() throws InterruptedException {
        System.out.println(
                "YILDIZ KOLEJİ \n"+
                        "\t\t Adres : "+ Okul.adres+
                        "\n\t\t Telefon :"+Okul.telefon);
        Thread.sleep(5000);

    }

    public static void projeDurdur() {
        System.out.println("projeden çıktınız");
    }


}
