package day42_iterator_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C05_Queue {
    public static void main(String[] args) {

        Queue<String> yemekSirasi=new LinkedList<>();//eklenen sona eklnir, silinen baştan silinir.
        yemekSirasi.add("Ali");
        yemekSirasi.add("Veli");
        yemekSirasi.add("Ayse");
        yemekSirasi.add("kemal");
        System.out.println(yemekSirasi);//[Ali, Veli, Ayşe, kemal]
        //dikkat edeleim bunda araya ekleme yok, linked de bir halay gibi dunsundugumuzde araya ekleme yapabiliyorduk ama
        //bundan yani Queue'da araya ekleme methodu bulunmaz.

        System.out.println(yemekSirasi.element());//Ali//beniim listemin ilk indexini bana geitriyor ama silmiyor.
        System.out.println(yemekSirasi);//[Ali, Veli, Ayşe, kemal]

        System.out.println(yemekSirasi.peek());////Ali
        System.out.println(yemekSirasi);////[Ali, Veli, Ayşe, kemal]

        Queue<String> queueDeneme=new LinkedList<>();//queueDeneme boşken bize farkı gosterecek

        System.out.println(queueDeneme.peek());// null
       //System.out.println(queueDeneme.element());// exception

        yemekSirasi.offer("Fatma");
        System.out.println(yemekSirasi);//[Ali, Veli, Ayse, kemal, Fatma]

        System.out.println(yemekSirasi.poll());//ilk elementi yani Ali yi silecek
        System.out.println(yemekSirasi);//[Veli, Ayse, kemal, Fatma]

        System.out.println(yemekSirasi.remove());//Veli
        System.out.println(yemekSirasi);//[Ayse, kemal, Fatma]

        System.out.println(queueDeneme.poll());//null
       // System.out.println(queueDeneme.remove());//exception




    }






}
