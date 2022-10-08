package day24_constructors;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1=new Araba();//eşitliğin sagı constructor dır.//bir araba objesi oluşturdukk.
        //şimdi biz "Araba" class ında bulunan default constructor ı çağırdık ve bu standart ozelliktedir.
        //yani standart ozellikler de bir arb1 üretir. ne demek standart ozelli,kte;
        //yani instance olarak ne atanmışssa o dur. ornegın int ilan no; da deger yok ol halde
        //default olarak 0 atanmıştır gibi.
        System.out.println(arb1);//arb1 bir objedir direkt yazdırmak mumkun degil  bu durumda sadece
        //referans ı yazırırdır.day24_constructors.Araba@58ceff1

        //bunu rahatca yazdıramk için to Strıng ile heppsnizi yazırabirlir.generete, toString diyerek
        //tamamını yazıdırabilri.z
        //şimdi çalıştırsak şunu yazıdracaktrı.
        //Araba özellikleri:ilanNo=0, marka='deger atanmadi', model='deger atanmadi', yil=0, fiyat=0

        //bu aşağıdakiler parametresiz constructor ın degerleriyle oluşturuduldu.
        arb1.ilanNo=1201;
        arb1.marka="Opel";
        arb1.model="Corsa";
        arb1.yil=2013;
        arb1.fiyat=10000;
        System.out.println(arb1.toString());

        //şimidye kadar default constructor ı kullandık.

        //ama biz baştan bu degerleri atamak istiryorsak, parametreli constructor oluşturabilirz.


        //şimdi Araba class ın da oluşturudugumuz parametereli constructor ı burada obje
        //oluşturularak refere edelim

        Araba arb2=new Araba(1243,"toyota","Corolla",2008,8000);
        System.out.println(arb2);
        //Araba özellikleri:ilanNo=1243, marka='toyota', model='Corolla', yil=2008, fiyat=8000
        Araba arb3=new Araba(1456,"Mercedes","S320",2000,10000);
        System.out.println(arb3);
        //Araba özellikleri:ilanNo=1456, marka='Mercedes', model='S320', yil=2000, fiyat=10000

        //parametre isimleriyle instance  isimlerinin farklı olması problemlere
        //needen olabilir.
        //parametre isimleriyle instance isimlerinin aynı olması çok daha avantajlıdır
        //ve karmaaya neden olmaz.




    }

}
