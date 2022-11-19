package day19_arrays;

import java.util.Arrays;

public class C11_ArrayaYenidegerAtama {


    public static void main(String[] args) {

        /*
        Bir arrayin uzunlugu degişitrileemez. bu bir kuraldır.
        ancak yapmak istersek, yeni bir array oluşturulur ve bu arrayi eski arrayin yerine arayabilliriz.

         */


        int[] arr = {2, 3, 5};

        int[] yenideger = {4, 5, 6, 8};//ancak yeni syntax şeklinde oluşturulur ve atanırsa atama yapılabilir.

        arr = yenideger;

        System.out.println(Arrays.toString(arr));

        // ornegin arr = [1,2,3] array'ini [1,2,3,4] haline getirmek istersek

        int[] arr1 = {1, 2, 3};
        int[] yeniArr1 = new int[4];

        for (int i = 0; i < arr1.length; i++) {
            yeniArr1[i] = arr1[i];

        }
        yeniArr1[3] = 4;
        System.out.println(Arrays.toString(yeniArr1));


    }


}
