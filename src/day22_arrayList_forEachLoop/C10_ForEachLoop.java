package day22_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C10_ForEachLoop {
    public static void main(String[] args) {
        /*
          Verilen String bir listede istenmeyen harf iceren elementleri
          silip, kalani kismini bize donduren bir method olusturun.
         */

        List<String> liste = new ArrayList<>();
        liste.add("Eyup");
        liste.add("Yahya");
        liste.add("Esra");
        liste.add("Seher");


        String istenmeyenHarf = "E";

        List<String> yeniListemiz = new ArrayList<>();

        yeniListemiz = eachileistenmeyen(liste, istenmeyenHarf);
        System.out.println(yeniListemiz);

    }


    private static List<String> eachileistenmeyen(List<String> liste, String istenmeyenHarf) {
        List<String> yeniListemiz2 = new ArrayList<>();
        for (String each : liste
        ) {
            if (!each.contains(istenmeyenHarf)) {
                yeniListemiz2.add(each);
            }

        }

        return yeniListemiz2;
    }

}
