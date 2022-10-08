package day21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C08_remove {
    public static void main(String[] args) {
        List<String> liste=new ArrayList<>();
        liste.add("Fatih");
        liste.add("Levent");
        liste.add("Esra");
        liste.add("Seher");
        System.out.println(liste);//[Fatih, Levent, Esra, Seher]
        /*
        remove 1 de obje yazılır ve o obje silinir ve de sonuc olarak bana boolean sonuc doner.
         */
        System.out.println(liste.remove("Fatih"));//true dedi cunku evet ben fatihi i sildim dedi. Cunku method u
        //secerken en sag tarafta boolean vardı o şu demek. ben sana silerim ve silip silmedgimi de sout edersen
        //belirtiirim. nitkeim sildigini ture donerek bana belirtti.
        System.out.println(liste);//[Levent, Esra, Seher]

        System.out.println(liste.remove("Kerim"));//burda ise olmayan bir elementi sil talimatini verdim ve
        //silip silmedigini de bana belirt istedim. Olmayan bir elemanı silemecyeceği için de bana false dondu.7


        /*
        remove 2 de ise index ile silersek bize esra yı yani o indexi belirterek silerk. zaten int girersen ben sana
        string dönerim demişti, liste.remove da.
         */

        System.out.println(liste.remove(1));//burda 1. indeksi sil dedik ve sout edersek de sonuc un string
        // oldugunu bildigimden bana 1. indeks olarak "Esra" stringini sildigini belirtmek için "Esra" yı dondurecek.
        System.out.println(liste);//[Levent, Seher]

    }
}
