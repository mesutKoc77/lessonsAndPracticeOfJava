package day43_collections_sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C02_Set {
    /*
        Soru :  Verilen bir array’deki tekrar eden elementleri silerek,
        her element’den sadece bir tane olacak sekilde yeni bir array olusturun.

         */
    public static void main(String[] args) {


    int[] arr= {2,3,4,2,6,4,5,3,2,4,6,5,7,9};

    Set<Integer> gecici=new HashSet<>();

        for (Integer herbiri:arr
             ) {
            gecici.add(herbiri);

        }
       // System.out.println(gecici);//[2, 3, 4, 5, 6, 7, 9]

        //set methodu uniq oolarak bize degerler verdiginden içinde aynı olanları sildi ama burda constructor olan hashset
        //yapıyor, aynı grupta olan uniq yap ve sil dedik

        //şimdi bu oluşan gecici variable listini array e çevrielim.

        arr=new int[gecici.size()];//eski array e yeni boyutta bir array atadım.

        //şimdi set olan gecici de ki tum elemntleri yeni arrayşmze atayalım ama set de index yoktu onun için yeni
        //bir index oluşturmalıyımö

        int index=0;

        for (Integer each:gecici
             ) {
            arr[index]=each;
            index++;

        }
        System.out.println("arr nin son hali: "+Arrays.toString(arr));//[2, 3, 4, 5, 6, 7, 9]


    }

}
