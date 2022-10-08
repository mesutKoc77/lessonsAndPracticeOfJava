package day02_scanner_dataCasting;

import java.util.Scanner;

public class C06_Swap {
    public static void main(String[] args) {
        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen birinci tam sayıyı giriniz");
        int sayi1=scan.nextInt();
        System.out.println("lutfen ikinci tamsayıyı giriniz");
        int sayi2=scan.nextInt();

        System.out.println("girilen degerler sayı1:" + sayi1 + ", sayı2 :" + sayi2);

        //şimdi sayı1 ile sayı2 değerlerini değiştirrelim

        int sayi3;

        sayi3=sayi2;
        sayi2=sayi1;
        sayi1=sayi3;

        System.out.println("değerler değiştiken sonra" + " sayi1:" + sayi1 + ",sayi 2:" + sayi2);

        /*
        int sayi3;                  (sayi2=20 olsun)    sayi3 un degerini henuz bilmiyoruz

        sayi3=sayi2

        burda sayi3 atama yapılan variable yani değişkendir, sayi2 ise değerin kendisidir yani 20 dur.
        burda sayi2 nin degeri sıfırlanmaz sayı3 e atandığı için yani sayı 2 de sayı 3 de 20 degerini alır.
        burda eşitlin solu variable yani atama yapılan, eşitliğn sağı ise değerdir.

        devam edelim yukarıdaki fonksiyona (mantık şu, sayı3; sayı2 nın değerni çaldı, degersiz kaldı, o da gitti
        yani sayı 2 de gitti sayı 1 in degerini çaldı.
        int sayi3;              (sayi1:10 olsun)

        sayi2=sayi1

        işte şimdi variable yani degişken, sayi2 nin degeri eşitliğin sağını aldı yani 10 oldu. şimdi de
        sayı 1 değersiz kaldı.
        burda farazi dusunecegız yani sayı1 in aslında degeri sıfırlanmıypr ayni kalıyor (10) sadece sayı2 ye
        sayı1 in degeri (10) atanmış oluyor.

        ama mantıpı çalıyormuş gibi düşün.

        sonra sayi1 değersiz kalınca o da sayi3 ün eşyasını (değerini) çalıyor.

        sayi1=sayi3

        sayi3 ün degeri neydi sayi2 den çaldığı değer olan 20 idi
        işte şimdi sayi1  in değeri 20 oldu.
        sayi2 nin değeri 10 olmuştu
        ve ortalığı karıştıran sayi3 ise 20 yi kaptı.

        bizi yaramaz sayi3 ilgilendirmiyor
        şimdi başlangıçta sayi1 10 idi, 20 oldu
        sayi2 nin değeri 20 idi, 10 oldu


         */






    }
}
