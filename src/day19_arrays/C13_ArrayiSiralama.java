package day19_arrays;

import java.util.Arrays;

public class C13_ArrayiSiralama {


    public static void main(String[] args) {

        /*
        verilen bir String arrati natural order ve ters sıralama yapıp yazdırın
         */
        String[] arr = {"fatih", "Muhammet", "Jacob", "Dalyan", "Bora", "Esra", "Mehmet"};

        //natural ordera göre sıralmak için Arrays class ından sort metodu kullanılır.

        Arrays.sort(arr); //[Bora, Dalyan, Esra, Jacob, Mehmet, Muhammet, fatih] oldu
        System.out.println(Arrays.toString(arr));//fatih en sonda cunku kucuk harf, aski kodlarına göre kucuk harflerin
        //degeri buyuk harflerin degerinden buyuktur. dolayısyla dogal sırlamaaya göre en kuuckten başlayıp en buyuge
        //dogru gitti. sırlamada once buyuk sonra kuuck harf gelir.

        //buyukten kucuge sogru sıralama yapmak istersek, yeni bir array oluşturup o array e ters sıralama
        //ile yerleştirmemiz lazım.

        /*
        yeniarray[0]=arr[6]
        yeniarray[1]=arr[5]
        yeniarray[2]=arr[4]
       yeniarray[sonu]=arr[0]
         */
        String[] tersSirali = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            tersSirali[i] = arr[arr.length - i - 1];
        }
        System.out.println(Arrays.toString(tersSirali));


    }
}
