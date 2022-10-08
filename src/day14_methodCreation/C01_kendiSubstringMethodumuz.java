package day14_methodCreation;

public class C01_kendiSubstringMethodumuz {
    public static void main(String[] args) {

        String str="Java Candir";


        /*
         kullanicidan input olarak verilen
         baslangic ve bitis indexlerine gore
         baslangic index'i dahil, bitis index'i haric olacak sekilde
         aradaki harfleri yazdirin

         kullanici baslangic degeri olarak,
         bitis degerinden buyuk bir sayi girerse, hata mesaji verin

         kullanici str'da olan index'lerden daha buyuk bir index girerse
         hata mesaji yazdirin
         */

        int basIndex=2;
        int bitIndex=6;


        //önce hata mesajlarını tanımlayalım

        //bunun yerine şunu yapsak?


        System.out.println(str.substring(2, 6));//method kullandık yani
        String yeniStr=str.substring(1,4);//ava//bunun ile sout arasındaki fark şudur. bir oncekinde sadece yazdırdık
        //ama burda ise artık yeni bir String oluştururak deger ataması yaptık.




        /*
       ilk yöntem uzun uzun yazılmış ama java nın uzun ugraşları sonrası oluşturdugu methodu kullanarak bbunu saniyeler
       içerisinde yaoabiliriz. bir örnek evrelim. Bir yag ureten bir fabrikada, şişeleri alıp kolilere dolduran ve
       7 24 çalışan bir robot yapmak ile bir insanın bu görevi yapması arasında öenmli derecede farklılıklar vardır.
       işte bu trobotu, java nın methodlarına benzetebiliriz.
         */

        //şimdi kenti mehdou muzu oluşturulaım

        kendiSubstringMethodumuz(str,basIndex,bitIndex);
        kendiSubstringMethodumuz(str,3,5);
        kendiSubstringMethodumuz(str,0,1);
        kendiSubstringMethodumuz(str,-2,3);//hata mesajı

        //kendi substring methodumuzu bize string döndurecek şekle getirelim.

        System.out.println(stringDondurenkendiSubstringMethodumuz(str,0,1));//burda istedigimiz indekstekileri
        //String e döndürdüügümzden void siz olan methodu sectik.
        String yenistr=str.substring(1,4);//burda ise artık yeni variable a atama yaptık.

        //System.out.println(kendiSubstringMethodumuz(str,0,1));// buda hata veriri çunku void olarak tanımlamıştık kendi....
        //variable ımızı. dolayısıyla void olanlar sadece yazdırır,dondurme yapmaz. Bu yuzden yukarıda string olarak
        //tanımladıgımız stringDondurenkendiSubstringMethodumuz methodunu kulanırsak dondurur. Yani aldıgımız iki degeri
        //String olarak ortaya çıkmasını istiyorsak ikinci oluşturmdugumuz methodu kullanmalı. void de ise herhangi bir
        //variable degeri yok idi.
        //aslında şöyle bir nuans farkı var. Biz oluşturdugumuz method ile sonucu bir String veya int e döndürmek istiryorsak
        //void siz method kullanmalıyız.


    }

    public static void  kendiSubstringMethodumuz(String str, int basIndex, int bitIndex) {
        if (basIndex>bitIndex){
            System.out.println(" baslangıc index i bitiş indexinden buyuk olamaz");
        }
        else if (basIndex<0 || bitIndex>str.length()-1 || bitIndex<0 || bitIndex>str.length()-1) {
            System.out.println("Geçersiz index kullanımı");
        } else {
            for (int i = basIndex; i <bitIndex ; i++) {
                System.out.print(str.charAt(i)+"");

            }
            System.out.println("");
        }
        System.out.println(" ");

        //return keyword u matematikte ki sonuç gibidir. yani bize bir sonuç döndürüyor.
//bazen yazdırmak ikincil derecede önemli bir konudur. sadece gözlerimizle görmek içindir. ama biizm için önemli olan
//sistemde hafızada yer almaktır. işte methodlar da çoğu zaman bize sonuç döndürür.
// eger atama yoksa degişiklik yoktur.yani oluşturdugunuz method da ya sadece yazdırma yaparsnınz ya da yeni olanı,
//kayıt edip yeni variable a atama yaparak degerde değişkilik yapmış olurusunuz.

//void olanlar sadece yazdırır ama return type ı olanlar bize bir şey dondururu biz de istersek bunun yazdırıırz ya da
//bir variable a atama yaparız. ornek
        /*String str3="Java";
        str.toUpperCase();// bize String dondurur
        System.out.println(str.toUpperCase());//bu ise bize yazdıır
        String str5=str.toUpperCase();//burada ise atrık degişkilik yani atama yaptık.

         */

        /*

        methd oluşturmak için syntax ımız şudur:

        public static void "toplama" (int "sayi1" , int "sayi2") {
        sout (sayi1+sayi2) }

        public= access modifier dır. ve access modifier ın bir çeşididir., yani bu methhoda proje içerisnden nerelerden
        veya kimin ulaşılabilecegını gösterir.kimin ulaşıp ulaşamayacıgını siz belirlersiniz.
        access modifier  çeşitleri şunlardır. notlarda mevcut slaytlarda.
        static kelimesi ise kendine has, özel bir kulup gibi dusunulebilri. main method un içeriisnden bu ancak çağırılabilir.
        void ise: return type dır yani bir şey dondurmuyorsak sadece yazdırıyoprsak void olacak.
        method lar main in dışına yazılır cunku main de
        //bir methoddur.
         */




    }


    public static String stringDondurenkendiSubstringMethodumuz (String str, int basIndex, int bitIndex) {

        //void kullanmaadık cunku biz artık yazdırmak degıl yeni String imize artık ulaşmak istiryoruz. burası çok önemli.
        //yukarıda biz sadece yazdırıyprduk burada ise bu oluşturulanı bir string e kayıt ederek ona ulaşmak istiyprum.
        String istenenSubstring="";
        if (basIndex > bitIndex) {
            System.out.println(" baslangıc index i bitiş indexinden buyuk olamaz");
        } else if (basIndex < 0 || bitIndex > str.length() - 1 || bitIndex < 0 || bitIndex > str.length() - 1) {
            System.out.println("Geçersiz index kullanımı");
        } else {


            for (int i = basIndex; i < bitIndex; i++) {

                istenenSubstring+=str.charAt(i);

            }
            System.out.println("");
        }

        return istenenSubstring;//biz void yamadıgımız için java burda yine String in gelecegını gormek istiyor.
        //void i kullanrısan sadece yazdıravbilirsin
    }









}



