package day10_stringManipulations;

import java.util.Scanner;

public class C06_replaceAllSoru {
    public static void main(String[] args) {
        //no 64
        /*
          Kullanicidan ismini, soyismini ve kk numarasini alip
          asagidaki formatta kaydedip, yazdiralim

          M***** T****
          1234  **** **** ****
         */

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen İsim  Giriniz");
        String isim=scanedilen.nextLine();
        System.out.println("Lutfen soyisminizi  Giriniz");
        String soyisim=scanedilen.nextLine();
        System.out.println("Lutfen Kredi Karti Numaranızı Giriniz");
        String kredikarti=scanedilen.nextLine();

        /*adım adım gidelim. Önce ismi alacagız sonra soyismi, daha sonra aralarında boşluk bırakarak yazdıracagız
        sonra ismin ilk harfini buyutup, geri kalanları yani 0. karakterden sonrakileri * yapacagız.
         */

       String yeniisimsoyisim= isim.substring(0,1).toUpperCase()+
               isim.substring(1).replaceAll("\\w", "*")+
               " " +
               soyisim.substring(0,1).toUpperCase() +
               soyisim.substring(1).replaceAll("\\w", "*");

       String yenikk=kredikarti.substring(0, 4) + "**** **** ****";
       System.out.println(yeniisimsoyisim+"\n"+yenikk);

        /*
        burda temel olarak sunu yaptık. ilk harfi substring ile aldık touppercase metodu ile buyuttuk, daha sonra
        geri kalanları da 1.karakterden başlyarak substring metodu ile aldık ve yıldızladık.
         */

    }
}
