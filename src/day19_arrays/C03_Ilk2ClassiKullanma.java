package day19_arrays;
import day17_scope_arrays.C01;

import java.util.Arrays;

public class C03_Ilk2ClassiKullanma {

    public static void main(String[] args) {

        int [] arr={1,4,7,3};
        //bu arrayn elementlerini toplayalım
        System.out.println("Elementrlerin Toplami =" +C01_ElemanlariToplama.elemanlariTopla(arr));
        //zaten C01 de elemanların toplami diye bir method oluştrmuştum ve onu çağırıp yazdırdım.

        int x=4;
        //tüm elementleri x kadar arttırlaım

        System.out.println("eski arrayimiz :"+ Arrays.toString(arr));
        arr=C02_ElementleriArtirma.elementleriArtir(arr,x);//burada ayni işlem yani gittik C02 de oluşturdugumuz
        // methodu çağırdım.
        System.out.println("yeni arrayimiz ise :" + Arrays.toString(arr));

       //array de loop kullanma [5,8,11,7]
        //                      0 1 2 3

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }



    }

}
