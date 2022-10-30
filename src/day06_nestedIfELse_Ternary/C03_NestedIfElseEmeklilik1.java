package day06_nestedIfELse_Ternary;

import java.util.Scanner;

public class C03_NestedIfElseEmeklilik1 {

    public static void main(String[] args) {

          /*
        Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

         */

        /*
        burada iki secenek var. Ya kadındır ya da erkektir. Ana iskeleti cinsiyyet uzerınden goturursek
        diğer işlemler daha yerli yerine oturacaktır. dolayısıyla bir kadın bloğu, iki erkek bloğu,
        ve üçüncü de yanlış bilgi girdiniz diyelim
         */

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen Cinsiyetinizi Giriniz.Erkek=e, Bayan=B");
        char cinsiyet=scanedilen.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasınızı giriniz");
        double yas=scanedilen.nextDouble();

        if (cinsiyet=='B')
        {
            if (yas<0) {System.out.println("yaş 0 dan kucuk olamaz");}
            else if (yas>=60) { System.out.println("Emekli Olabilirsiniz");}
            else if (yas<60) { System.out.println("Emekli olmanıza"+ (60-yas) + " yıl daha var" );}
        }
        else if (cinsiyet=='E')
        {
            if (yas<0) { System.out.println("yaş 0 dan kucuk olamaz");}
            else if (yas>=65) { System.out.println("Emekli Olabilirsin");}
            else if (yas<65) { System.out.println("Emekli olmanıza"+ (65-yas) + " yıl daha var" );}

        }

        else System.out.println("Yanlış Bilgi Girdiniz");

        /*
        AÇıklama: yukarıda şunu yaptık. öncelikle kadın, erkek ve diğer olmak üzere üç body kurduk.
        bu iskeletin içine de ilgili if leri yerleştirdik. kadın bitti, iskeletin ikinci kısmı erkek oldugu
        yani kod anlamında bayanlarla aynı seviyede oldugundan paragraf olarak aynı hizaya yerleştiler.
        ve onların ayrımını da süslü parantezler vasıtasıyla kurduk. bu suslu paraantezlerin de içersine gi-
        rerek sürekli olarak ilerledik.
         olarak tanımladık ve suslu parantez ile kadın saglanıyorsa
        diğer şartlara gectik ve ve surekli bir tab sağa kaydık
        NestedIfElseStatements çok kullanılır çunku pratik.
         */


    }

}
