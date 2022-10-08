package day27_passByValue_immutableClass;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValue {
    public static void main(String[] args) {
        /*
        Uygulama : Main method’da bir list olusturup elemanlar atayalim.

        2 method olusturup once listeyi, sonra listedeki elemanlari degistirelim.

        - ilk method’da bizim listemiz disinda bir liste olusturup deger atayalim,
        sonra yeni listeyi bizim asil listemize atayalim ve asil listemizi main method’a dondurelim.

        - ikinci method’da bizim listemizin elementlerini degistirip,
        asil listemizi main method’a dondurelim.

        Her iki method call’dan sonra listemizi main method’da yazdirip, degisimi kontrol edin.
         */

        /*
        methodda yapılan degişikilik veya atamlar methodda kalır ve biişzm asıl main methoddan veya diger yerden giden
        variable ımızın degerini etkileyemz. mesela bir sayi yi methoda atasam o method bazında degişkilkk yapar
        donderiri ama atama yapıp da o sayının degerini etkilemez.

         */
        /*
        biizm aşağıda sayilar da method uzerinden yaptıgımz degişkiklk methodun içinde kaldı. yani biiz methoda, asıl Sayilar
        variable ımızı yollamayıp kopyasını yolladık. ve onun uzerınden degişiklikler yaptık. main methodumuzdaki
        Sayilar ımız hep aynı kaldı.
         */

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);
        System.out.println(sayilar);//[1, 2]
        List<Integer> yeniListimiz=birincimethod(sayilar);//evet sayilarin degerlerinin bir kopaysını methoda yolladık
        //methodda ki kurallar cercevesinde bu kopya yeni degerlerini aldı ve buraya geldi
        System.out.println(yeniListimiz);//[11, 12, 13]//ve buraya geleni yazdırdır.
        System.out.println(sayilar);//[1, 2]//fakat asıl olanda yine bir degişiklik yok. yine oylece kaldı.

        sayilar=yenimethodumuz(sayilar);//atama yapmasaydık 1 ve 2 olacaktı ama ki bır ust satırda gorulıyor. ama şimdi
        //8 10 12
        System.out.println(sayilar); //8 10

        System.out.println(elementleriDegistir(sayilar));//[101, 102]
        System.out.println(sayilar);//[101, 102]//peki burada neden tamamen degişti listemiz. Cunku yukarıda variable ımızın
        //içinde deger atıyorduk  ama burda ariabel ın içine girip elementleri degişitrimliş oluruyoryz
        //bri toyota araba dduusunelım arabanın için de a,b,c olsun  dondugunde x,y,z olursa bu durumda araba da degişkilik
        //olmaz ve passbyvalue işlemeye devam eder. yani java arabayı kontrol eder. java diyor ki method a giden ile maine
        // gelen aynı araba oldugundan ben kabul ederim. passs by value arabanın içindekilerle ilgilenmez yani içindeki
        //elementlerle ilgilenmez. D,ger ornekler de 100 veriyorduk methodda 100 için istedigi kadar degiş,klik yapsın
        //degişkiliki method olarak dondururdum ornek 200 olsun, ama sayi nin aslını ben degişitmem yine 100 yaparım diyor.
        //burada da ayni içindeki elemntelerı ben degiştitirmene izin veririm ama arababın  kendi aslını degişitirtmem
        //diyor. pass by value elementleri degil yaniiçindekileri degil objeleri kontrol ediyor.
        /*
        ama ilk iki methodda ne yaptılar methodda, benim asıl variable ımı degiştirip veermek istediler. ben
        bunu kabul etmem.sayılar a gidipp  yeni bir list atadılar.
         */


    }

    public static List<Integer> elementleriDegistir(List<Integer> sayilar) {
        sayilar.set(0,101);
        sayilar.set(1,102);
        return sayilar;
    }

    public static List<Integer> yenimethodumuz(List<Integer> sayilar) {
        List<Integer> yeni=new ArrayList<>();
        yeni.add(8);
        yeni.add(10);

        sayilar=yeni;
        return yeni;
    }

    public static List<Integer> birincimethod(List<Integer> sayilar) {
        List<Integer> yeniListemiz=new ArrayList<>();
        yeniListemiz.add(11);
        yeniListemiz.add(12);
        yeniListemiz.add(13);

        sayilar=yeniListemiz;
        return yeniListemiz;

    }


}
