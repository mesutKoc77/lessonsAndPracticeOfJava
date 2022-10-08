package day46_Maps;

import day44_maps.ReusableMethods;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C02_Maps {
    public static void main(String[] args) {
        // Verilen bir ogrenci map’inde her sinifta kacar ogrenci oldugunu yazdiran bir method olusturun.

        /*
        benim çözüm

        Map<Integer,String> mapOgrenci= ReusableMethods.ogrenciMapOlustur();

        int sayacOnuncuSinif=0;
        int sayacOnbirinciSinif=0;
        String [] arrValueleri;

        Set<Map.Entry<Integer,String>> entryleri=mapOgrenci.entrySet();

        for (Map.Entry<Integer,String> each:entryleri
             ) {
            arrValueleri=each.getValue().split("-");
            if (arrValueleri[2].equals(10+"")){
                sayacOnuncuSinif++;
            }
            if (arrValueleri[2].equals(11+"")){
                sayacOnbirinciSinif++;
            }

        }
        System.out.println("10.sınıftaki kişi sayisi" +" "+ sayacOnuncuSinif);
        System.out.println("11.sınıftaki kişi sayisi" +" "+  sayacOnbirinciSinif);

          */


        // Verilen bir ogrenci map’inde her sinifta kacar ogrenci oldugunu yazdiran bir method olusturun.

        Map<Integer,String> ogrenciMap= ReusableMethods.ogrenciMapOlustur();
        Set< Map.Entry <Integer,String>> entryleri=ogrenciMap.entrySet();

        Map<String,Integer> yeniMapimiz=new HashMap<>();//10=5,11=3

        String [] arrValuesi;

        String sinifBilgisi;

        for (Map.Entry<Integer,String> each:entryleri
             ) {
            arrValuesi = each.getValue().split("-");
            sinifBilgisi = arrValuesi[2];
            if (!yeniMapimiz.containsKey(sinifBilgisi)) {
                yeniMapimiz.put(sinifBilgisi, 1);
            } else {
                    yeniMapimiz.put(sinifBilgisi, yeniMapimiz.get(sinifBilgisi) + 1);}

        }
        System.out.println(yeniMapimiz);
//






    }
}
