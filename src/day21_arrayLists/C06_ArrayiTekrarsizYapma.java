package day21_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ArrayiTekrarsizYapma {

    public static void main(String[] args) {

      /*
      verilen bir array'den tekrar eden sayilari silip
      benzersiz sayilardan olusan bir array haline getirip
      bize donduren bir method olusturun
     */

      int[] arr = {1,2,3,2,4,2,1,4,2,3,4,1,3,1,4,3,2};
       // output [1,2,3,4]
        tekrarsizYapma(arr);

        int[] deneme = {10,11,11,12,12,12,15,15,15,17,18,19};

        tekrarsizYapma(deneme);

        /*
        int [] yeniarraay=tekrarsizyapalim(arr);
        biz direkt aşağıya inmeden yapmış olsaydık diyecektik ki:
        oluşan degeri yeni arrayimşize atayazagız, methodumuzun isminş yazdık ve ona ekleyecek degeri de içine
        yerleştirdik.
         */
        //deneyelim
        //int [] yeniarraay=tekrarsizyapalim(arr);

        //ya da soyle de olabilirdi, arr=benzersizYapMethodu(arr); yani arr yi sisteme sok ve yeni bir arr çıkart bana.

    }
    //public static int[] tekrarsizyapalim(int[] arr) {
    //}

    public static int [] tekrarsizYapma(int[] array){
        List<Integer> benzersizList=new ArrayList<>();
        int uzunluk=0;
        for (int i = 0; i < array.length ; i++) {
            if (!benzersizList.contains(array[i])){
                benzersizList.add(array[i]);
                uzunluk++;
            }

        }int [] yeniarray=new int[uzunluk];
        for (int i = 0; i < benzersizList.size(); i++) {
            yeniarray[i]=benzersizList.get(i);

        }
        array=yeniarray;
        System.out.println(Arrays.toString(array));
        return array;
    }

}
