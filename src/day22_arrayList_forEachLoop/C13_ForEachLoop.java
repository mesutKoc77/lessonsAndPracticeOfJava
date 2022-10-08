package day22_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C13_ForEachLoop {
    public static void main(String[] args) {
        /*
        Verilen iki array'in elementlerini karsilastirip
        ikisinde ortak olan elementleri ayri bir liste olarak veren
        bir program yaziniz
         */

        int[] arr1={3,5,7,10};
        int[] arr2={2,5,6,10};

        List<Integer> ortaklar=new ArrayList<>();

        for (int each1:arr1
             ) //arr1 in içinden bir stringi aldı tuttu.
        {
            for (int each2:arr2
                 ) //sonra arr2 nin string ini aldık
            { if (each1==each2){
                     ortaklar.add(each1);
            }

            }

        }
        System.out.println(ortaklar);

    }
}
