package day10_stringManipulations;

public class C05_replaceAll {
    public static void main(String[] args) {
        //no 63

        /*
        replace (eski tring, yeni string) eski string lerin tamamını yenisiyle degiştiriyordu.

        */

        String str= "Ja1va Gu2zel2dir13.";

        //burdaki rakamlardan kurtulabilnmek için tek tek replace yazamamız gerekecek, soyle ki


        str=str.replace("1", "");

        str=str.replace("2", "");
        str=str.replace("3", "");

        System.out.println(str);//sayılardan kurtuldum fakat bunun kısa bir yolu olmalı.

        str="J1a2va3 G4u5z6e7l8d9i0r.";

        System.out.println(str);

        /*
        işte replaceAll burada devreye giriyor. Özel olarak tanımlanmış ornegın sayılar, harfler veya hiçlikler
        gibi belli bir tanıma dahil olan özel grupları tamamen ortadan kaldırıp bunların yerine başka
        bir şey atayabilriiz. bunun tek istisnası String lerdir. Yani replaceAll String ler de çalışmaz
        Stringlerin tamamını x ile degiştir komutunu verirsen çalışmaz.
         */
        //regular expressin=düzenlitanımlama, düzenli ifade. Java da regex diye geçer ve metod ların hemen altında
        //gorunurler.

        str=str.replaceAll("\\d", "");

        System.out.println(str);

        //regex e gittik, sayılar için tanımlaama \d
        //şeklinde oldugundan str ın içinde bulunan tum digit leri hiçlik ile degiştiridim.

        str="Java    Guzel bir programlama    dili";

        //boşluklardan kurtulmak istersek. işte boşluklarda belli bir gruba aittir. o zaman replaceAll devreye girer.

        str=str.replaceAll("\\s+"," ");

        System.out.println(str);



    }
}
