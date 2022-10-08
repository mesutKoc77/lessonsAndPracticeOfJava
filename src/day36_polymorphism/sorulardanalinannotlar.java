package day36_polymorphism;

public class sorulardanalinannotlar {
    /*
    ---private, static ve final olarak tanımlana parent class daki bir method override edilemez.
    ---this. super. veya this() super() contrsutorlarda olur, yani methodlar da bole bir şey olmaz.
    ---obje oluşturulurken eşitlliğin solu data turu yani objenin özelliginş alacgım yer, eşitliğin sagı
    ise obejenin oluşturalacgı yani constructor ın yeri yani class ıdır.
    override edilip edilmedıgını kontrol etmek için gidecegn son class constructor class ıdır. yani constructor class
    neresıyse orda son bulur.
    ben bir class daki özelliklere ulaşmak istiyorsam ilgili class dan bir obje oluşturacgı ve o obje ye ozelligine
    ulaşmak istedigim class daki özellikleri yani variable ve method ları atayacagım.
    parent child ilişkisi oldugunda methodlar için mutlaka override edilmiş mi sorusunu sor.
    new.... ise constructor dır.

    //özelligini alcagımız yani eşitliğin solundaki class dan özellik alsak da onun override edilip edilmedigini
    eşitligin sagında class a kadar takip etmeliyim.

    bir data turunu başka data turune atarken covariant olmasına dikkat edilmeli
    String str="Ali";
    Integer sayi=5;
    sayi is a str dır dıyemıyoruz dolayısıyla atayamayız.
    ama

    Object obj;

    obj=str;
    obj=sayi;

    burda olur cunku str is a object veya sayi is a object denilebiliyor

    veya bir x class ı dudunelım ve y class ı da onun child class ı olsun. bu duurmda x=y diyebiliriz cunku
    y is a x diyebiliyorsun cunku y onun child classı ve
    bır sonraki işlemler de karşımıza x çıkarsa atama işlemi x=y oldugundan artık x denildiginde y yi alacagız.

     */


}
