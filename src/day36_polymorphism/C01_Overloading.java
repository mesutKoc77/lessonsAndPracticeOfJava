package day36_polymorphism;

public class C01_Overloading {

    public static void main(String[] args) {
        C01_Overloading obj=new C01_Overloading();
        obj.islem(3,"java");//3 Java
        obj.islem("Ali", "Can");//Ali Can//islem de ilk argument imiz string olmadıgından overload yaparak yenş
        //bir islem methodu ile onu başına String ekledik.
        obj.islem("hava",5);//burada ise parametre uyumsuzlugu oldugundan  overloading ile yeni bir islem methodu
        //oluşturarak uyumsuzlugu gidermiş oluyorum.//hava 5//
        obj.islem(5,6);//burada da islem methodumuz la ilgili parametre uyumsuzlugu var. yani islem methodlarımız
        //araasında int ve int yok, dolayısyla overload edersek aşağıda int ve int parametreli bir islem methodu
        //olulturulur.//5.0 6.0
        obj.islem(3.2, 5.6);//3.2 5.6
        /*
        overloading; Bir class da, AYNI İSİMDE fakt farklı signaturları olan method lar oluştrumaktır.

        signature; bir methodun İSMİ, parametrelerin SAYISI ve bu parametrelerin data turlerinin SIRALANISI.

        overloading isim method ismin aynı olmak zorundadır
        geriye ise ya parametrelerin sıralanışı degiştirmek yada parametrelerin sayısını degiştirmek kalıyor..

         */

    }

    public void islem(double a, double b) {
        System.out.println(a+b);
    }

    public  void islem(String a, int b) {
        System.out.println(b);
    }

    public  void islem(String a, String b) {
        System.out.println(a);

    }

    public  void islem(int a, String b){
        System.out.println(a+" "+b);

    }





}
