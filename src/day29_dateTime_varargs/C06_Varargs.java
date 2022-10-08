package day29_dateTime_varargs;

import static day29_dateTime_varargs.C05_Varargs.topla;

public class C06_Varargs {
    public static void main(String[] args) {
        /*
        varargs içinde birden fazla eleewmt bulunan ve array altyapısını kullanan bir objedir.

        int... yazarsak bunun varargs oldugu anlaşılır, kaç tane sayı yazarsak yazalım bunu varargs diye kabul eder.

         */

        topla(3,4); // int[] a=[3,4] = 7
        topla(3,4,5); // int[] a=[3,4,5] = 12
        topla(3,4,5,6,7); // int[] a=[3,4,5,6,7] = 25
        topla(3,5,7,9,7,5,4,1,2);// = 43

    }
    public static void topla(int...a){
        int toplam=0;

        for (int each:a
             ) {
            toplam+=each;
        }
        System.out.println("verilen sayılatın toplamı:"+toplam);
    }

}
