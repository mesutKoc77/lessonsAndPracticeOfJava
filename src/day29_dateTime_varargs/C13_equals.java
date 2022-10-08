package day29_dateTime_varargs;

public class C13_equals {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Ali Can");
        StringBuilder sb2=new StringBuilder("Ali Can");
        String str="Ali Can";

        System.out.println(sb1 == sb2);//false
        System.out.println(sb1.equals(sb2));//false
        System.out.println(sb1.equals(sb1));//true

        /*
        iki farkli objenin birbirne eşit olmsı mumkun degildir.
        */

        //System.out.println(sb1 == str);//dersen java hemen altını çızer cunku elma ile armut karşılaştırrılmaz ve
        //bşirisi non pritmitive ve farklı bir data turu string builder da farkli ve non primitive data turudur.

        System.out.println(sb1.equals(str));//false

    }
}
