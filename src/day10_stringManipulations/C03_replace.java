package day10_stringManipulations;

public class C03_replace {
    public static void main(String[] args) {
        //no 61

        String str="Java ogren, isi kap";

        System.out.println(str.replace('J', 'j'));//java ogren, isi kap//burda sadece soyut olarak de
        //gişikli yapıp gormek istedik ama yeni deger atayıp tamamen degiştirmedik. aşağıda ise tamamen yeni
        //bir deger atayrak yani degiştirererk yeni str mizi belirledik.

        System.out.println(str);//Java ogren, isi kap

        str=str.replace("isi","offer' i");//burda str ye yeni deger atadık ve degiştirdk
        //digerinde ise sadece sout yapıp degısıklık yapmadık. artık yeni str miz " Java ogren, offer' i kap "
        //oldu
        System.out.println(str);

        //yani replace metodunu biz variable degiştirilmiş halini sadece gorebiliriz ya da tamamen degişiklik yaparak
        //yeni deger olarak kabul edebiliriz.

        System.out.println(str.replace("a", "e"));//Jeve ogren, offer' i kep

        //replace metodu şarta uyan tum pacalari degiştirir.

        System.out.println(str.replace("ogren", "k"));//Java k, offer' i kap

        System.out.println(str.replace("a", "aaaa"));//Jaaaavaaaa ogren, offer' i kaaaap

        //tum a ları silmek istesem

        System.out.println(str.replace("a", ""));//Jv ogren, offer' i kp//hiçlik ile
        //degiştirirsem silmiş de olurum

        //olmayan bir String i değiştirmek istesek ne yapar?

        System.out.println(str.replace("Kemal", "Ali"));//Java ogren, offer' i kap//yani değiştirmez.


    }
}
