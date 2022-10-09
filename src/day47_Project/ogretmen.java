package day47_Project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ogretmen {
    static Scanner scan=new Scanner(System.in);
    static Map<String,String> ogretmenlerMap=new HashMap<>();

    public static void feykOgretmenEkler(){
        ogretmenlerMap.put("1543226552", "Ali, Can, 1980, MAtematik");
        ogretmenlerMap.put("9536531266","Veli, Yan, 1981, Fizik");
        ogretmenlerMap.put("6565898913","Ayse, CAn, 1982, Kimya ");
        ogretmenlerMap.put("7645646454", "Ali, San, 1983, Kimya");
        ogretmenlerMap.put("5124653154","Alp, Yan, 1984, Matematik");

    }
    public static void ogretmenMenu() throws InterruptedException {
        String tercih="";
         {
            do {
                System.out.println("============= YILDIZ KOLEJI =============\n" +
                        "=========== OGRETMEN MENU ============\n" +
                        "\n" +
                        "\t   1- Ogretmenler Listesi Yazdir\t\n" +
                        "\t   2- Soyisimden Ogretmen Bulma\n" +
                        "\t   3- Branstan Ogretmen Bulma\n" +
                        "\t   4- Bilgilerini Girerek Ogretmen Ekleme\n" +
                        "\t   5- Kimlik No Ile Kayit Silme \t\n" +
                        "\t   A- ANAMENU\n" +
                        "\t   Q- ÇIKIŞ\n");
                tercih=scan.nextLine();

                switch (tercih){
                    case "1":
                        ogretmenlerListesiYazdir();
                        break;
                    case "2":
                        soyIsimdenOgretmenBulma();
                        break;
                    case "3":
                        branstanogretmenbulma();
                        break;
                    case "4":
                        ogretmenEkleme();
                        break;
                    case "5":
                        ogretmenSil();

                        break;
                    case "a":
                    case "A":
                        Depo.anaMenu();
                        break;
                    case "q":
                    case "Q":
                        break;
                    default:
                        System.out.println("Lutfen gecerli tercih yapınız");

                }

            }while (!tercih.equalsIgnoreCase("q"));
            Depo.projeDurdur();
        }

    }

    private static void ogretmenSil() {
        System.out.println("Silinecek ogretmen kimlik no giriniz");
        String silinecekOgretmen=scan.nextLine();

        String silinecekValue=ogretmenlerMap.get(silinecekOgretmen);


        String sonucValue= ogretmenlerMap.remove(silinecekOgretmen);

        try {
            boolean sonuc = sonucValue.equals(silinecekValue);
        } catch (Exception e) {
            System.out.println("Istediginiz Tc numarasi ile ogretmen bulunamadi");
        }
    }

    public static void ogretmenEkleme() {
        System.out.println("tc no");
        String tcno=scan.nextLine();
        System.out.println("isim");
        String isim=scan.nextLine();
        System.out.println("soy isim");
        String soyisim=scan.nextLine();
        System.out.println("dogumtarihi");
        String dogumtarihi=scan.nextLine();
        System.out.println("brans");
        String brans=scan.nextLine();

        String eklenecekValue= isim +", "+soyisim +", "+ dogumtarihi+ ", "+brans;
        ogretmenlerMap.put(tcno,eklenecekValue);


    }

    public static void branstanogretmenbulma() throws InterruptedException {
        System.out.println("aradiginiz Ogretmenin bransını giriniz");
        String istenenBrans = scan.nextLine();

        Set<Map.Entry<String,String>> ogretmenEntrySet= ogretmenlerMap.entrySet();
        System.out.println("============= YILDIZ KOLEJI =============\n" +
                "======brans ILE OGRETMEN ARAMA ========\n"+
                "TcNo        Isim   Soyisim   D.Yili  Brans");

        for (Map.Entry<String,String> each: ogretmenEntrySet
        ) {
            String eachKey=each.getKey();
            String eachValue=each.getValue();

            String eachValuarr[]=eachValue.split(", ");
            if (istenenBrans.equalsIgnoreCase(eachValuarr[3])){
                System.out.printf("%11s %-6s  %-8s %4s    %s \n" , eachKey,eachValuarr[0],eachValuarr[1],
                        eachValuarr[2],eachValuarr[3]);
            }
        }
        Thread.sleep(5000);
    }

    public static void soyIsimdenOgretmenBulma() throws InterruptedException {

        System.out.println("aradiginiz Ogretmenin soyismini giriniz");
        String istenenSoyisim = scan.nextLine();

        Set<Map.Entry<String,String>> ogretmenEntrySet= ogretmenlerMap.entrySet();
        System.out.println("============= YILDIZ KOLEJI =============\n" +
                "======SOYISIM ILE OGRETMEN ARAMA ========\n"+
                "TcNo        Isim   Soyisim   D.Yili  Brans");

        for (Map.Entry<String,String> each: ogretmenEntrySet
        ) {
            String eachKey=each.getKey();
            String eachValue=each.getValue();

            String eachValuarr[]=eachValue.split(", ");
            if (istenenSoyisim.equalsIgnoreCase(eachValuarr[1])){
                System.out.printf("%11s %-6s  %-8s %4s    %s \n" , eachKey,eachValuarr[0],eachValuarr[1],
                        eachValuarr[2],eachValuarr[3]);
            }
        }
        Thread.sleep(5000);

    }

    public static void ogretmenlerListesiYazdir() throws InterruptedException {


        Set<Map.Entry<String,String>> ogretmenEntrySet=ogretmenlerMap.entrySet();
        System.out.println("============= YILDIZ KOLEJI =============\n" +
                        "=========== OGRETMEN Listesi ============\n");

        String onlarinValuesi;
        String [] onlarinArrsi;
        for (Map.Entry<String,String> each : ogretmenEntrySet
             ) {
            onlarinValuesi=each.getValue();
            onlarinArrsi=onlarinValuesi.split(",");
           System.out.println( "ogretmen Tc no: " +each.getKey() +"\n"+
                                "ogretmen adi:"+onlarinArrsi[0]+"\n"+
                                "ogretmen soyadi:"+onlarinArrsi[1]+"\n"+
                                "ogretmen dogumTarihi:"+onlarinArrsi[2]+"\n"+
                                "ogretmen bransi:"+onlarinArrsi[3]+"\n");

        }
        Thread.sleep(5000);

    }

}
