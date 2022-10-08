package day38_exceptions;

import java.util.Random;

public class C02_MultiExceptions {
    public static void main(String[] args) {
        /*
        kodumuzu yazarken exception oluşma ihtimali olacak bolum sayisi birden fazla ise;

        exceptionın turlerine bakarız;
        eger bu exception turlerı tamamen farklı ve birbirleriyle ilgili degillerse bu try catch leri ayrı try catch kod blokları
        içerisine alabirliz.
        veya tek bir try ve birden fazla catch blogu kullanabiliriz.
        exceptinonların birbiryle ilişkisi olmadıgından hangisinin once yazıldıgının onemi yoktur.

        ANCAK;
        ŞU NOKTA UNUTULMAMALIDIR Kİ;
        java try blogunu çalıştırırken ilk bulduguu exception da try blogunu çalışmayı durdurur
        try blogundaki bazi kodlar çalışmayabilir.

        peki eger exceptionlarımız birbirlriyle ilgiliyse bu durumda nasıl bir yontem takip ederiz.
        bunu yeni bir class acarak takip edelim.
        */

        //0 dan 10 a kkadar rastgele bir sayı seçin ve  str ve arr nin o index e sahip elmentini yazdırın.


        String str="Java";
        int [] arr={3,4,6,8,9};

        Random rastgele=new Random();
        int rastgeleSayi=rastgele.nextInt(10);

        System.out.println(rastgeleSayi);

        /* 1. ihtimal: ayrı ayrı try catch blogu kullanmak
        try {
            System.out.println(str.substring(rastgeleSayi, rastgeleSayi + 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index String in sınırları dıışındadır");
        }
        try {
            System.out.println(arr[rastgeleSayi]);//burda rastgele sayılardan 7 yi secti ama arr de 7. indeks olmadıgından
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index arrayın sınırları dıışındadır");
        }
        System.out.println("ıyı gunler");
        //exception fırlattı, işte bunu biizm han try catch e eklersin ve handle ederiz.

         */
        /* 2.ihtimal
        oluşabilecek tum hataları kapsayacak bir exception belirleriz ve ona yukleriz fakt bu durumda spesifik hatanın ne oldugu
        nu bilmemiz mumkun degildir

        try {
            System.out.println(str.substring(rastgeleSayi, rastgeleSayi + 1));
            System.out.println(arr[rastgeleSayi]);
        } catch (Exception e) {
            System.out.println("Beklenmedik bir durum oluştu");
        }

        3.ihtimal hocaya gore en makulu
        bir tane try blogu birden fazla da catch blogu oluşturulmalıdır. unutmayalaım bunlar birbirinden bagımsız
        */

        try {
            System.out.println(str.substring(rastgeleSayi, rastgeleSayi + 1));
            System.out.println(arr[rastgeleSayi]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index arrayın sınırları dıışındadır");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index String in sınırları dıışındadır");
        }
     /*
     exception larda yakalama kapasitesi en fazla olan aşağıda olmalı, yakalama kapasitesi az olan ise yukarıda olmalı.
    ama aynı turden olanlar için bu gecerlidir. mesela array ile String aynı degerler olmadıgı için yakalanacak seyler
    farklı olacagı için  sıralama da onemli degil.
     */




    }
}
