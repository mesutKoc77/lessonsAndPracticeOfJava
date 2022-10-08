package day22_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C05_ArrayListSort {
    public static void main(String[] args) {
        /*
        veirlen bir listeyi kucukten buyuge sıralayın.
         */
        List<String> liste=new ArrayList<>();
        liste.add("Eyup");
        liste.add("Yahya");
        liste.add("Esra");
        liste.add("Seher");

        Collections.sort(liste);
        System.out.println(liste);//[Esra, Eyup, Seher, Yahya]
    }
}
