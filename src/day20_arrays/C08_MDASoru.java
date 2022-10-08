package day20_arrays;

import java.util.Arrays;

public class C08_MDASoru {

    public static void main(String[] args) {
         /*
          Verilen 2 katli bir MDA'de her bir ic array'deki elementleri toplayip
          yeni olusturacagimiz tek katli bir array'in o indexdeki elementi yapip
          yazdirin
         */

        int[][] arr= {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        // output [10, 3, 12, 10, 9]

        // once tek katli yeni array'i olusturalim

        //önce bir kagıda yaz ciz ve dusun sonra kodlamaya gec

        int [] yeniArray=new int[arr.length];

        int elementlerinToplami=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++)
            {
                elementlerinToplami+=arr[i][j];
            }
            yeniArray[i]=elementlerinToplami;
            elementlerinToplami=0;
        }
        System.out.println(Arrays.toString(yeniArray));

        //umutöyalaım ki java da kod yukarıdan asagıya çalışır. once loop u bitirir sonra aşağıya iner
        //onu da bitirdikten sonra yukarı çıkar.










        }





    }
