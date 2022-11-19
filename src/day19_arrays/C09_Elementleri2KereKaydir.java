package day19_arrays;

import java.util.Arrays;

public class C09_Elementleri2KereKaydir {


    public static void main(String[] args) {
         /*
         8. sorudaki saga kaydirma islemini 2 kere yapalim
         */
        int[] arr = {5, 7, 9};
        C08_ElemanlariKaydirma.kaydirma(arr);
        C08_ElemanlariKaydirma.kaydirma(arr);//bu method benden array istiyor ve bana array dondurecek.


    }


}
