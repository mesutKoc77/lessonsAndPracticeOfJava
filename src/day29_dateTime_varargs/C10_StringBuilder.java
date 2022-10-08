package day29_dateTime_varargs;

public class C10_StringBuilder {
    public static void main(String[] args) {

        /*
        java da metinsel ifadeler için 3 class vardır
        1 string, ımmutable dır.
        2 string builder, muiti thread(aynı anda birden fazla işlem yapmak) degiller ve bundan dolayı hızldırlar.
        genelde bankaıclık vb de string builder kullanılır.
        3 string buffer, multu thread yani çok amaclı olduklarından yavaştırlar.

         */

        //string builder aasıl kuurlur

        StringBuilder sb1=new StringBuilder();
        //bunun kapasitesi 16 dır
        System.out.println(sb1.capacity());
        StringBuilder sb2=new StringBuilder("Ali Can");
        System.out.println(sb2.capacity());//7
        StringBuilder sb3=new StringBuilder(7);
        //10 kapasiteli string builder ouşturdum ve sonradan ona atamalar yapabilecegm

        sb3.append("Ali Can");
        System.out.println(sb3.capacity());//7
        sb3.append(" iyi adamdir.");
        System.out.println(sb3.capacity());//20
        sb3.append("Bunu herkes bilir");
        System.out.println(sb3.capacity());//42//ikinci kapasite arttırımdan sonra iki katının iki fazlası arttırıyr


    }
}
