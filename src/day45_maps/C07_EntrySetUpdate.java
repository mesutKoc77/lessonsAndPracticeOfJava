package day45_maps;

import day44_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C07_EntrySetUpdate {
    public static void main(String[] args) {
        //soyisimleri buyuk harfe çevirin

        Map<Integer,String> ogrenciMap= ReusableMethods.ogrenciMapOlustur();

        Set<Map.Entry<Integer,String>> entryleri=ogrenciMap.entrySet();

        String valueleri;
        String[] arrValueleri;
        String yeniValue;

        for (Map.Entry<Integer,String> each:entryleri
             ) {
             valueleri=each.getValue();

             arrValueleri=valueleri.split("-");

             arrValueleri[1]=arrValueleri[1].toUpperCase();

            yeniValue=arrValueleri[0]+" "+arrValueleri[1]+" "+arrValueleri[2]+" "+arrValueleri[3]+" "+arrValueleri[4];

            each.setValue(yeniValue);
        }
        System.out.println(ogrenciMap);
        //{101=Ali CAN 10 H MF, 102=Veli CEM 11 M Soz, 103=Ali CEM 11 B TM, 104=Ayca CAN 11 B MF, 105=Ayse CEM 10 M Soz}
        /*
        map ile entry arasındaki fark şudur: entry lerde key ve value beraber geliyor
        ama map de ise bunlar ayrı ayrı geliyorlar.
         */

    }
}
