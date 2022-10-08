package day45_maps;

import day44_maps.ReusableMethods;

import java.util.Arrays;
import java.util.Map;

public class C01_ValueUpdate {
    public static void main(String[] args) {
        /*
        103 numaralı ogrencinin soyismini yan yapın
         */
        Map<Integer, String> ogrenciMap= ReusableMethods.ogrenciMapOlustur();
        System.out.println("ogrencimap"+ogrenciMap);

        String ilgiliOgrencininBilgileri=ogrenciMap.get(103);

        System.out.println(ilgiliOgrencininBilgileri);//Ali-Cem-11-B-TM

        String [] bunlariArrayeAttik=ilgiliOgrencininBilgileri.split("-");

        System.out.println(Arrays.toString(bunlariArrayeAttik));//[Ali, Cem, 11, B, TM]

        bunlariArrayeAttik[1]="Yan";

        System.out.println(Arrays.toString(bunlariArrayeAttik));//[Ali, Yan, 11, B, TM]

        //bu Array de kaldı, ama array i value olarak map imize ekleyemeyiz

        String yenisi=bunlariArrayeAttik[0]+"-"+
                bunlariArrayeAttik[1]+"-"+
                bunlariArrayeAttik[2]+"-"+
                bunlariArrayeAttik[3]+"-"+
                bunlariArrayeAttik[4]+"-";

        ogrenciMap.put(103,yenisi);
        System.out.println(ogrenciMap);//{101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Yan-11-B-TM-, 104=Ayca-Can-11-B-MF, 105=Ayse-Cem-10-M-Soz}




    }
}
