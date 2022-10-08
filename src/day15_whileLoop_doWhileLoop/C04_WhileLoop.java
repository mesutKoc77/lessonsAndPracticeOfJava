package day15_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {
         /*
        Kullanicidan sifre isteyin
        asagidaki sartlari saglamayan sifrelerde
        hatalari yazdirip, kullanicinin yeni sifre girmesi isteyin

        Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin
        gecerli sifre yazilinca
        sifreniz basari ile kaydedildi yazdirin

        sartlar :
        - sifrenin ilk karakteri kucuk harf olmali
        - sifrenin son karakteri sayi olmali
         */

        Scanner scanedilen = new Scanner(System.in);

        boolean sifredogrumu=false;//yani şifre dogru mu? değil, o zmaan bir daha gir şifreyi, şifre dogru mu?, degil
        //bir daha gir.

        char ilkHarf;
        char sonHarf;
        String sifre = "";


        while (sifredogrumu==false) // sifredogrumu == false demek boolean ımız false oldugu muddetce bu loop u çalıştır
            //demek. Açıklama: while in kuralı şu: while in iki prantezine yazdıgın şey, true olursa çalışır, ki zaten öle
            //oldu, ama " sifredogrumu == false " nın kısa ifadesi olarak başına üünlem işareti koyarak da bunu ifade
            //edebiliriz. !sifredogrumu == false
            {//sifre yanlışsa oldugu muddetçesurekli döndür, şifre yanlış oldugu muddetce
            // surekli tekrarla.
                /*
                aslında şöyle biz boolean ı false olarak atamaıştık, ama while ın içi true oldugu muddetce çalışır
                dedik. ama biz looop un içini sürekli false iken dondur diyoruz. ki zaten false oldugunda evet sifredogrumu
                false, yani ben while in şartını sagladım ve true yu gordum ve dondururuyrm aşapıyı.
                ama şartıma sadık kalarak donduruyrm.
                 */
            System.out.println("lutfen sifrenizi Giriniz");
            sifre = scanedilen.nextLine();
            ilkHarf = sifre.charAt(0);
            sonHarf = sifre.charAt(sifre.length() - 1);

            if (ilkHarf < 'a' || ilkHarf > 'z')//olumsuz dudunerek hareket edıyoruz, yani ilk harf, harf olmazsa?
            {
                System.out.println("sifrenin ilk harfi kucuk harf olmali");
            } else if (sonHarf < '0' || sonHarf > '9')//yani yine son harf 0 veya 9 arasdında yani rakam degilse?
            {
                System.out.println("sifrenin son karakteri rakam olmali");
            } else {
                sifredogrumu = true;
                System.out.println("şifre kaydedildi");
                //şimdi artık dönen loop u durdurmam gerekiyor, zira artık herşey dogru ve şifre kaydedildi.
                //eger artık bayrak dıgru yu kaldırmazsa, dogru şifre girse dahi sürekli dönmeye devam edecektir.

            }

            //1.00 kala


        }

    }




    }
