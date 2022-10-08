package day44_maps;

import java.util.List;
import java.util.Map;

public class C04tekinimethodileyapma {
    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap=ReusableMethods.ogrenciMapOlustur();


        List<String> subedekiOgrencilerList= ReusableMethods.istenenSubedekiOgrencilerListesiOlustur(ogrenciMap,"B");


        List<String> Mdekiler=ReusableMethods.istenenSubedekiOgrencilerListesiOlustur(ogrenciMap,"M");

        System.out.println(ogrenciMap);
        System.out.println(Mdekiler);//[Veli, Ayse]


    }
}
