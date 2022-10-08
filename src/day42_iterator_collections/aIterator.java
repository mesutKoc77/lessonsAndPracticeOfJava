package day42_iterator_collections;

import java.util.ArrayList;
import java.util.List;

public class aIterator {

    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        System.out.println(sayilar);//[10, 20, 30]

        //list ve array index yapısın destekledigi için elemntleri kalıcı olarak degiştirebiliriz.
        //listenin tüm elementlerini 5 arttıran bir kod yazınız

        for (int i = 0; i < sayilar.size(); i++) {
            sayilar.set(i,sayilar.get(i)+5);
        }
        System.out.println(sayilar);
        //bu soruyu index kullanmadan yapın.

        }

    }









