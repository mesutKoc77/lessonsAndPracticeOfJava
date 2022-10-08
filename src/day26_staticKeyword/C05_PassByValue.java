package day26_staticKeyword;

public class C05_PassByValue {
    public static void main(String[] args) {

        int sayi=10;
        sayi=method1(sayi);//eşitiliğin soluna atamayıp yazıdrsaydım aşagısı hala 10 yazazaktı ama şimdi 100 yazacak.
        //burada sayi nin kendisini de degil value sunu method a yolladık.sayi henuz degişmedi ama atama yaparsak
        //degişmiş olur ki atmaasını da yaptık. yani java da her zaman bu boyledir variable ın kendiis de degil value
        //su method agider.
        //farklı metdodlarda aynı iismde variable lar olsa da onlar aynı degildirler. bu bilgiyi veri kabul ederek yola
        //çıkmak gerekiyor. ve ayrıca zaten farklı scope da lar.
        //mesela main method daki sayi ile method1 deki sayi ayni degil. dolayısıyla method1 e biz sayi nin value sını
        //yolluyoruz.
        /*
        dikkat edilirse methoddn bize donen sayi nin kendisi degil degeridir. yani 100 olarak donuyor. istersek biz
        variable a atarız.
         */

        System.out.println(sayi);//100

    }
    public static int method1(int sayi){
        sayi=sayi*sayi;
    return sayi;
    }

    /*
    atamayı nerde yaptı isen ilgili variable da oraya aittir.yani başka bir scope dan method kullanıyor ve orada ilgili
    vriable a atamaya yaptı isen çalışıtrıdıgın scope da sadece sout deger degeri yazar ama bu scope da ilgili variable
    ın degeri nedir diye sorarsan atama yapmadıgından eski degeri yazdıracAKtır.buna pass by value denir.
    once variable ıma şu degeri atasam ne olurdu sorusunu sordugumda bir problemle karşılaşmamak için öncesinden variable
    ımın degişmemesini sağlamama pass by value denir.
    eger methodda atanan degerin kalıcı olmasını istiyorssqak bunu main method da ilgili variable a atamamız gerekiyor.
    pas by value veya digeinin kararını dili yaznlar karar veriyor, bizimle alakalı bir durum degil.
    java, bir arabanın sarı olsa nasıl olurdu sorusuna hemen arabayı sarıya boyayarak cevap vermemiş, o arabanın
    kopyasını sarıya boyayarak kararını vermiş.


     */

}
