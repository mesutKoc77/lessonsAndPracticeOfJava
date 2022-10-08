package day19_arrays;

import java.util.Arrays;

public class C14_ArraysiralamaMethodlari {

    public static void main(String[] args) {
         /*
        verilen bir String arrati natural order ve ters sıralama yapıp donduren 2 method oluşturun
         */
        String [] arr={"fatih","Muhammet","Jacob","Dalyan","Bora","Esra","Mehmet"};

        arr=naturalSiralama(arr);//arr yi aldım sıraladım ve yine arr ye ekledim.
        System.out.println(Arrays.toString(arr));

        arr=tersNaturalSiralama(arr);

        System.out.println(Arrays.toString(arr));

    }
    public static String[] tersNaturalSiralama(String[] arr) {

        Arrays.sort(arr);

        String[] tersSirali=new String [arr.length];

        for (int i = 0; i <arr.length ; i++) {

            tersSirali[i]=arr[arr.length-1-i];

        }
        return tersSirali;
    }

    public static String[] naturalSiralama(String[] arr) {

        Arrays.sort(arr);
   return arr;
    }

}



