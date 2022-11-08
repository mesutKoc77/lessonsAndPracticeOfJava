package day33_inheritance;

public class CDizelCorolla extends BCorolla{
    //constructor ı gorunur yapalım
    public CDizelCorolla() {
        //super(); gorunmrz bir super cnstrutr yani parent class lardaki talimatları yazdırır.
        System.out.println("dizel Corolla Cons");
    }


    public static void main(String[] args) {

        CDizelCorolla arb1=new CDizelCorolla();
        //sagdakinden constructor talimatini aldı ve
        //yukarıdaki constructor ın soylediklerini
        //ilk olarak yaptı.

        System.out.println(arb1.marka);//Toyota
        System.out.println(arb1.uretimYeri);//Turkiye
        System.out.println(arb1.model);//Corolla

        /*
    ayrı bir not:
    obje uretirken constructor vasıtasıyla obje
    uretiyoruz. eşitliğin sagı constructor yapısı
    na karşılık gelir her zaman. ve class ın
    hemen altında uygun constructor ı bulur.

     */

        /*
        COK ONEMLİ:
       Bir child class da obje oluşturdugumuzda bu obje ait oldugu classın yanında
       parent classs da ki ozelliklere de erişebilir.
       bunun altında yatan ana sebep java da ki super()constructor call mekanizmasıdır

       Bir class oluşturdugumuzda java nasıl ki hemen oraya default constructor
       yerleştiriyor,



       java constructor ın bulundugu class da extends kelimesi gordugu an
       , hemen gider constructor ın ilk
       satırına super constructor call yani super(); yazar.
       extend keyword unun oldugu class larda bulunan constructor lara da
       super (); ı yerleştirir.

       yanı bu yani super(); şu demek: babama git parametresiz constructor ı
       çalıştır dmeek.

       yani bu duurmda ilk saturda bulunan super
       e yani parent a gideriz once ıondakini alır yazarız
       ve daha sonra child class datikerli,
       yazarız.
       dolayısıla bu classı şuan yazdırdıgımda
       şunu yazacak
       Toyota Cons
Corolla Cons(super den dolayı buraya geldı bunda da
extend oldugundan şimdi de toyota ya gitti ve orda
extend olmadıgından yazdıra yazdıra geldi)
dizel Corolla Cons(buraya gelmşştişş ama extend li oldugundan
o da onu super e yonlendişrdi.)
Toyota
Turkiye
Corolla
yani ben parent da bulunan constructor ları
kendi class ımda cagırarak onların instance vari
able larını bulup çalıştırmam anlamına gelecektir.




       */


    }

}
