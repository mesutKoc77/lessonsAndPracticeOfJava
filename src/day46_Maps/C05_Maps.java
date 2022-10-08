package day46_Maps;

import day44_maps.ReusableMethods;

import java.util.HashMap;
import java.util.Map;

public class C05_Maps {
    public static void main(String[] args) {
        Map<String,Integer> ornekMap=new HashMap<>();
        ornekMap.put("a",3);
        ornekMap.put("b",1);
        ornekMap.put("c",2);
        ornekMap.put("d",5);
        System.out.println(ornekMap);

        System.out.println(ornekMap.containsValue(5));//true

        Map<Integer,String> ogrenciMaps= ReusableMethods.ogrenciMapOlustur();
        System.out.println(ogrenciMaps);
        //{101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Cem-11-B-TM, 104=Ayca-Can-11-B-MF, 105=Ayse-Cem-10-M-Soz}/

        System.out.println(ogrenciMaps.containsValue("Ali"));//false//cunku bir parççasını aradık.
        //containsValue methodu value nin tam deger olarak girilmesi durumunda kontrol mekanizmasını işletebilir.
        //yani
        System.out.println(ogrenciMaps.containsValue("Veli-Cem-11-M-Soz"));//True
        System.out.println(ornekMap.replace("d", 10));//eski degeri 5 idi.
        System.out.println(ornekMap);//{a=3, b=1, c=2, d=10}//emrimizi yerine getirdi.

        System.out.println(ornekMap.replace("a", 5, 10));//false
        System.out.println(ornekMap.replace("a", 3, 10));//true
        System.out.println(ornekMap.replace("b", 1, 3));//
        System.out.println(ornekMap);//{a=10, b=3, c=2, d=10}

        System.out.println(ornekMap.getOrDefault("a", 6));//10
        System.out.println(ornekMap.getOrDefault("m", 8));//m yi default olarak 8 diye atadı.

        System.out.println(ornekMap);//{a=10, b=3, c=2, d=10}


    }
}
