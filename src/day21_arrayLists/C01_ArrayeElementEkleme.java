package day21_arrayLists;

import day19_arrays.C12_ArrayeElemanEkleme;

import java.util.Arrays;

public class C01_ArrayeElementEkleme {




    public static void main(String[] args) {
        int[] arr = {2, 4, 5};
        //Bu arrayin sonuna 3 elementini ekleyelim.
        //arrayin uuznlugunu degiştirilemzsdi

        arr = C12_ArrayeElemanEkleme.arrayeElemenEkleme(arr, 3);
        System.out.println(Arrays.toString(arr));//[2, 4, 5, 3]

        arr = C12_ArrayeElemanEkleme.arrayeElemenEkleme(arr, 7);
        System.out.println(Arrays.toString(arr));//[2, 4, 5, 3, 7]


    }




}
