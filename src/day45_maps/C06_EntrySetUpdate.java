package day45_maps;

import day44_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C06_EntrySetUpdate {
    public static void main(String[] args) {
        // MF olan bolum isimlerini Say olarak degistirin
        Map<Integer,String> ogrenciMap= ReusableMethods.ogrenciMapOlustur();

        Set<Map.Entry<Integer,String>> entryleri =ogrenciMap.entrySet();//hem key hem de value leri aldım

        String valueleri;

        String[] arrValueleri;
        String yeniValue;

        for (Map.Entry<Integer,String> each:entryleri
             ) {
           // System.out.println("each"+" "+each);//each 101=Ali-Can-10-H-MF
            valueleri=each.getValue();

        arrValueleri=valueleri.split("-");

        if (arrValueleri[4].equalsIgnoreCase("mf")){
            arrValueleri[4]="Say";

        }yeniValue=arrValueleri[0]+" "+arrValueleri[1]+" "+arrValueleri[2]+" "+arrValueleri[3]+" "+arrValueleri[4];

        each.setValue(yeniValue);

        }
        System.out.println(ogrenciMap);

    }
}
