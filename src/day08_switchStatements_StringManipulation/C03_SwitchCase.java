package day08_switchStatements_StringManipulation;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {
        //51 no

        /*
          Kullanicidan gun ismini alin
          ve girilen gun ismine gore

          hafta ici veya hafta sonu yazdirin
         */

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen gün ismi giriniz");
        String kullanicinilkgirdigideger=scanedilen.next();//kullanıcı ///1. önemli
        //buyuk kucuk harfe dikkat etmeden girdi diyelim, bu sefer burası
        //çalışmaz, bunu engellemek için ben hepsini kucuk harfe çevireyim
        //ki ne olur ne olmaz.
        String sondeger=kullanicinilkgirdigideger.toLowerCase(); ////2.Önemli
        //burada girilen degerin hepsini kucuk harfe cevirdim ve
        //variable ımı ve de deger atamalarımı da bunun uzerine bina
        //edecegım. Örnek verelim mesela kullanıcı "PaZartesi" girdi. 1. önemli hemen bunu direkt alacak.
        //aldıktan sonra 2. önemli bunu akıp küçük harflere çevirecek. E ben zaten variable mi yani case
        //lerin variable larını hep küçük harflere göre tanımladıgımdan atama da buna göre olacak.



        switch (sondeger){
            case "pazartesi" :
            case "salı":
            case "çarşamba" :
            case "perşembe" :
            case "cuma" :
                System.out.println("Hafta içi"); break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("Hafta Sonu");break;
            default:
                System.out.println("GünBilgisiGeçersiz");
        }
        /*
        ntlar: switch parantezinde long, double, float ve boolean kullanılamaz.
        kod, break ı gorene kaddar devam eder.

         */




        //BİR ÖRNEK
        System.out.println("Lutfen İsim Giriniz");
        String ilkisim=scanedilen.next();//YAZILAN İSMİ, İLKİSİM variable ına atadık.
        String sonisim=ilkisim.toUpperCase();//bu ilkisim variable ına da kuuck harflerine cevirip case leri de
        //buna göre oturttuk.

        switch (sonisim) {
            case "ALİ" :
            case "OSMAN":
                System.out.println("İsim");break;
            case "FURKAN":
            case "SEVGİ":
                System.out.println("Değil");
            default:
                System.out.println("Lutfen Bİlgileri Kontrol Ediniz");
        }

          /* HOCA NOTU
          String ifadeler case-sensitive'dir
          (buyuk - kucuk harf duyarlidir)
          Pazartesi, pazartesi, PAZARTESI, PAzartesi, ..... hep farkli String'lerdir
         */

        /*
          Kullanicinin girdigi degeri
          kodumuzu calistirmak ve dogru sonuclara ulasmak icin degistirebiliriz
          ama bu durumda kullanicinin girdigi deger degismis veya kaybolmus olur

          Kullanicinin girdigi degeri korumak icin,
          ikinci bir variable olusturup
          kodlarimizda ikinci variable'i kullanmak, degistirmek daha uygun olur
         */

        //















    }
}
