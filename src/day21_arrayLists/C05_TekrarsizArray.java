package day21_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_TekrarsizArray {
    public static void main(String[] args) {
         /*
           Verilen bir integer array'deki tekrar eden elementleri
           sadece 1 tane yapip, array'i guncelleyin
         */
        int[] arr = {1,2,3,2,4,2,1,4,2,3,4,1,3,1,4,3,2};
        // output [1,2,3,4]

        List<Integer> benzersizList=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {

            if (!benzersizList.contains(arr[i])){
                benzersizList.add(arr[i]);
            }
        }
        System.out.println("Listin degeri"+benzersizList);

        int[] benzersizArr=new int[benzersizList.size()];
        for (int i = 0; i < benzersizList.size() ; i++) {
              benzersizArr[i]=benzersizList.get(i);
        }
        arr=benzersizArr;
        System.out.println("arr nin son hali"+Arrays.toString(arr));

    }
}
