package day42_iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

    //Tum elementleri itteraotr ile 5 arttıralım.

        ListIterator lit= sayilar.listIterator();
        while (lit.hasNext()){
          lit.set( (Integer)lit.next() + 5 )   ;
        }
        System.out.println(sayilar);

        //list elementlerini sondan başa yazdırın
        //sondan başa gitmek için once, en sona gidilmeli.
        //ustteki loop tan dolayı zaten iterator en sonda.

        while (lit.hasPrevious()){
            System.out.print(lit.previous()+" ");
        }
        System.out.println("");

        //degeri 20 ile 40 arasında olanları silin

        //şimdi iterator ım başta.

        while(lit.hasNext()){

            //if ((Integer)lit.next()>20 && (Integer)lit.next()<40  ) bunu yapamam cunku her next i gordugunde kayacak.
            //dolayısyla next ile bir sayıyı tutmam gerekiyor

            int yukluSayi=(Integer)lit.next();

            if (yukluSayi>20 && yukluSayi<40){
                lit.remove();//list iterator daki sayıyı sil.
            }

        }
        System.out.print(sayilar);//[15, 45]

        //şimdi iterator sonda.


    }

}
