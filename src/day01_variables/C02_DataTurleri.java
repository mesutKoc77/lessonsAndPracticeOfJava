package day01_variables;

public class C02_DataTurleri {


    public static void main(String[] args) {


        boolean emekliOlurMu= false;

        emekliOlurMu=true;

        /*
        boolean true veya false dır, bu ifadeler direkt yazulır
        tek tırnak veya çift tırnak içersini alınmaz
         */

       char harf='e';
       char sayi='3';
       char karaakter='+';

        /*
        char tek tırnak içinde olur ve tek bir karakter barındırır.
         */

        //data turlerine bakabilirsin; byte, short, int, long gibi hangisiini hangi uygulamaya atamak mantıklı
        //byte en kucugu lobg en yukeseği bu durumda hafıza dolmasın diye byte seçilmeli, tabii uygunsa
        //

        //floatın yanına f yazmalısın, double da gerek yok

        float floatSayi=2.3f;
        double doubleSayi=4.555;
        doubleSayi=20;
        System.out.println(doubleSayi);


        /*
        burda 20 degerini de goz onune alırsak data turu int, byte veya short da olabilir.
         dolayısıyla variable ın data turune karar verirken o an atanan degere degıl hangi degerleri
         alabiilecegıni dusunerek karar vermek gerekiyor */

        // verilen 3 tamsayinin ortalamasini hesaplayan bir program yazin

        int sayi1=11;
        int sayi2=23;
        int sayi3=7;

        System.out.println((sayi1+sayi2+sayi3)/3);

        /*
        burada virgullu bır sey cıkacak ama sen int olarak tanıttıgın ıcın sonuc da int çıkacak dolayısıyla
        variable ı sonuca gore ayarlamak gerekiyor.burda java yuvarlama yapmaz int verdigin için sonuçta
        vırgulden sonrasını atar, dolayısyla ortalama sorularının variable nı float
        veya double ile yapmak mantıklı olacaktır.
        */
        float sayi4=11f;
        float sayi5=23f;
        float sayi6=7f;
        System.out.println(); //13.666667

        //float vırgukden sonra altı, double ıse daha fazla yazar
        //float ve doublelarda son kısımlarda yuvarlama yapıyor java
        //doalyısyla float ve doublla calışırken ondalıklı kısımda onemsız hatalar olabılır.
        //detay istersen double 64 bit, float daha az detaylı istersen 32 bit kullanır.

        double sayi7=11;
        double sayi8=23;
        double sayi9=7;
        System.out.println( (sayi7+sayi8+sayi9)/3); //13.666666666666666
        //burda daha fazla ondalık kısım ve dolayısyla bit kullanımı da fazla.

























    }


}
