package day16_scope;

public class C04_Scope {//burdaki class da ise instance object variable dan ziyade static de eklendi. ve obje oluşturacgz.

    static int a=10;
    int b;
    static int c;

    public static void main(String[] args) {
        C04_Scope obj1=new C04_Scope();//burada obj1 oluştrudk. calss level de şnstance variable gitti, sadece b nin instance
        //variable oldugunu gordu ve b yi çekti. b ye deger atamadık ama default degeri olan 0 ı aldı.
        /*
        şimdi burda çok önemli bir husus vrugulanmalı. yukarıda static olarak atanan variable lar hiçbir zaman yalnız bir
        obje yeait degildir, static variable lar baglı oldukları class ı (burda C04_Scope class ı var) temsil ederler ve
        herkes için gecerlidir objelerden farklı olarak. ogretmenlerin okul adı gibi, okul adı bir class adıdır, okulun
        adı nı static bir variable olarak goz onune aldıgımızda okul ismşi degişrse tum ogrenciler ve tum ogretmenlerin
        de okul adı degişmiş olacaktır.
        burda C04_Scope  class ına ait static degeerler a=10 ve c=0 degerlerdi.
        ama obj1 e ait sadece instance variable b=0 vardır. dılayısla ben obj1 ile sadece b yi çağırabilirim
        */

        System.out.println(obj1.b);//0
        System.out.println(a);//10//static oldugundan direkt ulaştım. ne demiştik static olan variable ilgili class
        //altında herkesi baglar.
        System.out.println(obj1.a);//10 burda bir üstteki de 10 yazdırdı (static) bu da10 yazıdrıd. ama intellig bana dedi
        //ki obj1.a olarak a variable na ulaşmana gerek yok o zaten static yani herkesi kapsıyor direkt de çağırabilirsin
        //dedi. yani ben class level da static olarak belirlediğim bir variable aşağıda oluşturulan her objeyi de kapsamış
        //oluyor. c de de aynı şey.
        System.out.println(obj1.c);//0
        System.out.println(c);//0

        obj1.b++;//önce java gidecek obje 1 i bulacak.instance variable lar içinde b yi bulup 1 arttrıd ve sonuç 1 oldu.
        obj1.a++;//önce java gidecek obje 1 i bulacak. orda instance a bulamayacak cunku a static dolayısyla static olan
        //variable herkes için gecerli bir variable dı onu alacak ve a artık 11 oldu.
        //dikkat dikkat, bir kez static variable ın degeri degişti mi artık degiştigi satırdan itibaren yeni degerle
        //işlem görür. yani okulun adı eskiden 10 idi ama şimdi 11 oldu. bundan sonra oluşturulacak objeler de a nın bu
        //degerni göz onune alarak hareket edecek.

        //degerleri atadık şimdi 2. objeyi oluşturuaım ve farkı anlayalım.

        C04_Scope obj2=new C04_Scope();//java gelecek obje 2 yi oluştutracak, bir dikdırtgen çizecek, class level de
        //instance variable var mı? var ve b=0; neden hala sıfır cunku b bir instance variable dır, yukarıda obje 1 de
        //atama yapsak dahi static gibi her obje için yeni deger uzerınden işlem gormez ve goruldugu gibi obj2 nin b
        //degeri hala 0 iken, static deger olan a 11 e donustu.

        System.out.println(obj2.b);//0
        System.out.println(obj2.a);//11

        C04_Scope obj3=new C04_Scope();

    }








}
