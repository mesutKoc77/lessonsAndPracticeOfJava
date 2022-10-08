package day27_passByValue_immutableClass;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        Uygulama : Main method’da verilen fiyat degerine
        %10, %20 ve %30 indirim yaparak,
        indirimli fiyati bize döndüren 3 method olusturun.

        Main method’dan bu 3 method’u arka arkaya cagirip, return edilen fiyatlari yazdirin.
         */

        double fiyat=100;
        System.out.println(indirimYap10(fiyat));//burdan 100 u aldı aşağıdaki indiri10 methoduna atadı ve degeri 90
        //olarak dondurdu. ama oadaki fiya ile buradaki fiyat aynı olmadıgından aşağıdaki indirim20 methoduna gittiginde
        //hemen yukarıdan fiyatı aldı yani 100 u aldı ve yoluna devam etti.
        System.out.println(indirimYap20(fiyat));//burda mesela yukarıdan 90 ı almadı, yine gidip yukarıdaki fiyatın
        //degeerini alarak işleme devam etti. aşağıdak,lerin tamamı bu şekilde. yani orjinal degerini degiştirmiyor.
        //yani buradaki fiyat ile methoddaki fiyat farklılar.
        System.out.println(indirimYap30(fiyat));
        System.out.println(indirimYap20(fiyat));

    }

    public static double indirimYap30(double fiyat) {
        return fiyat*0.70;
    }

    public static double indirimYap20(double fiyat) {
        return fiyat*0.80;
    }

    public static double indirimYap10(double fiyat) {
        return fiyat*0.90;
    }

}
