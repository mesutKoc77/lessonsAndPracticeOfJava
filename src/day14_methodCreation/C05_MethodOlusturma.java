package day14_methodCreation;

public class C05_MethodOlusturma {
    public static void main(String[] args) {

        /*
         verilen sayilari carpim method'unda carpmak
         ve sonucu dondurmek istiyoruz

         kullanici 2,3 veya 4 parametre girdiginde,
          girilen tum sayilari carpip, sonucu bize donduren
          ayni isimde 3 farkli method olusturun
         */

        //iki sayının çarpımını yazdıralım
        System.out.println(carpimMetodumuz(3.4,2.3));// 7.819999999999999

        // uc sayinin carpini yazdiralim
        System.out.println(carpimMetodumuz(2.3, 4.5, 5.6));// 57.959999999999994

        /*
          method call'da yazdigimiz degerlere argument (2.3, 4.5 veya 5.6 gibi), method un cagırıldıgı yer de argument
          olur.
          method'da (en aşağıda method oluşturulurken kullandık) kullanilan degiskenlere ise parametre denir. mesela
          aşağıda method un parantez içi olan (int sayi1, int sayi2) parametredir.
          Bir method call yapıldıgında;
          java, argument'lerle parametre'lerin uyumunu kontrol eder
          uyumluysa calistirir, yoksa CTE verir.
          yani şöyle method un kalıbında sayi veya sayi 2 verdigin parametreler int ise argumentler de buna uyumlu
          girilmelidir. 3 argument varsa 3 de paarametre olmalı mesela. 3 varsa 2 argument giremezsin.

         */

        // 4 sayinin carpimini yazdiralim
        System.out.println(carpimMetodumuz(2, 3, 4, 5));//120.00

        /*
          Bir class'da ayni isimde farkli method'lar olusturulabilir.
          bunun icin ya
          farkli sayida parametre kullanilmali
          veya parametrelerin data turleri degistirilmeli
          buna java'da OVERLOADING denir.

          Java ayni isim ve ayni sayida parametresi olan method'lardan
          hangisini kullanacagina karar verirken, tum method'lari inceler
          %100 uyumlu bulursa onu kullanir
          %100 uyumlu yoksa calisabilecek olanlardan
          en az casting ile calisacak olani tercih eder
         */

        System.out.println(carpimMetodumuz(2, 3));//int int 6
        System.out.println(carpimMetodumuz(2, 3.4));// double double 6.8



    }
    //methodu oluşturlaım

    public static double carpimMetodumuz (double sayi1, double sayi2){
        return sayi1*sayi2;//yani yukarıdaki sayi1 ve sayi2 yi; sayi*sayi2 ye double cinsinden return (döndürdük) ettirdik.
                            //void de return yok zira dödndürme yoktu.
    }
    public static int carpimMetodumuz (int sayi1, int sayi2) {
        return sayi1*sayi2;
    }
    public static double carpimMetodumuz (double sayi1, double sayi2, double sayi3) {

        return sayi1*sayi2*sayi3;
    }
    public static double carpimMetodumuz (double sayi1, double sayi2, double sayi3, double sayi4){
        return sayi1*sayi2*sayi3*sayi4;
    }




}
