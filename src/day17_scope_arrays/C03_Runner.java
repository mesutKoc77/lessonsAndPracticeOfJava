package day17_scope_arrays;

public class C03_Runner {

    public static void main(String[] args) {
        /*
        yeni bir class oluşturduk class3 ve burda class2 de yapılan
        degişkşlikleirn acaba kalıcı degişikilik yapıp yapmadıgını
        tespit edecegz. yani bir class da yapılan değişiklik acaba diger
        class için  de bu degişikikler gecerli mi bunu tespit edecegz

         */
        System.out.println(C01.meslek);//java run time progrmamimng dir yani
        //şu anda run  abastgımda bu class çalışacak ve c03 class ı calışacak
        //bana diyor ki C01 da ki meslege git ve ordan meslegi getir der yani
        //bana Hemsire degerinş getirecek. hangi class çalışıyorsa biz onu
        //takip edecgz diger class llar bizi ilgilendirmiyor.
        C01.meslek="Hemsir";//suan bu class calıtırdam artık meslek hemsir oldu.
        System.out.println(C01.meslek);
        C01 obj=new C01();//hemen c01 den gidip intannce variable lari çekecek.
        //method2, aktifMi, isim, soyisim leri kopyaladı.
        System.out.println(obj.isim);//isim atanmadı
        System.out.println(obj.meslek);//Hemsir

        /*
        ama şimdi obj vasitasıyla gidip c01 den instance variable olan method2 yi
        çağırsam method2 nin içindeki degerleri benim variable larıma atayacak
        mesela isim artık recep, soyiisim lejon, aktifmi true olacak
         */
        obj.method2();//şimdi gittik çağırdık
        System.out.println(obj.isim);//recep oldu
        System.out.println(obj.soyisim);//lejon oldu
        System.out.println(obj.aktifmi);//true oldu.

        C01 obj2=new C01();//yine gidecek c01 e intance leri alacak ve kopyalyacak
        //method2, aktifMi (false), isim(isim atanmadı),soyisim ("Soyisim atanmadi")
        // leri kopyaladı. mesela...
        System.out.println(obj2.isim);//"İsim Atanmadi"
        System.out.println(obj2.meslek);//hemsir

        /*
        sonuç olarak intance lara ulaşmak istersen "obje "oluşturmalı, ama static lere ulaşmak için ""classismi.variableIsmi"
        yolunu takip etmem gerekiyor.
        x methodunun şahsına özelse locale, ama class ı kapsıyor ve static degilse instance dir. dikkat.
         */

    }

}
