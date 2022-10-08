package day17_scope_arrays;

public class C01 {

    //başka class dan nasıl ulaşabiliriz.
    /*
    java da projeler oluşrtuturken her class da main method olmasına gerek yoktur. hatta class ların buyuk cogunlugunda main
    method bulunmaz.
    içinde main method olmayan class ları objeler oluşturmak için veya faydalı methodları koyup ihtiyacımzı oldugunda çalıştırmak
    için kullnaıırız.
    obje oluşturmak için oluşturla class larda o obje ye ait variable lar ve method lar olur.
    mesela bu class hemsire class ı olsun.
    hemşirelerin özelliklerini belirlehecegız.
    yani buutun hemşireler için ortak bir özellik varsa o özelliiği sttaic yaparım. ornegin,  meslek static oldu çünkü
    hepsi için gecerlidir bu meslek. ama bunun dışında isim vb kişisel özellikler içiin tabii ki nstance olacak,
    çünkü her hemşirenin ismi vb farklıdır.
     */
    static String meslek="Hemsire";
    String isim="İsim Atanmadi";//henüz isim yok
    String soyisim="Soyisim atanmadi";
    boolean aktifmi;

    public static void  method1(){
        System.out.println("static method calıştı");
    }

    public void method2(){
        System.out.println("static olmayan method calıştı" );
        isim="Recep";
        soyisim="Lejon";
        aktifmi=true;


    }




}
