package day26_staticKeyword;

public class C04_StaticBlock {
    //static blocklar her syden once çalışırlar.

    //bir construtor oluşturulaım
    static int sayi;
    static {
        System.out.println("ustteki static block çalıştı");
    }
    C04_StaticBlock(){
        System.out.println("constructor calıştı");
    }
    static {
        System.out.println("static block calıştı");
        sayi=40;
    }

    public static void main(String[] args) {
        C04_StaticBlock obj1=new C04_StaticBlock();
        System.out.println("sayi:"+sayi);
    }

    /*
    1-java main methoddan once staticc blogu çalıştırır.
    2-static blok tam sonra main method calışır.
    3-ondan sonra main in içindekileriçözerek devam eder.
    4-static blok birden fazla ise yukarıdaki önce çalışır.static blokları kendi içinde sıralr.
    5-static bloklar genelde static variable lara deger atanması için kullanılırlar. yani static e kim ne deger verirse
    versin ilk önce her zaman x degerini alsın ve oyle yola devam etsin.
    6-class la ilgili başlangıç ayarlamız varsa bizlere bunları yapar.
    7-
     */
}
