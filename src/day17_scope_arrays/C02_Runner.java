package day17_scope_arrays;

public class C02_Runner {

    public static void main(String[] args) {
        /*
        bir class dan başka bir class daki staic variable ve methodlara ulaşmak için "classismi.variableIsmi" yazmak
        yeterlidir.
       bir class  dan başka bir class daki instance variable lara ulaşabilmek için obje (object) oluşturmamız gerekir.
         */

        System.out.println(C01.meslek);//static variable i çektim.
        C01.meslek="Hemsir";//static in ismini degiştirdim.
        System.out.println(C01.meslek);
        C01.method1();//stati methodu çektim.


        C01 obj1=new C01();//şimdi java co1 class ına gitti , tüm instance variable lara ulaştı,onlardan birer kopya
        //alarak obj1 e atadı. Fakat meslek static oldugu için o class a yani tüm class ı kapsyordu.
        /*
        instance variable ları;isim, soyisim, boolean ın ilgili degerlerini obj1 e atadık. bir de instance methd
        vardı yani static olmyan method olan method2 yi de obj1 e atadık.
         */

        obj1.isim="Ayse";//şimdi bu variable lara deger ataması yaptık.
        obj1.soyisim="Yildiz";
        obj1.aktifmi=true;
        System.out.println(obj1.isim);//ismini degiştriik ve Ayse oldu degeri.
        System.out.println(obj1.meslek);//burda ise static in degeri yazıdracagm. Peki static in degeri neydi, hemen
        //class ın ilk satısına gidipi aşağıya dogru ınecegm. bu static deger nerde degişmiş ise orda degerin degiştini
        //belirtmiş olacagım. bu yol static variable degerlerin degişikligini tespit etmek için kullanılır.
        //kontrol ettim ve 16. satırda degiştridigim için artık bu deger "Hemsir" oldu.

        System.out.println(C01.meslek);//statc variable direkt class isminş yazarak ulaşabilririm.
        C01.meslek="Yardimci Doktor";
        C01 obj2=new C01();//şimdi hemen  java girri C01 classdaki instance variable ların bir kopyasınıobj2 ye atadı.
        // ve tabii ki static
        //leri de. ama tabii ki kontrol etmek gerekiyor static vriable larda degişiklik var mı yok mu? varsa o baglamda
        //yazdırabilrisin.

        System.out.println(obj2.isim);//isim atnamadı.
        System.out.println(obj2.meslek);//"Yardimci Doktor" meslek static tir, bu satirdaki degerini bulmak istiyorsunuz
        //yukaırdan asagıya inersiniz ve atamanın oldugu yer varsa onu esas alırsınız ve atanan degeri dikkate alarak evet
        //meslek in adı degişti deriz.

    }
}
