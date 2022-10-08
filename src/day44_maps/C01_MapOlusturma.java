package day44_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_MapOlusturma {
    public static void main(String[] args) {
        /*
    map bir intreface dir

    bizim kullanacaklarımız

    hash map//hash ise arama bulmada hızlıdrır cunku bolumlendirme yapar.biz öncelikle hashmap kullanrırız.

    linkedhasmap//elemtn ekleriz, çıkarırız ve birbirlerine baglar bu elemntleri; hash de oldugu için hızlıdır.

    treemap//mesela map index yapısını desteklemez ama bu treemap sıralama yaparak eleemntleri store ediyordu.

    mapler key ve value kullanr.
    mesela tc yi girdigin an; herşeynize ulaşılabilir. tc bir key; ve bu key lerin uniq olması gerekiyor.
    value ise boyle degil yani uniq olması şartı yok, tek olmalı ama içinde eleentler olabilir.
    bu anlamda array i duşunelim, array tek bir yapıdadır, ama içindeki elemnetleri çoklu yapıdadır.


    map ler de array gibidir; iç içedir...

    her bir element key ve value degerlerinden oluşur.

    value; STring bir vaeriable a eklenecek birçok bilgiyi tabii ki içerebilir.
    mesela biz bir oogrencinin; adı soyadı sınıfını vb tutabiliriz.

    map ile aynı ozelliklere sahip birden fazla obje yi store edebilriiz.
    ornek;
    ogrenci1 dusunelim; nosu; 101, ismi; ali , soyismi; can ve branş; j.dev bilgileri olsun.
    orgrenci 2 de nosu, ismi, soyismi ve branş bilgileri olsun.
    ogrnci3 nosu, ismi, soyismi ve branş bilgileri olsun.

    burda ogrencilerin "no" su tututlabilece en uniq degerdir yani map deki key dir.

    biz burda ogrenci1 için key i no yaptık geri kalan bilgilerin tammaını da value ye eklemeliyiz. ve value tek olmalı.
    Mesela ali, can ve java developer i tek bir degere eklemeliyiz.yani biz bunları bir string e koyabilirim.
    "ali, can, java developer" bu şekilde tek bir String yapılabilir.

     */
    /*
    bir lisedeki ogrenci bilgilerini tutacak bir map oluşturulaım
    ogrencı numarası key
    isim,
    soyisim,
    sinif,
    sube,
    alan     bilgileri de value içerisinde yer alsın.
    key: 101
    value: Ali, Can, 10, H, MF

    bir map oluşturulurken key ve value nun ne olacagına karar verilir. yani hangi data turu olacaklarına karar verilecek.
    value de birden fazla bilgi varsa
    1-
    burdaki bilgilerin sırası

    2-
    bilgilerin arasındaki ayraç standart olmalı


     */

        Map<Integer, String> ogrenciMap=new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-10-H-Mf");
        ogrenciMap.put(102,"Veli-Cem-11-M-Soz ");
        System.out.println(ogrenciMap);//{101=Ali-Can-10-H-Mf, 102=Veli-Cem-11-M-Soz }

        //standardizaayonu saglamak için map de herşeyi method ile yapmak da fayda vardır.















    }
}
