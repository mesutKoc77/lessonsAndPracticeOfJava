package day08_switchStatements_StringManipulation;

public class C13_substring {

    public static void main(String[] args) {
        //no 41

        String str="Java Güzeldir.";

        //burdaki konu şu, iki karakter arasını yazdırma. Mesela 1-3 dersek, 1. karakterden başla ve
        //3. kararktere kadar devamm et (3. karakter dahil degıl) ve tamamını yazdır.

        System.out.println(str.substring(1,3));//av//1.si a 3.a ama a dahil degil ve av yazdırdı.

        System.out.println(str.substring(5, 10));//güzel

        System.out.println(str.substring(0, 12));//Java Güzeldi yazın

        //son 3 karakter hariç tüm metni yazdıralım.

        //önce kaç karakterden oluştuguna bakalım

        System.out.println(str.length());//14 karakterden oluşuyor.

        System.out.println(str.substring(0, str.length() - 3));//Java Güzeld----Bu birinci yöntem.
        //yani sondan başla son 3 karakter hariç yaz demek

        System.out.println(str.substring(0, 11));//Java Güzeld-----diğer bir anlamı ise,
        //baştan (0) başla, (14-3)'e kadar yazdır.

        //System.out.println(str.substring(3,3));//Hiçlik. çünkü 3 den başla 3 e kadar /3 haric)

        System.out.println(str.substring(2,3));//sadece 2.index deki harfi yazdıralım.//2 den başla 3 e kadar.
        System.out.println(str.substring(5,6));//sadece 5.index deki harfi yazdıralım//5 den başla 6 ya kadar.

        //System.out.println(str.substring(5, 2)); run time error verir, 5. indeksden sonra 2. indekse gidemez.
        //çunku java ilerler, gerilemez.

        System.out.println(str.substring(3)); //3. index ve sonrasını bana yazdır.




    }
}
