package day21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C10_removeAll {
    public static void main(String[] args) {
        List<String> liste=new ArrayList<>();
        liste.add("Fatih");
        liste.add("Levent");
        liste.add("Esra");
        liste.add("Seher");

        System.out.println(liste);

        List<String> hedef=new ArrayList<>();
        hedef.add("Fatih");
        hedef.add("Levent");

        //hedef'in tamamnını, liste variable ının içinden silelim.

        liste.removeAll(hedef);
        System.out.println(liste);//[Esra, Seher]

        liste.addAll(hedef);//burda ise "hedef" variable inin tamamnını "liste" ye tekrar ekledi.
        System.out.println(liste);//[Esra, Seher, Fatih, Levent]

        System.out.println(liste.equals(hedef));//bu iki liste birbirine eşit mi?

        System.out.println(liste.indexOf("Levent"));//3//yani levent in index i nedir? bana int döndürdü.


    }
}
