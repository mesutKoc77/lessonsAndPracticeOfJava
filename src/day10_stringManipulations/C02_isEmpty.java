package day10_stringManipulations;

public class C02_isEmpty {
    public static void main(String[] args) {
        //no 60

        String str="Java ogren, 70000 euro'yu kap";

        System.out.println(str.isEmpty());//str miz boş mu?//boolean doner ve false olur

        String str2="";
        System.out.println(str2.isEmpty());//str2 boş mu?// boş yani true doner

        String str3="   ";
        System.out.println(str3.isEmpty());//peki str 3 boş mu?false, cunku boşluk var

        System.out.println(str3.isBlank());//true

        System.out.println(str2.length());//0//çünkü sıfır karakter var
        System.out.println(str3.length());//3 cunku 3 karakteri var

        /*
        nall pointer, işaretçi anlamını gelir.
        bu bir deger degğildir ve temel fonksiyonu
        bir string e deger atanmadıgını belirttir. veya işaret eder.
        java da bir string variable a deger atamamamının iki yolu vardır
        ya null ile işaretlerirz
        ya da sadece deklare eder deger atamayız.
        - eger null işaretlersek, null'u yazdırdıgımızda bunun sadece null oldugunu yazdırır ve başka bir
        metod çalıştırırsanız run time error (RTE) verir.

        String str5;
        bunu yazdırırrsak ne yazdırabılırz ne de başka bir kodda kullanabiliriz.bun yazarsANIZ cte hatasıylla
        karşılaşırız.

         */

        String str4=null; //1.yol normalde string çift tırnak içinde olur ve degr atandıgını gosterirdi fakat null degerini
        //atadıgımızdan bu kuralı uygulama yukumlulugumz kalktı.yani deger atanmadı

        String str5;//2. yol. yani biz variable e henuz deger atamadık boş bıraktık, zamanla, kafamdaki projeye göre
        //zaman içinde doldurmak isteyecegm

        String isim1=null;
        String isim2;
        System.out.println(isim1);//null diye işaretleyecek çunku sen bana deger atamadın diyecek.
        //System.out.println(isim2);//        burdada hata verecek çunku hiçbir deger atamadın ve yazdırmayacak
        // ama null demiş olsa idim hiç olmazsa bunun deger atanmadıgını gorurdum.
        //System.out.println(isim1.length());//"NullPointerException" bunu sonuc olarak yazdıracaktı.yani sen isim1 e
        //atamdın ve sadece boşolarak işaretlerdin. dolayısıyla deger atamadın bir ismi herhangi bir metodla kulla
        //namazsın. Sadece bir isim var ama degerr atanmamış oldugunu anlarız.

        //System.out.println(isim1.isEmpty()); bunda Rte hatası verir çunku null olarak beni işaretleryebilirsin
        //ama deger atanmamış oldugun bir şey için de metod kullanamazsın. Burada kod,çalışabilir ama RTE verir.

        //System.out.println(isim2.isEmpty());//ise hiç ama hiç çalışmaz yani cte hatası verir.

        //yani isim1 e bir deger atanmaış sadece işaretlenmiştir. Null bir deger degıldır sadece isim1, null
        //olarak işaretlenmiştir.




    }
}
