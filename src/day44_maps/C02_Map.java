package day44_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C02_Map {
    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap=ReusableMethods.ogrenciMapOlustur();

        System.out.println(ogrenciMap);//{101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Cem-11-B-TM, 104=Ayca-Can-11-B-MF, 105=Ayse-Cem-10-M-Soz}

        //kullanıcıdan ogrenci ile ilgili bilgileri alıp map e ekleyin

        ogrenciMap=ReusableMethods.mapeOgrenciEkle(ogrenciMap);

        System.out.println(ogrenciMap);

        /*
        map e ogrenci eklemek için put methou kullanılır
        value girilirken eski elementlerle aynı formtta olmalıdır.
         */










    }


}
