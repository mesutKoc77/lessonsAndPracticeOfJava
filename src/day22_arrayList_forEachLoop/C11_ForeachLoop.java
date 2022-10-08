package day22_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C11_ForeachLoop {
    public static void main(String[] args) {
        /*
        Verilen bir String array'de
        Her bir elementi kontrol edip
        kelimenin uzunlugu cift sayi ise ilk yarisi,
        kelimenin uzunlugu tek sayi ise
        ortadaki harf dahil ikinci yarisini yeni bir listeye ekleyip yazdiralim
         */

        String[] arr = {"Fatih", "Muhammet", "Bora"};
        List<String> yeniListimiz = new ArrayList<>();
        for (String each : arr
        ) {
            if (each.length() % 2 == 0) {
                yeniListimiz.add(each.substring(0, each.length() / 2));
            } else {
                yeniListimiz.add(each.substring((each.length() )/ 2));
            }
        }
        System.out.println(yeniListimiz);

    }
}




