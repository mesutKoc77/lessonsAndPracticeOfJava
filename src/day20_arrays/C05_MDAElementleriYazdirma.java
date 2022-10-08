package day20_arrays;

import java.util.Arrays;

public class C05_MDAElementleriYazdirma {



    public static void main(String[] args) {
        // verilen multi imensional bir array'in tum elementlerini yazdiran
        // bir method olusturun


        /*
          multidimensional bir array'in ic elementlerine ulasmak ve
          onlarla ilgili isleme yapmak istedigimizde
          MDA'in kat sayisi kadar ic icice loop'lar olusturmaliyiz
         */

        int[][] arr= {{1,2,3,4} , {3,4,2}, {2,4}};

        elementleriyazdir(arr);
        /*
        mda bir arrayin iç ellementlerine ulaşmak ve onlarla ilgili işlem yapmak istedigimizde
        mda arrayın katsayısı kadar iç içe loop lar oluşturmalıyız.
         */






    }

    public static void elementleriyazdir (int[][] arr) {
        for (int i = 0; i < arr.length ; i++) {
            {
                for (int j = 0; j <arr[i].length ; j++)
                {
                    System.out.print((arr[i][j])+" ");
                }
            }

        }
    }


}
