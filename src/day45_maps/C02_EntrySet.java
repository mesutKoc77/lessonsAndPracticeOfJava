package day45_maps;

import day44_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {
        //Tüm ogrencilerin bilgilerini bir liste şşeklinde kullanıclara yazdırın
        //no isim soyisim sınıf şube bolum
        //101-
        //{101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Yan-11-B-TM-, 104=Ayca-Can-11-B-MF, 105=Ayse-Cem-10-M-Soz}
        //java, maplerde key ve value leri birlikte manıpule edebilmmek için entryClass ları oluşturmuştur.
        //101=Ali-Can-10-H-MF 1. entry
        //102=Veli-Cem-11-M-Soz 2.entry

        Map<Integer,  String> ogrenciMap= ReusableMethods.ogrenciMapOlustur();
        System.out.println("no isim soyisim sinif Sube bolum");

        //map deki tum entry leri bir set e store ettik.
        Set<Map.Entry<Integer, String>> ogrenciEntrySeti=ogrenciMap.entrySet();
        System.out.println("ogrenci entryleri"+ogrenciEntrySeti);//

        for (Map.Entry<Integer, String> each:ogrenciEntrySeti
             ) {
            //ornegin bir entry şu şekildedir----->101=Ali-Can-10-H-MF
           String tempValue =each.getValue();//Ali-Can-10-H-MF
           Integer tempKey=each.getKey();//101
           String [] arrTempValue=tempValue.split("-");//[Ali,Can,10,H,MF]
            System.out.println(tempKey+" "+
                                arrTempValue[0]+" "+
                                arrTempValue[1]+" "+
                                arrTempValue[2]+" "+
                                 arrTempValue[3]+" "+
                                 arrTempValue[4]
            );
            //printf yontemiyyle altalta yazabiliriz. hocanın youtube kanalında var.


        }

    }
}
