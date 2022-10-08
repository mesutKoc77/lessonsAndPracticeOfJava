package day08_switchStatements_StringManipulation;

public class C07_equals {
    public static void main(String[] args) {
        //no 47

        /*
          Equals method'u verilen iki String'in
          metin olarak ayni olup olmadigini kontrol eder
         */


        int sayi=20;

        if (sayi==20) {
            System.out.println("eşitlik dogru");
        }

        char harf='a';

        if (harf=='c'){
            System.out.println("harf c dir");}
        else {
            System.out.println("harf c degıldır");
        }

        String str1="Fatih";

        String str2="fatih";

        String str3=new String("Fatih");

        System.out.println("str3 :" +str3);

        System.out.println(str1==str2); //false

        System.out.println(str1==str3);//false

        System.out.println(str1.equals(str3)); //true //str 1 ile str 3 eşit mi?

        System.out.println(str1.equals(str2));//false // str 1 ile str 2 eşit mi?

        /*
        string konusunda net bir kural vardır. eger iki string in metin olarak aynı olup olmadıgını
        kontrol etmek istersek; equals metodu kullanılır.
        "peki eşit eşit tir de yani == de yukarıdaki gibi str1==str3 de neden eşit olmadı."
        java stringleri karşılaştırırken == kullanırsak hem metni hem referansını kontrol eder. ama sadece
        equals kullanırsak sadece metne bakar.

        eğer siz iki metniin bir birine yuzde yuz eşit oldugunu kontrol etmek istiyorsanız
        equals kullanın.
        */



















    }
}
