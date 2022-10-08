package day44_maps;

import java.util.*;

public class C04_Maps {
    public static void main(String[] args) {
        //Subesi B olan ogrencilerin isimlerini bir liste oalrak yazdıran bir method oluşturun.
        //map de index yok

        Map<Integer,String> ogrenciMap=ReusableMethods.ogrenciMapOlustur();

        Collection<String> ogrenciValueCollection=ogrenciMap.values();
        //System.out.println(ogrenciValueCollection);//[Ali-Can-10-H-MF, Veli-Cem-11-M-Soz, Ali-Cem-11-B-TM, Ayca-Can-11-B-MF, Ayse-Cem-10-M-Soz]
        List<String> bsinifindakilerinismi=new ArrayList<>();


        for (String each: ogrenciValueCollection
             ) {
            //System.out.println(each);//each olsaydı bu şekilde value leri geitrecekti. ama bunlarda
            //olmadıgı için ayırmayacaktım. şimdi bunların içindekilerin herbirini array e atayım ki
            //index leri üzerinden işlem yapabileyim.// "Ali-Can-10-H-MF"
            String [] valueArr=each.split("-");
            //System.out.println(Arrays.toString(valueArr));//[Ali, Can, 10, H, MF] bu şekilde ayırdı.
            if (valueArr[3].equalsIgnoreCase("B")){
                bsinifindakilerinismi.add(valueArr[0]);
            }
        }
        System.out.println(bsinifindakilerinismi);//[Ali, Ayca]









    }




}
