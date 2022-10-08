package day19_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_Arrayolusturma {

    public static void main(String[] args) {
        // Soru 5- Kullanicidan integer array’in boyutunu ve elementlerini alip
        // array’i olusturan ve bize donduren bir method olusturun.

int[]array=yeniarrayolusturma();
        System.out.println(Arrays.toString(array));
   }

    public static int[] yeniarrayolusturma(){
        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen arrayin uuznlugunu giriniz");
        int uzunluk=scanedilen.nextInt();

        int[] arr=new int [uzunluk];

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("Lutfen"+i+"deki degeri giriniz");
            arr[i]=scanedilen.nextInt();

        }
        return arr;

    }

}
