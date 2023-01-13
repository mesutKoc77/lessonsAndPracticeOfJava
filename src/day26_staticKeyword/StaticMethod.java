package day26_staticKeyword;

public class StaticMethod {
    static int sayi = 20;
    int yas = 40;

    public static void main(String[] args) {
        sayi++;
        //yas++;
        method1();
        //method2();

    }

    public static void method1() {
        sayi++;
        //yas++;
    }

    public void method2() {
        sayi++;
        yas++;
        method1();
        method2();

    }
    /*
    1-bir methodu static yapmak istiyorsak return type dan once static kelimesini eklememiz gerekiyor
    2- yukarıyı goz onunde bulundurdugumuzda static methodlar da kesınlıkle static olmayan variable lar kullanılmaz. Nitekim
    yas bir instance variable dır ve main static bir method oldugundan kabul etmedi.
    3- fakat static olan bir method hem static olan hem de olmayan tum methodlardan cagırılabşliyor. nitekim
    yukarıda method 1 bir static method dur hem static olmayan method 2 den hem de static olan maşn den cagırlabildi.
    yani statikler her yere girebiliyor fakat içlerine statik olmayanı almıyorlar.
    4- Static olarak etiketlenen bir method a başka class dan ulaşabişlmek için classismi.method ismini yazarak erişeb
    bilirsin.
     */

}
