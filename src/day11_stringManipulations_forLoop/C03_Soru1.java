package day11_stringManipulations_forLoop;

import java.util.Scanner;

public class C03_Soru1 {
    public static void main(String[] args) {

        //no 67


        /*
          Kullanicidan bir cumle alin
          cumlede ev geciyorsa, "home home sweet home" yazdirin
          cumlede is geciyorsa, "calismak guzeldir"
          ikisini de iceriyorsa "Hem ev lazim hem is"
          hicbirini icermiyorsa "cok calisman lazim" yazdirin
         */

        Scanner scanediilen=new Scanner(System.in);

        System.out.println("Lutfen Bir Cumle Giriniz");

        String cumle=scanediilen.nextLine();

        //çok çok onemli, java yukarıdan aşağıya calışır ve komutları buna gore duzenler. Gorev sırasını yukarıdan
        //aşağıya alır ve uygular. aşağıda once ev e baltı sonra is sonra da digerleini false buldukça aşağıya indi
        //diger bir deyişle true buldugunu hemen yazdırdı. ve aşağıya inmedi. yaniaşağyı göz önune alırsak önce
        //yani java kontrol olarak verecegımız seyi önce, en kısıtlayıcıdan sececgız ve genişe dogru yol aldıracagız.
        //yani en dar küme den en geniş kümeye.Yani önce en ağır şartlardan başlaman gerekiyor.

        if (cumle.contains("ev")  && cumle.contains("is")) {
            System.out.println("Hem ev lazim hem is");}

        else if (cumle.contains("is")) {
            System.out.println("calismak guzeldir");}

        else if (cumle.contains("ev")){
            System.out.println("home home sweet home");}

        else {System.out.println("cok calisman lazim");}

        /*not println de sondaki ln ekrana yazdırılanı bir alta geçirtik ama ln olmasaydı hemen yanına yazdırıdı

        System.out.println("fa");
        System.out.print("b");

         */





    }





}
