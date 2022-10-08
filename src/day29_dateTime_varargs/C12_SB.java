package day29_dateTime_varargs;

public class C12_SB {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Veli Can");

        sb1.delete(3,6);//yani 3. indeks ile 6. indeks arasını sil ve yaz dedikk. 6 haric
        System.out.println(sb1);//Velan
        //şimdi direkt bir indeksi silsin

        sb1.deleteCharAt(4);
        System.out.println(sb1);//Vela

        //vela dan sonrayı tamın kelimesini ekleyelim

        sb1.insert(4,"tamin");
        System.out.println(sb1);//Velatamin

        sb1.replace(0,3,"gel");//vel yerine gel yazalım
        System.out.println(sb1);//gelatamin
        sb1.reverse();
        System.out.println(sb1);//nimataleg

        /*
        burda dikkat edelim atama yapmadan sadece method ları kullanarak Stringbuilder lar degişiyor
        sb1.deleteCharAt(4);
        gibi
        cunku string builder lar mutable idi ve degişebişlirlerdi ama stringler de degişkilkil yapmak isteseydik
        onları atama yaparak degiştirmemiz gerekiyordu cunku onlar ımmutable idi.
         */

        /*9
        StringBuilder sb3=new StringBuilder(5+7+"Java"+4+5);//12Java45

        String isim="Mesut";
        sb3.append(isim,2,4);//12Java45su
        sb3.delete(4,6);//12ja45su
        System.out.println(sb3);//12ja45su

         */

       /*10
        StringBuilder a=new StringBuilder("kelime");
        a.subSequence(2,4);//bu string methodu oldugundan ımmutable oldugundan degişiklik kabul etmedi.
        a.deleteCharAt(3);
        a.reverse();
        System.out.println(a);//emlek

        */


    }
}
