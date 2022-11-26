package day21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C07_size_get {

    public static void main(String[] args) {
        String[] arr = {"Fatih", "Levent", "Esra", "Seher"};

        List<String> liste = new ArrayList<>();
        liste.add("Fatih");
        liste.add("Levent");
        liste.add("Esra");
        liste.add("Seher");
        System.out.println(liste);//[Fatih, Levent, Esra, Seher]
        //size methodu bize arr nin uuznlugunu verir
        System.out.println(liste.size());//4

        //listedeki herhangş bşr şndex deki eleman o soyle ulaşırıız

        System.out.println(liste.get(0));//Fatih
        System.out.println(liste.get(1));//Levent

        //add methodun da istedigimiz bir elementei index ni belirterek belirli yere de koyabilriiz.

        System.out.println("add den once" + liste);
        liste.add(2, "Ayse");//2. index e Ayse yi ekle dedik.eski listeden hiçbir şey silmiyor.
        System.out.println("add den sonra" + liste);//[Fatih, Levent, Ayse, Esra, Seher]

        //set ise eski index dekini siler yenisini yazar ve update eder.

        liste.set(2, "Yasar");//yani 2. indexdeki Ayseyi silecek yerine Yasar gelecek

        System.out.println(liste);//[Fatih, Levent, Yasar, Esra, Seher]


    }


}
