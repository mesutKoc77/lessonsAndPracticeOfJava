package day06_nestedIfELse_Ternary;

import java.util.Scanner;

public class C04_NestedIfElseif_Emeklilik2
{

    public static void main(String[] args) {
        /* untitled 33
        Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

         */

        /*
        Eger degisken sayimiz birden fazla ise
        once degiskenlerden birine gore temel iskeleti kuralim
        ornegin bu soruda yasa gore yapalim
         */

        Scanner scanedilen = new Scanner(System.in);
        System.out.println("Lutfen Cinsiyetinizi Giriniz, E ya da B");
        char cinsiyet = scanedilen.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasınızı giriniz");
        double yas = scanedilen.nextDouble();

        //yaş 0 dan kucuk olamaz
        if (yas<0)
        {System.out.println("Yaş 0 dan kucuk olamaz");}

        //erkeklerde Bayanlarda emekli olamaz ama ne kadar yıl oldugu soylenebilir.
        else if (yas<60)
        { if (cinsiyet=='B') {
            System.out.println("emekli olmanıza"+ (60-yas) + "yıl daha var");} else if (cinsiyet=='E')
            {System.out.println("emekli olmanıza"+ (65-yas) + "yıl daha var");} else System.out.println
                    ("Lutfen Bilgileri Kontrol Ediniz");}

        //bayanlar olur, erkekler olmaz
        else if (yas<65)

        { if (cinsiyet=='B') {System.out.println("Emekli Olabilirsiniz");} else if (cinsiyet=='E')
        {System.out.println("Emekli Olamazsınız");}
        else {System.out.println("Lutfen Bilgileri Kontrol Ediniz");}

        }
        //şimdi herkes emekli olabilir.
        else System.out.println("Emekli Olabilirsiniz");

        }

        }


