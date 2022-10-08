package day44_maps;

import java.security.Signature;
import java.util.List;
import java.util.Map;

public class C05_Maps {
    public static void main(String[] args) {

        //bransı verilen ogrencilerin isim ve soyiismlerini liste olarak yazdırın.
        //MF dedigimde Ali Can, Ayça Can

        Map<Integer, String> ogrenciMap=ReusableMethods.ogrenciMapOlustur();

        List<String> ilgilibranstakiler=ReusableMethods.bransmethod(ogrenciMap,"Soz");

        System.out.println(ilgilibranstakiler);//[Veli Cem, Ayse Cem]


    }



}
