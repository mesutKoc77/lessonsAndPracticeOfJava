package day14_methodCreation;

public class C03_MethodOlusturma {
    public static void main(String[] args) {
        /*
      verilen iki integer'i toplayip
      sonucu bize DÖNDÜREN bir method olusturun
     */

        int a=10;
        int b=20;

        int yenisonuc=ikiSayiTopla(a,b);//burda da yeni deger olarak bir variable a atama yaptık.
        System.out.println(yenisonuc);

        System.out.println(ikiSayiTopla(a, b));//yazdırdık
        System.out.println(ikiSayiTopla(4, 6));//yazdırdık
        //bunları bir variable a da atayabiliriz.

    }




    /*
    Methodu main method un dışında class ın içinde oluşturacagız.
     */
    //void olmayacak çünkü bana sonuç döndürmesini istiyorum. dolayısyla void kullanmayacagım. yani bana int döndürsün istiyprum

    public static int ikiSayiTopla (int sayi1, int sayi2){

        return sayi1+sayi2;
        //yani bu iki degişkeni toplayarak return et yani toplayarak int e döndür demek.
        //başta zaten int demekle, bu method umuzun sonucunu biz int olarak istiyoruz dedik. Return de de fonksiyonumuz toplamadır
        //diye tanımladık ve bu cercevede (toplama yönünde) döndür talimatı verdik.
        //ne zaman ki bu methodu kullanırsak, iki sayı olacak bunlar int sonucunda öıkacak ve topalancak.
        //aslında bu return benim amACIMI belirliyor. yani fonksiyon olarak ne isgtediigimi nbelirtiyprum.
    }
    //donduren dedi mi void olmaz, sadece yazdırma da void kullanılır.
    //donduren deıdıgı zaman void i kullanmayız, sonucu bana stirng int vb variable verecek olana atarım.










}
