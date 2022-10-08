package day41_interfaces;

public class znotlar {
    /*
    1- abstract class ama ınterface class degildir
    2- abstract class larda concrete ve abstract method vardır ama ınterface ler de ise sadece abstract methodlar vardır.
    3- abstract ta kısmı abstract varken ınterface lerde tam abstract vardır.
    4- birden fazla abstract class a direkt child olunamaz; fakat bir class dan birden fazla interface e direkt inherit
    edinebilirsiniz.yani çoklu ınheritance uygundur.
    5- abstract class biraz daha hızlıdır.
    6- abstract lar public olmak zorunda degilken interface ler ise pıublkic olmalı.
    7- abstract larda constructor varken, interface ler de construcor yoktur.
    8- abstract larda soyut olmayan methodlar static oalrak tanımlanabilirken, interface lerde method lar static olamaz.

     */

    /*
    1-
   interface lerden obje oluşturulmaz ama data turu olarak kullanılabilirler.
   eşitilin sagında bulunan constructor ın data turu ya kendi class ıdır ya da parent class larıdır.
   biz eşitliğin sagındakini oluşturruuz ama bunun ozelliklerini eşitliğin solundaki class ın ozellikleri ile öne
   çıkartmış oluruuz.
   constructor denince akla bir obje yi oluşturma akla gelirken, eşitliğin solu ile de bu oluşgturulan objenin özellik
   leri akla gelmeli.
   2-
  child olan bir class, parent edindgi tum classlardaki tüm abstract method ları implement edip override etmeli.
  concrete edilmemiş tüm abstract methodları override etmelidr.
  3-
  public, final ve static tir her interface de ki obje.
  butun methodlar ise public ve abstract tır maksat diger implemnt eden class larda kullanılsın.yani methodları static
  olmaz.
  ayrıca interface lerde concrete metod olmaz sadece ama saddece body sız abstract method olur.
  ama abstract larda içinde yine de bir tane concrete method olabilir ve biz istesek kullanabilirdik.
  4-
  interface, bir başka interface parent edilmek istendiginde extends kelimesi kullanılabilir. ama normalde interfacelerde
  keyword implement tir.
  ve abstract class larda normalde parent ilişkisi extend kelimesi kullanılabilir.
  5-
  hem interface hem de abstract class lar default methodlar bulundururlar.
  6-
    KAFA KARIŞIKLIGI OLUŞTU:
    İNTERFACE LERDEKİ METHODLARIN STATİC OLUP OLMAYACAKLARININ BELİRLENMESİ, BODY LERİN OLUP OLMAMAMSINA MI BAGLIDIR?
    evet bunu deneme yanılma yoluyla çözebilrisin
    mesela interfacelerin body leri oldugunda bunlar zaten concrete edilmiş ve overrride edilmelerine imkan kalmadıgından
    static (default) olarak tanımlanabilrler ama  body sız oldujlarında static leri kabul etmiyor zira diger
    child class kullansın ki onlar kendilerine göre duzenlesinler.zdeneme ve zdenemee class ları burada bize ornek olabilirler.
    I06_Interface ayrıntılı bilgi burada da var.



     */




}
