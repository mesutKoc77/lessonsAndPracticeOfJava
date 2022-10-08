package day20_arrays;

import java.util.Arrays;

public class C03_MultiDimensionalArrays {

    public static void main(String[] args) {

        int [] arr={2,3,4};
        int [][] mda={{1,2,3},{3,4},{4,2,5,6}};//kat sayısıbnc akoseli pazarntez koyylmalı. [] []
        /*
        bu array de mesela 2 kat var ve outer arrayi dusunursek int[]={mda[0],mda[1],mda[2]};

        o zaman mda nın eleman sayısı 3 tür.
         */

        System.out.println(mda.length);//3 1.{1,2,3}  2.{3,4}   3.{4,2,5,6}

        System.out.println(mda[0].length);//3//1.si 1 ,2.si 2, 3.sü 3

        System.out.println(mda[1].length);//2

        //en baştaki 1 elemantini nasıl yazdırabilirim.
        System.out.println(mda[0][0]);//1

        //2. 4ü yzdır
        System.out.println(mda[2][0]);//4

        //5 in degerini 9 yapalım
        //2 nin 2 si

        mda[2][2]=9;

        System.out.println(Arrays.toString(mda));//[[I@1d251891, [I@48140564, [I@58ceff1]
        /*
        multidimensional array lerde tek tostring methodu işe yaramaz. Ya tek tek iç içe arrayleri yazdırırz.

         */
        System.out.println(Arrays.toString(mda[2]));

        //veya hepsini yazdırmak ıstersek deepstring i kullanrısın

        System.out.println(Arrays.deepToString(mda));//
    }

}