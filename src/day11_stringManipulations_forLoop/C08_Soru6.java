package day11_stringManipulations_forLoop;

import java.util.Scanner;

public class C08_Soru6 {
    public static void main(String[] args) {
        //no 72
        /*
         Kullanicidan "isim" ve "soyismini" ayri ayri alin
         ismi daha uzun ise, isim ve soyismi "ilk harf buyuk" kalanlar "kucuk" seklinde yazdirin
         "soyisim daha uzun" ise ismi "ilk harf buyuk" digerleri kucuk", "soyismi buyuk" harflerle yazdirin
         */

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen İsminizi Giriniz");
        String isim=scanedilen.nextLine();
        System.out.println("Lutfen İsminizi Giriniz");
        String soyisim=scanedilen.nextLine();

        int isminuzunlugu=isim.length();
        int soyisminuzunlugu=soyisim.length();

        if ((isim.length())>(soyisim.length())){
            System.out.print(isim.substring(0, 1).toUpperCase() + isim.substring(1, isminuzunlugu).toLowerCase());
            System.out.print(" ");
            System.out.println(soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1, soyisminuzunlugu).toLowerCase());

        }
        else if ((soyisim.length())>(isim.length()))  { System.out.print(isim.substring(0, 1).toUpperCase() + isim.substring(1, isminuzunlugu).toLowerCase());
            System.out.print(" ");
            System.out.println(soyisim.toUpperCase());
        }

        /*
        Diğer bir Yol ise
        substring de ilk rakam başlangıcı ikinci rakam ise ilk rakamdan başla ikinci rakama kadar yazdır ama ikinci rakam
        hariç demek. eger ikinci rakamı hiç yazmazsak, ilk yazılan rakamdan itibaren yazdır demek.
        Dolayısyla şu şekilde de soru çözülebilir.
        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen isminizi giriniz");
        String isim= scan.nextLine();

        System.out.println("lutfen soyisminizi giriniz");
        String soyisim= scan.nextLine();

        if (isim.length()>soyisim.length()){
            System.out.println(
                    isim.substring(0,1).toUpperCase()+
                    isim.substring(1).toLowerCase()+
                    " "+
                    soyisim.substring(0,1).toUpperCase()+
                    soyisim.substring(1).toLowerCase()
            );

        }else {
            System.out.println(
                    isim.substring(0,1).toUpperCase()+
                            isim.substring(1).toLowerCase()+
                            " "+
                            soyisim.toUpperCase()
            );

        }

         */







    }
}
