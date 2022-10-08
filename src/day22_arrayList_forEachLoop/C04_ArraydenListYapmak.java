package day22_arrayList_forEachLoop;

import java.util.Arrays;
import java.util.List;

public class C04_ArraydenListYapmak {
    public static void main(String[] args) {
        Integer [] arr={2,3,4,5,6};
        List<Integer> list= Arrays.asList(arr);//arrayi list e cevirdik.
        System.out.println(list);//[2, 3, 4, 5, 6]
        /*
        array class ından gelip sonradan list haline gelen arrayler de uzunlguu etkileyecek operasyon yapmamızıa
        musaade etmez. cunku  o array clas ından geliyor.
         */

        //list.add(10);
        //list.remove(0);

        /*
        diğerbir yan etkisi ise;
        bir array den list yaptıgımızda her ikisi de ozdesleşir, list e yaptıgımz degişiklik array e de uygulanır ve
        bu karmaşaya neden olur
         */
        list.set(1,20);
        System.out.println(list);
        System.out.println(Arrays.toString(arr));//ama ben array de dediğişklik yapmamıştım fakat bu method arrayi de
        //degiştirdi.

    }
}
