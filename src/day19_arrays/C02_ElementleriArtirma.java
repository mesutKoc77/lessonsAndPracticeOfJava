package day19_arrays;

import java.util.Arrays;

public class C02_ElementleriArtirma {

    public static void main(String[] args) {
        //  Soru 1- Verilen bir int array’in tum elemanlarini
        //  istenen bir deger kadar artirip
        //  bize donduren bir method olusturun.
        //  Eski array’i yeni haliyle kaydedin.

        int [] arr={2,4,6,8};
        int artisMiktari=3;

        System.out.println("eski arrayimiz" + Arrays.toString(arr));
        int[]yeniArrayimiz= elementleriArtir(arr,3);
        System.out.println("yeni arrayimiz :"+Arrays.toString(yeniArrayimiz));


    }

    public static int [] elementleriArtir(int[] arr, int artisMiktari) {

        for (int i = 0; i < arr.length ; i++) {
            arr[i]+=artisMiktari; //arr[i]=arr[i]+artisMiktari;
        }

        return arr;//for loop bittiginde bize arr yi geri döndürecek.
    }

}
