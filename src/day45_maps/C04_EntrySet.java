package day45_maps;

import day44_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_EntrySet {
    public static void main(String[] args) {
        /*
        10. sınıftaki ogrencilerin no, isim, soyisim ve bolum lerini bir liste olarak kullanıcıya yazdırın.
         */

        //burda her ikisini birden yani mhem key hem de value yi beraber istediği için Entry Set i kullanmlıyız.

        Map<Integer, String> ogrenciMap= ReusableMethods.ogrenciMapOlustur();
        System.out.println("no, isim, soyisim, bolum");

       Set<Map.Entry<Integer,String>> entrySetleri= ogrenciMap.entrySet();

       String valueleri;//bunları loop un dışında oluştrudum cunku, loop un scope unda kalmasını ve surekli loop un içinde
        //donerkken yeni objeler oluşturmasın.
        String[] valueArr;

        for (Map.Entry<Integer,String> each:entrySetleri
             ) {
             valueleri=each.getValue();
            valueArr =valueleri.split("-");

           if (valueArr[2].equals(10+"")){
               System.out.println(each.getKey()+" "+valueArr[0]+" "+valueArr[1]+" "+valueArr[4]);
           }

        }


    }
}
