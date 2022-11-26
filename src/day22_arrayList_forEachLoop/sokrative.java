package day22_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class sokrative {
    public static void main(String[] args) {
        /*
        add de index yazarsan o index i saga kaydırır belirttigini degeri onun yerine atar
        set  deise ilgili index i tamamen siler ve onun yerine belirttigin degeri yazar.
         */

        ArrayList<String> isim=new ArrayList<>();
        isim.add("A");
        isim.add("B");
        isim.add("C");



        System.out.println(isim.remove(2));//C
        System.out.println(isim.remove("C"));//c yi bulamayacak cunku silmişti ve silemeyecek dolayısıyla
        // false donecek.
        //ama silinmeseydi bize evet gttim buldum sildim delil olarak da true der ve bunu sout ederdi.

        System.out.println(isim.get(0));//A, 0. indeksi direkt yazar yani koseli parantezsiz elementleri yazdırırdı
        // ama direkt listi (isim)i yazdırsaydık list i koseli parantez seklinde yazdıdrırdı.



    }
}
