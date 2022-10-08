package day15_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C07_DoWhileLoop {
    public static void main(String[] args) {
           /*
          Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
          Kullaniciya bitirmek istediginde 0'a basmasini soyleyin

          kullanici bitirmek istediginde
          toplam kac adet pozitif tam sayi girdigini
          ve bunlarin toplaminin kac oldugunu yazdirin

          Kullanici negatif sayi girerse
          "negatif sayi kullanamazsiniz " yazdirin
          bu negatif sayiyi sayi adedine ve toplama eklemeyin
         */
       Scanner scanedilen=new Scanner(System.in);
        int sayi=0;
        int sayilarintoplami=0;
        int sayac=0;

        do {
            System.out.println("toplanmak uzere pozitif bir tamsayi girin" +
                    "\nbitirmak icin 0'a basin");
            sayi=scanedilen.nextInt();
            if (sayi==0) {
                continue;
            } else if (sayi<0) {
                System.out.println("sayi negatif olamaz");
            } else {
            sayilarintoplami+=sayi;
            sayac++;}


        } while (sayi!=0);//kontrol et eger 0 degilse (ingilizce den yola çıkarsak 0'a eşit değil iken ) a loop u çalıştırmaya
        // devam et, yani 0 iken durdur artık.
        //demek ki while in mantıgı şu. While ile loop un ne kadar çalışacagı emrini veriyprusun. yani loop ne zaman
        //broken olacak. burada kullanıcı sayi yi 0  a eşitlemedıgı muddetçe loop u dondur. ne zaman ki sayi 0'a eşit
        //oldu işte o zaman loop u dondurme.
        {System.out.println("sayıların toplamı : " +sayilarintoplami+ "\n yazılan sayi adedi ise :" + sayac);}

        //2.23










    }
}
