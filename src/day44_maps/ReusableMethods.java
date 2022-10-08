package day44_maps;

import java.util.*;

public class ReusableMethods {

    public static Map<Integer, String> ogrenciMapOlustur(){

        Map<Integer, String> ogrenciMap=new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-11-M-Soz");
        ogrenciMap.put(103,"Ali-Cem-11-B-TM");
        ogrenciMap.put(104,"Ayca-Can-11-B-MF");
        ogrenciMap.put(105,"Ayse-Cem-10-M-Soz");

        return ogrenciMap;

    }
    public static Map<Integer, String> mapeOgrenciEkle(Map<Integer, String> ogrenciMap ){
        Scanner scan=new Scanner(System.in);
        String valueOgr="";

        System.out.println("ogrenci ismi giriniz");
        String isim=scan.nextLine();
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();

        System.out.println("ogrenci soyismi giriniz");
        String soyisim=scan.nextLine();
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();

        System.out.println("ogrenci sınıf giriniz");
        String sinif=scan.nextLine();

        System.out.println("ogrenci sube giriniz");
        String sube=scan.nextLine().toUpperCase();

        System.out.println("ogrenci brans giriniz Mf, Soz, TM");
        String brans=scan.nextLine();
        brans=brans.substring(0,1).toUpperCase()+brans.substring(1).toLowerCase();

        valueOgr=isim+"-"+soyisim+"-"+sinif+"-"+sube+"-"+brans+"-";

        System.out.println("ogrenci no giriniz");
        int ogrKey=scan.nextInt();

        ogrenciMap.put(ogrKey,valueOgr);

        return ogrenciMap;

    }


    public static List<String> istenenSubedekiOgrencilerListesiOlustur(Map<Integer, String> ogrenciMap, String subeismi) {

        Collection<String> ogrenciValueCollection=ogrenciMap.values();

        List<String> istenenSubedekiler=new ArrayList<>();


        for (String each: ogrenciValueCollection
        ) {

            String [] valueArr=each.split("-");

            if (valueArr[3].equalsIgnoreCase(subeismi)){
                istenenSubedekiler.add(valueArr[0]);
            }
        }
        return istenenSubedekiler;
    }

    public static List<String> bransmethod(Map<Integer, String> ogrenciMap, String brans) {

        List<String> ilgiliBranstakiler=new ArrayList<>();

        Collection<String> ogrencininValuesi=ogrenciMap.values();

        for (String each:ogrencininValuesi
             ) {
            String[] ilgiliValue=each.split("-");//diger ornekte de bahsetmiştik, şunu getirecek [Ali, Can, 10, H, MF]

            if (ilgiliValue[4].equalsIgnoreCase(brans)){
                ilgiliBranstakiler.add(ilgiliValue[0]+" "+ilgiliValue[1]);

            }

        }

        return ilgiliBranstakiler;

    }

    public static List<String> hangiSinifMethodu(Map<Integer, String> ogrenciMapimiz, int sinif) {

        List<String> ilgiliSiniftakiler=new ArrayList<>();

        for (String each:ogrenciMapimiz.values()
             ) {
            String[] herbirValue=each.split("-");

            if (herbirValue[2].equals(sinif+"")){
                ilgiliSiniftakiler.add(herbirValue[0]+" "+herbirValue[1]);
            }
        }

        return ilgiliSiniftakiler;

    }
}
