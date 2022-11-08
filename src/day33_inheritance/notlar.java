package day33_inheritance;

public class notlar {
    /*
    "is a" dersem ornegın car is a Engine demek araba bir araçtır. dedgimde arac parent araba da childclass olur
    "has a" dersem. Car has a Engine dedigimde araba nın motoru var. araba parent motor da child olmuş oluyor.

    A is a B dersem b parent a ise child.
    C has a D dersem d child c ise parent.

     */

    /*
    nasıl ki biz bir class ı oluşturdugumuzd java oraya gorunmez bir default constructor koyıyorsa extends keyword unun
    oldugu ch,ld classlardaki constructor ların içerisinde de gorunmez bir super() constructorlar bulunur.
    mesela java extends keyword unun oldugu bir class oluştrusa ve hiçbir şey yazmasak
    otoamtik olarka java oraya şunu ekler, biz goprmesek de
    1- default parametresiz  constructor
    2-default super pararmetresiz constructor

    */


    /*

    notlar.
    bir variable aranırken once
    1- scope'a
    daha sonra
    2- class level'a
    ve daha sonra da
    3- parent a
    bakılır.

    bu SIRALAMA mecburidir ve takip edilmelidri.
    yani once scope, sonra class level a, daha sonra da parent a gideriz.
    AMA;
    biz bu sırlamadan ziyade kednisi istediklerimizi yazıdrmak istiryorsak mesela ilgili CLASS daki constructor veya variable
    once getirmek istiyorsak THİS(),
    PARENT takini getirmek istiyorsak SUPER() yazılır ve dediklerimiz uygulanmış olur.
    BU İRADELER OLMAZSA YUKARIDAKI SIRA TAKIP EDİLİR
    this. (class daki variable lar)
    super. (parent taki variable lar)
    gelirler.
    ama this();
    veya super (); dedigimiz de ise constructor lar gelir. ve constructor lar daki iki kural tabii ki bunlar için
    geçerli degildir cunku onlar constrcutor degiller.
    this veya super i sadece constructor ın içerisinde kullanabiliriz.

    */
    /*
    public ve protected larar inherit edilebilir child class dan ama default olanlara sadece aynı package dan ulaşabiliriz.
    private larar zaten ulaşamayız.
    super() bu parent taki constructor leri getiriyoru
    this() ise sadece kendi bulundugu class taki constructor ı çağırır.

    super() parent takiconstrcutor dır super. ise parent taki variabla ve method ları cagırır.
    this() ise bu class taki constructor ı this. ise bu class taki var,able veya methodları cegıırır.
    super. parenttaki variable veya methodu çağırrı child class da hiç aramaz; this. ise bu class taki variable veya methodla
    rı çağırır bu class da yoksa parent a gider.
    eger bunlar kullanılmazsa java şu sırayı takip eder;
    1- ilgili scope,
    2- ilgili class,
    3- onlar da yoksa en son "parent class" a gider.
    super () ile this () bunlar ilgili constructor ın ilk sırasında olmalı.
    ve bunlar sadece bir kere kullanılabilir.

    super () ile this() birlikte kullanılmaz cunku ancak bir tane kullanilebilirid kuralımız var.

     */

}
