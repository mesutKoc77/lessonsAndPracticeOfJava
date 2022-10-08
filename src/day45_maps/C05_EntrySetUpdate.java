package day45_maps;

import day44_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C05_EntrySetUpdate {
    public static void main(String[] args) {

        // Tum ogrencilerin siniflarini bir artirin

        Map<Integer,String> mapOgrenci= ReusableMethods.ogrenciMapOlustur();

        Set<Map.Entry<Integer,String>> enrtyler=mapOgrenci.entrySet();

      String valueleri;
      String [] arrValueleri;
      String yeniler;

        for (Map.Entry<Integer,String> each:enrtyler
             ) {

            //System.out.println("each"+each);//101=Ali-Can-10-H-MF
          valueleri=each.getValue();//Ali-Can-10-H-MF
          arrValueleri=valueleri.split("-");

          arrValueleri[2]=(Integer.parseInt(arrValueleri[2])+1)+"";
           yeniler=arrValueleri[0]+
                   " "+ arrValueleri[1]+" "+
                   " "+ arrValueleri[2]+" "+
                    " "+arrValueleri[3]+" "+" "+
                        arrValueleri[4];

            each.setValue(yeniler);

        }
        System.out.println(mapOgrenci);

    }
}
