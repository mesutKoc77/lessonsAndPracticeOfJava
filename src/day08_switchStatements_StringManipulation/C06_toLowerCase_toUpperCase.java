package day08_switchStatements_StringManipulation;

import java.util.Locale;

public class C06_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        // no 48
        // String'i istedigimiz sekilde buyuk harf veya kucuk harfe cevirebiliriz

        String str="Java candir";

        System.out.println(str.toUpperCase());//tamamnını buyuk harfe yazdırdık.!!!dikkat sadece yazdırdık yani
        //kelimeyi deger atamasıyla donusturup yeni deger yapmadık.

        //eger kalıcı olarak degişkilik yapmak istiyorsak atama yapmamız gerekiyor. aşağıdaki gibi.

        str=str.toUpperCase();
        System.out.println(str);

        System.out.println(str.toLowerCase());//burda birden fazla lowercase var ve biz ingilizce yi sectik
        //suan için.

        //ama herhangi bir dildeki karşılığıyla yazılmasını isterseniz, locale lower case i ve ulkeyi seçmaleisi
        System.out.println(str.toLowerCase(Locale.GERMAN));
        //türkçe secmek istersek locale nn altındaki forlanguage tag ın içine tr yazmalıyız.

        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr"))); //tr için

        System.out.println(str = str.toUpperCase(Locale.forLanguageTag("Tr")));//burda ise hepsini buyuk harf yaptık ve buyuk harf
        //olarak tr karşılıgı i yi ı ya çevirdi yazmış oldu.
        //turkçe klavye kullandıgın için hata ile karşılaşıyr olabikirsin ama mantık bu şekilde çalışıyr



















    }
}
