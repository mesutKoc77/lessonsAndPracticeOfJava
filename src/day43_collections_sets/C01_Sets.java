package day43_collections_sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C01_Sets {
    public static void main(String[] args) {
        //constructor olarak set secemeyız cunku o bir interface dir ve obje oluşturulamaz.

        Set<Integer> sayilarKumesi=new HashSet<>();

        sayilarKumesi.add(10);
        sayilarKumesi.add(30);
        sayilarKumesi.add(50);
        sayilarKumesi.add(40);
        sayilarKumesi.add(20);

        System.out.println(sayilarKumesi);//[50, 20, 40, 10, 30]

        sayilarKumesi.add(10);//uniq oldugu için eskisini sildi bunu yazdı
        sayilarKumesi.add(30);
        sayilarKumesi.add(40);

        System.out.println(sayilarKumesi);//[50, 20, 40, 10, 30]. uniq oldugu için element eklenemez.

        //set index yapıısnı desteklemez. zaten uniq onemliydi, rastgele de sıralanbailir.

        List<Integer> sayilarList=new ArrayList<>();
        sayilarList.add(1);
        sayilarList.add(2);
        sayilarKumesi.addAll(sayilarList);
        System.out.println(sayilarKumesi);//[1, 50, 2, 20, 40, 10, 30]









    }
}
