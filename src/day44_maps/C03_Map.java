package day44_maps;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C03_Map {
    public static void main(String[] args) {
        //map deki key listesini ve value listesini ayrı ayrı yazdırın

        Map<Integer, String> ogrenciMap=ReusableMethods.ogrenciMapOlustur();
        System.out.println(ogrenciMap);//{101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Cem-11-B-TM, 104=Ayca-Can-11-B-MF, 105=Ayse-Cem-10-M-Soz}

        System.out.println(ogrenciMap.keySet());//[101, 102, 103, 104, 105]

        //şimdi bunu kaydetmek istiryourm, set oldugu için bir set variable ına kayıt edilmeli

        Set<Integer> ogrenciKeySet=ogrenciMap.keySet();

        System.out.println(ogrenciMap.values());//[Ali-Can-10-H-MF, Veli-Cem-11-M-Soz, Ali-Cem-11-B-TM, Ayca-Can-11-B-MF, Ayse-Cem-10-M-Soz]

        //şimdi bunu kaydedelim

        Collection<String> ogrenciValueColl=ogrenciMap.values();
        //103 numaralı ogrenciniin bilgilerini kaydedelim

        System.out.println(ogrenciMap.get(103));//Ali-Cem-11-B-TM

        //103 numaralı ogrencinin bransını yazdırın.

        String ogrenciValue103=ogrenciMap.get(103);

        String [] ogrenciValueArr103=ogrenciValue103.split("-");
        System.out.println(Arrays.toString(ogrenciValueArr103));//[Ali, Cem, 11, B, TM]

        System.out.println(ogrenciValueArr103[ogrenciMap.size()-1]);//TM

        //103 numaralı ogrencinin sınıfını yazdırın.
        System.out.println(ogrenciValueArr103[2]);//11




    }
}
