package day18_arrays;

import java.util.Arrays;

public class C02_ArrayTumElementleriYazdirma {

    public static void main(String[] args) {

        int [] arr={3,5,7,10};
        //ARRAY ın tum elementlerini yazıdrlaım

        System.out.print(arr[0]+" ");
        System.out.print(arr[1]+" ");
        System.out.print(arr[2]+" ");
        System.out.print(arr[3]+" ");
        System.out.println(" ");

        //ama bunun daha pratik bir yolu olmalı, array ın tum elemntlerini yazdırdım.


        for (int i =0; i < arr.length ; i++) {
            System.out.print(arr[i] +" ");
        }

        //eger arrayi yazdırmak isterse

        System.out.println(arr);//[I@7f690630 arrayi yazdıramadık cunku referans ları yazdırdık. yazdırmak için ise;

        //eger yazdırmak istiyorsak arrays class ından hazır method kullanmaız gerekiypr

        System.out.println(Arrays.toString(arr));//[3, 5, 7, 10]//yani string e cevirdik ve yazdırdık hepsini.
        //arrays class a gittik ve string e cevirrerk iligili arrayi yazdırdık.

        //arrayler primitiv data turlerin degerlerini barındırrırken non primitve objelerin ise
        // referanslarının barındırırlar. cunku non primitiv ler cok ciddi yer kaplabilirler. dolayısyıla referanslarına
        //gider o referanslardan aldıgımız bilgilerle data lara ulaşabiliriz.

    }

}
