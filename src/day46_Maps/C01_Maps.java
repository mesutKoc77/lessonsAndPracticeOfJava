package day46_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_Maps {

    public static void main(String[] args) {
         /*
        Soru : Verilen bir array’de kullanilan sayilari ve kacar defa kullanildigini yazdirin.
        Input : {1,2,3,4,5,3,4,2,5,1,3,2,4,1}
        output : 1 kullanimi : 3 adet
                2 kullanimi : 3 adet
                3 kullanimi : 3 adet
                4 kullanimi : 3 adet
                5 kullanimi : 2 adet
         */
        int arr[]={1,2,3,4,5,3,4,2,5,1,3,2,4,1,1,1,1};
        Map<Integer,Integer> kullanimSayilariMap=new HashMap<>();

        for (int each:arr
             ) {
            if (!kullanimSayilariMap.containsKey(each)){
                kullanimSayilariMap.put(each,1);

            }
            else {
                kullanimSayilariMap.put(each,(kullanimSayilariMap.get(each))+1);
            }
        }
       Set<Map.Entry<Integer,Integer>> entryleri=kullanimSayilariMap.entrySet();

        for (Map.Entry<Integer,Integer> each:entryleri
             ) {
            System.out.println(each.getKey() + " kullanımı:" +" "+ each.getValue() +" "+ "adet");
        }

    }

}
