package day21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_ArrayListOlusturma {

    public static void main(String[] args){
        List<Integer> sayilar=new ArrayList<>();//List, primitive data türlerini kabul etmez, non primitiveleri kabul
        //eder.

        /*
        List interface dir ve intarface lerden obje oluşturulamaz.
        bundan dolayı eşitliğin sagında Liste<>() kullanamayız.
        SAg tarafta List yerine onun child class i olan ArrayList<>() kullanılır.
         */

        System.out.println(sayilar);//[]

        //bir arrayliste elemnetleri tek tek eklemek gerekiyor.

        sayilar.add(24);
        sayilar.add(32);
        sayilar.add(10);
        System.out.println(sayilar);//[24, 32, 10]







    }





}
