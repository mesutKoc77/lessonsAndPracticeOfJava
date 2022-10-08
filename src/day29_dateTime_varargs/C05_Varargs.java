package day29_dateTime_varargs;

public class C05_Varargs {
    public static void main(String[] args) {
        //verilen iki sayyı toplayıp yazdıran bir method oluşturun
        /*
        eger verilen sayı adedi degişirse her biri için yeni method oluşturmalı
        bu duurm da pratik olmaz.

         */

        topla(3,5);
        topla(3,4,5);
        topla(3,4,5,6);
    }

    public static void topla(int a, int b) {
        System.out.println(a+b);//8-2 sayının toplamı
    }
    public static void topla(int a,int b, int c){
        System.out.println(a+b+c);//12---3 sayının toplamı
    }
    public static void topla(int a,int b, int c, int d){
        System.out.println(a+b+c);//12---4 sayının toplamı
    }


}
