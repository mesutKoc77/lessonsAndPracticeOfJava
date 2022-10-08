package day41_interfaces;

public interface I01_InterfaceEkmek {

    /*
    1-interfaces ler tamamen soyut yani içinde bir tane dahi concrete methıd yok.
    2-interfaces ler concrete child classlar için blueprint yani şablon özelliği taşırlar.
    3- interfaces in class a göre cok buyuk avantajı vardır.
    java da bir class sadece bir tane class ı parent edinebilir.eger birden fazla class ı parent edinmek isterse bu durumda
    hiyerarşik bir duzenle bunu saglayabiliriz.bir parent zinciri saglanabilir.
    -
   ama interface lerde durum farklıdır.
   bir class istedigi kadar interface i implement edebilir.

   4- bir claass ı bşr interface e child yapabilmek için implements keyword u kullanılır.
   5-istenrise bir interface bir başka interface i parent edinebşlir bu durumda yine extends keyword u kullanılır.
   6- bir class, başka bir classa extends ile child olup hem de istedigi kadar interface i implement edinebilir.
   7- interface ler de sadece public ve abstract method lar bulunur.
   8-ınterface ler de d evariable lar public, static ve final dır. yine yazsak da yazmasak da.
   9-variable lar final oldugu için sonradan degeri değiştirlemez başta deger ataması yapılmalı.
  10-birden fazla interface i implement eden bir class tum interface lerdeki
  variable'lara erişebilir.
  eger aynı isimde birden fazla interface de bulunuyorsa bu variable, static
  yolu takip ederek ınterface adi.variable adı dıyerek istedigmiz getirir.
  11- farklı interface lerde ama aynı isim de method varsa biz bir kere
  overrride etsek bu bize yeterli olacKTIR.
  12- aynı iismdeki ama return type ları farklı olan method ların
  override edilmesi durumunda her iki method da kendi return type ol
  masını ıster.
  bırını yapsak digeri kabul etmez. bu sorunun çozumu, ilgili interface
  lere gidip her ikiisni  de return type larını eşitlemektir.


     */

    public abstract void un( );
    public abstract void maya( );
    public abstract void bicim( );
    public abstract void gramaj( );






}
