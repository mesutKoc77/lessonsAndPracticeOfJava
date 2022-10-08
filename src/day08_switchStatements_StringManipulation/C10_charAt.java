package day08_switchStatements_StringManipulation;

public class C10_charAt {
    public static void main(String[] args) {
        //no 44

         /* charAt:
          String'in herhangi bir indeksindeki char degerini bize verir
         */


        String str="Java Candir";

        System.out.println(str.charAt(0));//str.chr yazınca hemen altta int index yazıyor bunun anlamı, int bir
        //deger ver bana, "köşedeki char ın anlamı da" ben de sana ondaki char ı dondereyim der.//J
        System.out.println(str.charAt(3));//a
        System.out.println(str.charAt(4));//boşluk
        System.out.println(str.charAt(10));//r

        //System.out.println(str.charAt(20));//.StringIndexOutOfBoundsException
        //eğer var olmayan bir index teki karakteri istersek java hata ver, indeks sınırların dışıdadır, der.

        /*
        str=20;
        str.charAt(20);

        java olusan hataları ya compile sırasında anlar ki bunlara CTE denir,
        veya syntax acısından sorun olmadıgından ancak çalıştırılınca fark eder.Bu tur hatalara
        da RunTimeError(RTE) deniyor.
         */

        //bu str için uzuluk 11 dir.

        //sondan 2. karakteri bulmak için,

        System.out.println(str.charAt(11-2));//i









    }
}
