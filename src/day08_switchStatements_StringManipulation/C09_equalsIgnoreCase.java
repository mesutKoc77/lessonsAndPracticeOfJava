package day08_switchStatements_StringManipulation;

import java.util.Scanner;

public class C09_equalsIgnoreCase {
    public static void main(String[] args) {

        /* not 45
        equalsıgnorecase; iki string i karşılaştırırken  buyuk kucuk harf hassasiyetini göz ardı eder.
        yani FatiH ile fatih aynı deger dir der.
         */
        //Ayşe hocanın qa live kanalında yazıklarını dikkate al ve kaydet.

        //3 iisim yazınız ve eşit olup olmadıgını kontrol ediniz

        String isim1="Kadir";
        String isim2="kadir";
        String isim3="Kadir ";

        System.out.println(isim1.equals(isim2));//false cunku buyuk kucuk harf hassaiytei var. bu harflerin
        //sayısal ifadelerinin oldugunu dusunerek hareket et. buyuk k 80 ise kucuk k ise 56 gibi degerdir
        //dolayısıla eşit olarak kabul edilemez
        System.out.println(isim1.equalsIgnoreCase(isim2));//true çünkü ıgnore ettik

        System.out.println(isim1.equals(isim3));//false
        System.out.println(isim1.equalsIgnoreCase(isim3));//false. false cunku burda Kadir'in sonunda boşluk
        //degeri var.

         /*
          Kullanicidan gun ismini alin
          ve girilen gun ismine gore

          hafta ici veya hafta sonu yazdirin
         */

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen Gun ismi Giriniz");
        String gun=scanedilen.next();//bundan sonrasına ihtiyac yok cunku ignorecase kullanacagız.

        if (gun.equalsIgnoreCase("pazartesi") || gun.equalsIgnoreCase("salı")||
        gun.equalsIgnoreCase("çarşamba") || gun.equalsIgnoreCase("perşembe") ||
        gun.equalsIgnoreCase("cuma"))
        {System.out.println("Hatfa İçi");}

        else if ( gun.equalsIgnoreCase("cumartesi") || gun.equalsIgnoreCase("pazar"))
        {System.out.println("Hafta Sonu");}

        else {System.out.println("Girilen Bİlgiler Hatalı");}



    }
}
