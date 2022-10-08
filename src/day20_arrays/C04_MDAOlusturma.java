package day20_arrays;

import java.util.Arrays;

public class C04_MDAOlusturma {

    public static void main(String[] args) {
        /*
        bir arrayi oluşturmak veya deer atamak için iki yontemiiz var
        int [] arr={2,4,6};
        int [] arr2= new int [5]; beş uzunlugunda ama deger atanmadıgı için [0,0,0,0,0]
         */

        //mda da bu oluştrumak için aynı ıkı yontem gecerli

        int [][][] arr3katli= {{{2,3},{3,4,5}},{{4}, {5}}, {{8}}};

        int [][] arr2katli=new int[3][2];//dış arrayler 3 elemanlı, iç arrayler ise 2 elemanlı oalcak.

        System.out.println(Arrays.deepToString(arr2katli));//[[0, 0], [0, 0], [0, 0]]
        //2. tur array oluşturmada iç arraylerin uzunlugu eşit olmak zorunda.

        //[[3, 5], [2, 4], [7, 9]] degerlerini atayalım.
        arr2katli[0][0]=3;
        arr2katli[0][1]=5;
        arr2katli[1][0]=2;
        arr2katli[1][1]=4;
        arr2katli[2][0]=7;
        arr2katli[2][1]=9;
        System.out.println(Arrays.deepToString(arr2katli));//[[3, 5], [2, 4], [7, 9]]

        int [][][] arruckatli=new int[3][3][3];//3 adet dış, onun içinde 3 elemanlı onun da içinde 3 elemanlı
        System.out.println(Arrays.deepToString(arruckatli));//[[[0, 0, 0], [0, 0, 0], [0, 0, 0]], [[0, 0, 0], [0, 0, 0], [0, 0, 0]], [[0, 0, 0], [0, 0, 0], [0, 0, 0]]]







    }
}
