package day22_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C02_ArrayList {

    public static void main(String[] args) {

        /*
          Verilen String bir listede istenmeyen harfi iceren elementleri
          silin, kalan elementleri bize donduren bir method olusturun.
         */

        List<String> liste=new ArrayList<>();
        liste.add("Eyup");
        liste.add("Yahya");
        liste.add("Esra");
        liste.add("Seher");

        String istenmeyenHarf="y";

        List<String> yeniListemiz=new ArrayList<>();
        yeniListemiz=istenmeyenleriSil(liste,istenmeyenHarf);
        System.out.println(yeniListemiz);
        //[Esra, Seher]

    }


    public static List<String> istenmeyenleriSil(List<String> liste, String istenmeyenHarf) {
        List<String> istenmeyenler=new ArrayList<>();

        for (int i = 0; i <liste.size(); i++) {
            if (!liste.get(i).contains(istenmeyenHarf)){
                istenmeyenler.add(liste.get(i));
            }
        }
        return istenmeyenler;
    }


}
