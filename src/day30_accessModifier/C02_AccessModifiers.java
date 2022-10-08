package day30_accessModifier;

public class C02_AccessModifiers {
    /*
    bir class uyesi oluşturulyurken mutlaka onun access modifier ı olmalı
    access modifier yazmazsak java ona default access modifier degeri atar
     default access modifier manuel ve gorunur olarak yazılamaz.
     biz access modfier yazamsak java ona otomatik oalrak atar.
     4 tane access modifier vardır.

     1-private, bu class uyelerini sadeece içinde bulundukları class da kullanabilrisiniz. yani private class uıyelerinin
     scope u içinde bulundukları class tır.

     2 default, bunlara kendibulundukları class ile kendi bulundukları package dan ulaşılabilir.
     bunların scope u kendi classları ve bulundujklağrı package larıdır. yani pazarlama bolumune pazarlama bolumundekiler ve
     pazarlama nın da bir alt dal olarak ait oldugu pazarlama mudurlugu  altında ulaşılabiliyor.

     3 protected, ise işlevsel olarak ait lik diye tanımlayaciliriz. yani buna class dan ilgili package dan ve diger
     package ların childclass larından ulaşılabilir. mesela başka bir bölgebnin pazarlama mudurluklerıyle(reklam, satış,
      pazarlama) işlevimiz aynıdır yani bu baglamda degerlendirebiliriz. evet fiziksel olarak aynı yerde degiliz ama
      işlevsel olarak aynı yerdeyiz.ama başka pazkage larda olup fakat childclass olmayanlardan ulaşılamaz.

     4 public, class dan ilgili rojenn her yerden ulaşabilrisin. public varaible larar ve public methodlara ulaşılabilir.
     static olanalra class ismi yazılarak ulaşılabilriken instance lara ise yani static olmayanlara obje uzerinden ulaşı
     labilir.




     */

    int sayi;//sayinin default degeri 0
    static String str="Java";

    void method1(){

    }
}
