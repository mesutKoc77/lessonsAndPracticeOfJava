package day15_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
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

        int sayi=10;//sayi 0 olmadıgı muddetce while loop çalışacagndan bunu 10 yaptım. unutma java yukarıdan aşağıya iner
        // 10 yaptım ve çalışmaya başladı.
        int sayac=0;
        int sayilarinToplami=0;

        while (sayi!=0) //sayi 0 olmadıgı muddetce surekli aşağıdaki loop u dondur. şimdi biz zaten yukağrıda "sayi" ya
            //0 dışında bir deger atadıgımızdan while loop umuz çalışmaya devam etti.
            {
                System.out.println("toplanmak uzere pozitif bir tamsayi girin" +
                        "\nbitirmak icin 0'a basin");
                sayi=scanedilen.nextInt();//buraya gedilk sayi variable ına yeni deger atadık. ve işleme devam ettik.

                if (sayi==0)//yani kullanıcı bitirme niyeti dışında 0 girerse. aslında bu şartı yazmasak da olur.
                {
                    continue;//yani hiçbir şey yapmadan devam et, ne topla ne çıkar...
                }
                else if (sayi<0) {
                    System.out.println("negatif sayı kullanamzsınız");
                }//şimdi kullanıcı negatif sayı girmedi her şey tamise artık hedefe ulaşabiliriz
                else {
                    sayilarinToplami+=sayi;
                    sayac++;
                }
            }
        System.out.println("Girilen " +sayac+" adet pozitif tamsdayinin toplami : " + sayilarinToplami);

    }

}

