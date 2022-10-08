package day41_interfaces;

public class tmBeetle extends tInsect {


    @Override
    public int getnumberofSections() {
        return 0;
    }

    @Override
    int getnumberoflegs() {
        return 0;
    }


    /*
    abstract class ları parent olarak kabul eden bir class, onlardaki tum abstract methodları concrete hale
    getirmedikçe kodumuz çalışmaz.
    bir abstract class ı ancak onu extend keyword ile parent kabul edebilrisin. ve eger parent ettgin bir
    abstract class, bir interface i implement etmişse sen her ikisindeki de abstractları concrete hale getirmelisin.
    yani extend keyword u ile parent kabul ettigin abstract class bir başka interface i implement etmiş ise
    otomatikmen sen de implement etmiş ve ondaki abstractları concrete hale getirme yukumlulugu altına girmiş oluyor
    sun.
    burda beetle class ı extend oldugu için ınsect teki abstract methodu aldı, bu ınsect de bir ustte
    interfacei implement ettigi için beetle class ı otomatıkman bu interface deki abstract methodu da alıp concrete
    etmek zorundadır. (peki abstract class neden bir üstteki interface ya da abstract class  deki abstract methodları
    concrete etmedi, cunku abstract class larda obje oluşturulmaz onların gorevi sadece şablon oluşturmaktır. ve onlar
    kural koyucudurlar, kural uygulaycıcı degil.

     */
}
