package day19_arrays;
import java.util.Arrays;

public class C07_ArrayinIlkNElementiniToplama {
    public static void main(String[] args) {
        //method oluşturma için sureki pratik yapılmalı ve method çok oneöli bir konu
        // verilen int bir array'in istenen ilk n elementini toplayip yazdirin

        int[] arr = {2,4,5,7,1,7,4,7,3,9};
        int kacElement= 4;
        int ilkxelemantoplami=0;
        for (int i = 0; i <kacElement ; i++) {
            ilkxelemantoplami+=arr[i];
        }
        System.out.println(ilkxelemantoplami);
        //ilk x elementi istedigimiz sayı kadar arttırıp yazdıralım.

        int artismiktari=7;

        for (int i = 0; i <kacElement ; i++) {
            arr[i]+=artismiktari;
        }
        System.out.println(Arrays.toString(arr));







    }



}
