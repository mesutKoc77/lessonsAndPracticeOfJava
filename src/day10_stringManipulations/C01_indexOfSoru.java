package day10_stringManipulations;

import java.util.Scanner;

public class C01_indexOfSoru {
    public static void main(String[] args) {
        //no 59

   /*
  Kullanicidan bir cumle ve bir kelime isteyin
  cumlede kelimenin kullanimina gore
  asagidaki cumlelerden uygun olani yazdirin
  - 1. soru cumle aradiginiz kelimeyi icermiyor
  - 2. soru aradiginiz kelime cumlede sadece 1 tane var
  - 3.soru aradiginiz kelime cumlede birden fazla var
 */

        //soruyu çözmeden once kendimiz bir prototip yapalım ve bunun ustunde dusunelim daha sonra kullanıcıya geceriz
        //şoyle olsa mesela

        String cumle="Java cok guzel,cok";
        String kelime="a";

        //a nın ilk kullanım indeksini bulalım

        int ilkKullanimindex=cumle.indexOf(kelime);//1// bu bana bir sayı verecek, dolayısyla bunu hemen int bir variable a
        // atamam gerekiyr.
        //artık yazılan kelimenin iilgili string de yerinin sayısal karşılığını buldum. ve ilkKullanimindex
        //variable ına atadım.

        int ikinciKullanimindexi=cumle.indexOf(kelime,(ilkKullanimindex+1));// 3//kelime nin ikinci kullanım indekx ini
        //bulmak isedigimiz de de ilkkullanımindeksini dahil etmemmek için ilkkullanımindex ine 1 eklersem
        //bundan bir sonrakinden başlayarak arar ve bana ikinci kullanımın indexini getirir.
        //içermiyorsa -1 değerini alacaktır. o zaman demek ki ikinci yi bulamıyorsa kelime, cumlenın içinde
        //bir adet vardır diyecegız bunu da else if de tanımladık.


        //1. soru= cumle de kelime geçiyor mu?//javada karşılığı?

        if (!cumle.contains(kelime)) //başına bir ünlem koyarark, cümle kelimeyi içeriyor mu? sorusunun tam zıddı
            //olan cümle kelimeyi içermiyor mu? ya çevirdik vee true ise aşağyı yazdıacak dedik. //false dedi ve aşagıda
            {
            System.out.println("cumle aradiginiz kelimeyi icermiyor");

        } else if (ikinciKullanimindexi==-1) //buna false dedi ve aşağıya indi
        {
            System.out.println("aradiginiz kelime cumlede sadece 1 tane var");}

        else //işte buna true dedi ve yazdırdı
        {
            System.out.println("aradiginiz kelime cumlede birden fazla var");}
        //ne demiştik, if, true yu bulana kadar devam eder. Kelime yok mu? yok derse durdurur. yok yani true derse,
        //aşagıya geçmez. ama var derse yani false derse, o zaman kaç tane var dedik cevabını verdi ve daha sonra
        //false deseydi yani birden fazla var deseydi hemen aşağıa geçip onuyazdıracaltı.
        //burda bir ornek verelim. a olsun. ve soralım
        //a, cumlenın içinde yok mu? //false //yani var.//hemen aşağıya indi
        //a, cumlenın içinde ikinci kez yok mu?// hayır var dedi yani //false dedi ve aşağıya indi
        //eğer ikinci kez de varsa bu duurmda "aradıgınız kelime, cumle içinde birden fazla vardır" dedirttik ve bitirdik.

        //şimdi iskeletimizi kafamızda kurduk

        //kendin de bunu scanner a cevirebilrsin













    }
}
