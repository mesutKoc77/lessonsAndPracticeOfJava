package day44_maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C06_Maps {
    public static void main(String[] args) {
        /*
        verilen sınıftaki ogrencilerin iism ve soyisimlerini liste olarak donduren method oluşturun
         */

        Map<Integer, String> ogrenciMapimiz=ReusableMethods.ogrenciMapOlustur();
        List<String> sinifListesi =ReusableMethods.hangiSinifMethodu(ogrenciMapimiz,10);
        System.out.println(sinifListesi);//[Ali Can, Ayse Cem]








    }



}
