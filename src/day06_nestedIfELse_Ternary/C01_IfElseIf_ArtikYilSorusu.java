package day06_nestedIfELse_Ternary;

import java.util.Scanner;

public class C01_IfElseIf_ArtikYilSorusu {
    public static void main(String[] args) {
        /*
        //sokrative quız cozum notları (bu konuyla alakası yok);
        int sayi1=5;
        int sayi2=2;
        double sonuc=sayi1/sayi2;
        System.out.println(sonuc);
        java her zaman eşitliğin sağından başlar çözüme. burda int oldugundan
        //2,5 değil 2 yazar ama sonuc double oldugu için sonuca 2.0 yazar.
        //peki int nasıl double yapıyorduk, herhangi bir int i double cast edersek sonuc double yapar.
        //ornek olarak asağıya dikkat edilebilir.sayi1 i double a cast ettik.

        double sonuc2=(double) sayi1/sayi2;
        System.out.println(sonuc2);

         */

        /*
        java; yukarıdan aşağıya ve soldan sağa gide gide işlem yapar.


        int num1=4;
        int num2=5;
        String isim1="Ali";

        System.out.println(isim1+num1+num2);
        //java; yukarıdan aşağıya ve soldan sağa gide gide işlem yapar demiş
        //tik. önce isim1 i birleştirip num1 i stringleştirir ("Ali4") stringleşen bu deger şimdi num2 yi
        //stringleştiirir ve "Ali45" olur sonuc.

         */
       /*
       ve işleminde bir tane yanlış olsa yeterli, yani sonucun true olabilmesi için hepsinin 1 olması
       gerekiyor bir tane 0 olursa sonuç sıfır olur ve false a doner. veve daha hızlıdır.cunku vv bir tane
       false, sıfır, buldugunda hemen sonucu false sıfır yapar.
       java sout un içine artı diye yazıp toplama yapamaz.
        */




        //ŞİMDİ ASIL KONUMUZDAYIZ. artık yıl. Sözel ifadeleri diyagrama gecirebilrsen çok daha rahat olur.


        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen Yıl Bilgisini Giriniz");
        int girilenYil=scanedilen.nextInt();

        if (girilenYil%4!=0) //kural 1; 4 un katı degılse atık yıl degıl
        {
            System.out.println("Değil");}
        else if
            //kural 2: 4 e bolundu ve 100 e de bolunamıyorsa artık yıldır.
            // yani 4 ile bölünüyorsa ki bunun da anlamı yukarısı false verirsedir. yani kalan 0 a eşitse.
        //else if ile ifade eder aşağıya inerim. derim ki ve bu sayı yuze de bolunemıyorsa yıl, artık yıldır.
        (girilenYil%100!=0)
        {System.out.println("Artık Yıl");}

        else if
            //kural 3: ama 100 e bolunebiliyor ve 4 ün katı ise ve de bu 400 un katı ise yine artık yıldır.
            // yani 100 ile bölümü 0 a eşitse, yani false ise, kodu else if diyerek aşağıya devam ettiri
            //rim.  ve şunu soylerim; son aşamadaki de 400 ün katı ise onu artık yıl kabul et
        (girilenYil%400==0)
        {System.out.println("Artık Yil");}
        //diğer hallerde ise, artık yıl kabul etme

        else System.out.println("Değil");
        //Önemli Not: kod a önce sonuca goturen formulu dizayn etmekten başla. bölünemiyorsa sonuç ise
        //hemen bundan başla ve devam et.
        //bir if cumlesi ya basit if tir ya da if else dir.

    }



    }




