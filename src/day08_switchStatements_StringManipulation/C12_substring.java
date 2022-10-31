package day08_switchStatements_StringManipulation;

public class C12_substring {
    public static void main(String[] args) {
        //no 42

        //verilen bir string in istenen bir parçasını dondururu.

        String str="Java Guzeldir";

        //va Guzeldir ifadesini yazdır.


        System.out.println(str.substring(2));//bu şu demek, str nin 2. indeksinden başlamak
        //kaydıyla bana dondur demek yani "va Guzeldir"

        //son 3 karakteri yazdır.


        System.out.println(str.substring(10));//dır//dinamik degıldır bu yontemi str degıısrse bu da
        //degısır

        //bunun dinamik çözümü ise soyle

        System.out.println(str.substring(str.length() - 3));//dir//burda şunu dedik, toplam uzunlugunu
        // bul
        //ve burdan sondan üçünçüsünden itibaren substring yap.
        //substring in mantıgı; ilgili degerin belli bir bolumunu yazdırmaktır. bu dinamik oldu zira biz str
        //nin deger atamasını farklılaştırsak da yine gidecek toplam uzunlugun son 3. sunu bulacak, ve ondan
        //itibaren substring yapacak. //diğer mantık ise şu, bunun anlamı baştan başla 13-3 kadar say ve
        //buldugun andan itibaren yazdır.ki baştan 10. da d ye tekabul ediyor. d den itibaren de "dir" dir.
        //ornegın sondan 7. sinden itibaren yazdır deseydik. once tum uzunlugu bulacak ondan istenen sondan
        //sayısı çıkartılacak ve noktadan itibaren yazdırmaya başlayack. Çözüm:

        System.out.println(str.length());//13 karakter var.(fakat hangi karakter kaçıncı sırada diye bilmek
        //istersek tabii ki saymaya 0 dan başlayacagız.
        System.out.println(str.substring(str.length() - 7));//uzeldir.//saglamasını yapalım
        //13-7=6 yani baştan 6. karakter den itibaren anlamı çıkıyor. J harfi 0. a harfi 1. ve ... u harfi
        // de altıncı karaktere tekabul ediyor.

       //sondan birinciden itibaren yazdırın

        System.out.println(str.substring(str.length() - 1));//r//sondan biirnciden itibarrn yazdır demek
        //

        System.out.println(str.substring(str.length())); // tüm karakter sayısı kadar ki kadardan başla ve
        //yazdır dersen hiçlik yazar.

        //System.out.println(str.substring(14)); //StringIndexOutOfBoundsException//yani string in karakter
        //adedinden fazlasını yazdıramazsın.

        System.out.println(str.substring(0));//yani 0. index ten itibaren 0. index dahil yazdır
        // demek.//yani Java Guzeldir.







    }


}
