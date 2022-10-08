package day20_arrays;
import java.util.Arrays;
public class C02_StringSplitMethodu {

    public static void main(String[] args) {

        String str= "Ali topu at, at Ali at";

        String[] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));//[Ali, topu, at,, at, Ali, at]
        String [] adanAyir=str.split("a");
        System.out.println(Arrays.toString(adanAyir));//[Ali topu , t, , t Ali , t]//a ları buldu işaretledi
        //sonra bunları silecek ve kalanları birer element olarak atayacak.
        System.out.println(kelimeler.length);//6//str da kaç kelime var?

        //str stringinde kullanılan sesli harfleri silin.

        // verilen bir string'i karakterlerine ayirmak istersek

        String [] tumkarakterler=str.split("");
        System.out.println(Arrays.toString(tumkarakterler));//[A, l, i,  , t, o, p, u,  , a, t, ,,  , a, t,  , A, l, i,  , a, t]

        String sesliHarfOlmadan="";


        for (int i = 0; i <tumkarakterler.length; i++) {

            if (!  (tumkarakterler[i].equals("a")||
                    tumkarakterler[i].equals("A")||
                    tumkarakterler[i].equals("e")||
                    tumkarakterler[i].equals("o")||
                    tumkarakterler[i].equals("O")||
                    tumkarakterler[i].equals("E")||
                    tumkarakterler[i].equals("i")||
                    tumkarakterler[i].equals("I")||
                    tumkarakterler[i].equals("u")||
                    tumkarakterler[i].equals("U")||
                    tumkarakterler[i].equals("ü")||
                    tumkarakterler[i].equals("Ü")||
                    tumkarakterler[i].equals("ı"))){
                sesliHarfOlmadan+=tumkarakterler[i];
            }
            //burda uzatmamak için şu şekilde yapılabilirsi. String harf=""; harf=tumkarakterler[i];

        }System.out.println(sesliHarfOlmadan);//l tp t, t l t



    }

}
