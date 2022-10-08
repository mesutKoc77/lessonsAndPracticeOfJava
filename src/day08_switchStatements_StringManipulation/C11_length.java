package day08_switchStatements_StringManipulation;

public class C11_length {
    public static void main(String[] args) {
        //no 43

        //string length, degerin kaç karakterden oluştugunu döndürür.

        String str=" Uzunkavaklaraltindayataruyumazoglu";

        System.out.println(str.length());//35

        // bu string'in son karakterini yazdirin

        System.out.println(str.charAt(str.length()-1));//u//önceden ilk harfini bul dedigmiz için
        //direkt 0 yazıp buluyorduk ama şimdi uzun bir ifade oldugu için mesela sondan 4 uncu deyince
        //önce uzunluğu bulup bunun duz devam edince kaçımcı sırada oldugunu java ya belirtmemiz gerekiyor.
        //mesela "kalem" olsun kelimemiz. bunun ilk harfi yani sıfırıncı harfı nedir k, üçüncüsü ise e dir.
        //e ye sondan baktıgımızda ikinci ye tekabul ediyor. Yani toplam uzunluktan yani dört birimden
        //iki yi çıkardıgımızda üçü buluruz, bunun anlamı da java ya şunu soyluyoruz aslında, baştan başla
        //ve üçüncü sıraya denk gelene kadar devam et.

        //sondan ucuncu

        System.out.println(str.charAt((str.length()-3)));//g

        //sondan beşinci
        System.out.println(str.charAt(str.length()-5));//


        String str2="kalem";

        //sondan ikinci harfi yazdır.

        System.out.println(str2.length());//5
        System.out.println(str2.charAt(str2.length()-2));//e //kalem in sondan ikinci degeeri e dir.
        //bu şu demek aslında, mantıgı şu: toplam 5 karakter var. 5-2=3 olur. baştan başla ve 3 karakterden
        //sonraki degeri bana soyle. k 0. a 1. l 2. e 3.
        System.out.println(str2.charAt(str2.length()-3));//l//kalemin sondan üçüncü degeri l dir.
        //bunun mantıgı ise şu: baştan başlasam ne kadar gideyim sorusunun cevabı aslında.
        //yani 5-3=2 kadar baştan başlayarak saymam gerekiyor. k 0 a 1 l 2.

        System.out.println(str2.charAt(str2.length()-4));//burda sondan 4. karakter nedir sorusuyla, baştan
        //1. deger nedir soru aynıdır. Zira str2 nin içersine giriyorsunuz ve baştan başlayarak 5-4=1. degeri
        //bana soyle diyorsunuz. K 0. a 1.










    }




}
