package day21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C09_IntegerRemove {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(15);
        sayilar.add(20);
        sayilar.add(2);

        System.out.println(sayilar);//[10, 15, 20, 2]
        //remoe methodunu, eger listemiz integer data turunde ise o vakit, remove karışabilir cunku
        //index , 2 yazarsan obje olarak 2 degil de 2. index olarak kabul eder. yani aşağıda bize 20 yi siler,
        //2 yi degil.

        sayilar.remove(2);
        System.out.println(sayilar);//[10, 15, 2]

        //eger 10 nu silmek için 10 yazarsak 10. index olarak algılar ve out of bonds exception hatası verir.
        //sayilar.remove(10);

        //doalyısıyla direkt obje yisilmek istersek ilgili obje yi once bir variable a atar ve data turunu tanımla
        //dıktan sonra onu ilgili liste den sileriz.

        Integer silinecek=10;//yani 10 u non primitve e cevirdim ve şimdi de sildim.

        sayilar.remove(silinecek);
        System.out.println(sayilar);//[15, 2]

        sayilar.clear();//tüm listeyi siler
        System.out.println(sayilar);//[]

    }
}
