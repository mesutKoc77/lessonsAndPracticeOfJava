package day16_scope;

public class C02_Scope {

    static int sayi=10;
    static boolean olduMu;
    static int a;
    static char b;
    static String str2;
    String str="Java";
    char krk;

    /*
    tum class da gecerli olması itsedigimiz variable ları class level da oluştururuz.
    stsatic bir kuluptur, static uyesi ılmayanlarla muhatap olmazlar. halk onları gorur ama onlar yani static ler static
    olmayanlarla muhatap olmazlar.

    class level da iki tur variable oluşturulabilir.
    1- static variables (class variables)
    2- instance variables (object variables) ya da static olmayanlar

    scope level da static olarak tanımlananan bir variable hem static hem de static olmayan methodların içerisisine
    girebilir.

    Kural
   1- Static variable lar, class içerisinde her yerden kullanılabilirler ama instance variable lar static method lardan
    kullanılamazlar.

   2-Static veya instance variable lara deger atama zorunklulugu yoktur. cunku normalde biz main method da bir variable
   tanımladıgımızda ona deger atamdan yazdırmak istedigimizde cte yanşi hata veriyprdu bize ama class level da bu sekilde
   variable a deger atama zoronlulugumuz yoktur.
   Class level variable lara biz deger atmazsak Java onlara tanımlanan Default degerleri atmaa yapar.
   Bu default degerler ise, sayısal variable lar için 0, char variable lar için hiçlik, boolean için flase,
   string için ise null dır.

     */

    public static void main(String[] args) {
        //scope level da static olarak tanımladıgım variable ı burada çağırabilirim
        System.out.println(sayi);
        //System.out.println(str); str static olmadıgı ve bu method static leri kabul ettiği için çalışmadı str.
        System.out.println(olduMu);//hiç itiraz etmedi
        System.out.println(a);//0
        System.out.println(b);//hiçlik
        System.out.println(str2);//null yazdırdı.
    }
    public static void digerMethod(){
        //scope level da static olarak tanımladıgım variable ı burada çağırabilirim
        System.out.println(sayi);
        //System.out.println(str); //str static olmadıgı ve bu method static leri kabul ettiği için çalışmadı str.
    }
    public void  staticOlmayanMethod() {
        //scope level da static olarak tanımladıgım variable ı burada da çağırabilirim
        System.out.println(sayi);//10
        System.out.println(str);//burda ise str çalıştı cunku str static degil ve bu method da static degil.//java
        System.out.println(krk);//yine hiçlik verecek

    }
    //sonuc olarak class level da static olarak tanımlanan variable lar her yerden kullanılabilir. void, static veya bu
    //kelimeler olmasa bile; fakat static olarak tanımlanmayanlar mesela yukarıda "str" variable ı static olan methodlarda
    //çalışamazken, statik olmayanlarla beraber çalışabiliyor ki yıukarıdaki "staticOlmayanMethod" isimli method static
    //olmadıgı için onda çalıştı. Sonuç olarak static variable her method da çalışır cunku esnektir ama static olmayan
    //variable lar ise esnek olmadıkları için statik olan method ların  içerisne giremez ve buradan çalıştırılamazlar.
    //sadece statik olmayan methodların içerisinden çağırılabilirler.


}
