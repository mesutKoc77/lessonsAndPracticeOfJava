package day19_arrays;

import java.util.Arrays;

public class C12_ArrayeElemanEkleme {

    public static void main(String[] args) {
        /*
        soru 7
        verilen bir array e istenen bir elemani ekleyip bize donduren bir method yazin. Eski arraye yeni
        degeri atayın.
         */

        int[] arr = {3, 6, 8, 11};
        int eklenecekdeger = 10;

        //aynı arraye ekleme yapıp yeni degerini yazacagız. o halde arr ye yine eşitleyeecgız ekleme sonrası. o halde
        //burada yeniden bir atama mevcut oldugundan java bbize return type li bir method oluşturacak; ama bize sadece
        //yazdırsa idi o zaman void type li bir method oluşturAcaktı.
        arr = arrayeElemenEkleme(arr, eklenecekdeger);//bu yontem aşağıya ınmeden nasıl method oluşturulurun cevabi.

        //bir diger yontem
        int[] array = {1, 2, 3};
        int eklemekistedigim = 4;

        yeniarrayyapma(array, 4);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayeElemenEkleme(int[] arr, int eklenecekdeger) {

        int[] yeniArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {

            yeniArr[i] = arr[i];

        }
        yeniArr[yeniArr.length - 1] = eklenecekdeger;

        return yeniArr;
    }

    public static int[] yeniarrayyapma(int[] arr1, int ekleneneleman) {

        int[] yeniArr1 = new int[arr1.length + 1];

        for (int i = 0; i < arr1.length; i++) {
            yeniArr1[i] = arr1[i];
        }
        yeniArr1[yeniArr1.length - 1] = ekleneneleman;

        System.out.println(Arrays.toString(yeniArr1));

        return yeniArr1;
    }

}




