package day42_iterator_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C06_Deque {
    public static void main(String[] args) {

        Deque<String> stokList=new LinkedList<>();
        //Deque  bir interface dir bu yuzden ondan obje oluşturamayız, onun child i
        //olan LinkedList ten uretim yapacagız yanı ondan constructor alcagz ama data turu Deque  old. ozelligi de Deque  den
        //sececeğiz.

        /*
        Deque; çift taraflı queue demektir.
        yani iki tarftan da eklenebilir silinebilir.

         */
        stokList.addLast("Malzeme1");
        stokList.addFirst("Malzeme2");
        System.out.println(stokList);//[Malzeme2, Malzeme1]

        System.out.println(stokList.pop());//Malzeme2
        System.out.println(stokList);//[Malzeme1]

        stokList.push("Malzeme3");

        System.out.println(stokList);//[Malzeme3, Malzeme1]


    }
}
