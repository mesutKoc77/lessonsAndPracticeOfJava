package day45_maps;

import day44_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C03_EntrySet {
    public static void main(String[] args) {
        //11. sınıdftaki mf ogrencilerini no isim soyisim şeklinde yazdırın

        Map<Integer,String> ogrenciMap= ReusableMethods.ogrenciMapOlustur();
        Set<Map.Entry<Integer,String>> entryler=ogrenciMap.entrySet();

        System.out.println("no isim soyisim");

        for (Map.Entry<Integer,String> each:entryler
             ) {
            String valuesi=each.getValue();
            String[] arrValuesi=valuesi.split("-");
            if (arrValuesi[2].equals(11+"")&& arrValuesi[4].equalsIgnoreCase("mf") ){
                System.out.println(each.getKey()+" " +" "+arrValuesi[0]+" "+arrValuesi[1]);
            }
        }

    }
}
