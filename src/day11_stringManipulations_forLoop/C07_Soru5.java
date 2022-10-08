package day11_stringManipulations_forLoop;

import javax.print.DocFlavor;
import java.util.Scanner;

public class C07_Soru5 {
    public static void main(String[] args) {

         /* no 71
          Kullanicidan bir sifre isteyin
          asagidaki sartlari kontrol ederek
          kullaniciya duzeltmesi gerekenleri soyleyin
          eger tum sartlari saglarsa
          "sifre basariyla kaydedildi" yazdirin

          - ilk harf kucuk harf olmali
          - son karakter rakam olmali
          - sifre bosluk icermemeli
          - uzunlugu en az 10 karakter olmali
         */


        //1.yöntem, if else ve birbirlerine baglı if else ler
      //Scanner scanedilen = new Scanner(System.in);
      //System.out.println("Lutfen Şifrenizi Oluşturun");
      //String sifre = scanedilen.nextLine();

      //int uzunluk = sifre.length();
      //boolean bosluk = sifre.contains(" ");
      //String ilkharf = sifre.substring(0, 1);
      //char charilkharf = ilkharf.charAt(0);
      //char sonkarakter = sifre.charAt(sifre.length() - 1);



      //if (uzunluk < 10) {
      //    System.out.println("Sifre en az 10 karakterten oluşmalı");
      //} else if (bosluk) {
      //    System.out.println("Sifre bosluk içermemeli");
      //} else if (Character.isUpperCase(charilkharf)) {
      //    System.out.println("İlk harf kucuk olmalı");
      //} else if (!(sonkarakter >= '0' && sonkarakter <= '9')) {
      //    System.out.println("Son karakter rakam olmalı");
      //} else {
      //    System.out.println("sifre basariyla kaydedildi");}


        Scanner scanedilen=new Scanner(System.in);
        System.out.println("lutfen sifrenizi giriniz");
        String sifre=scanedilen.nextLine();
        boolean kontrol=true;//hemen ilk başta kontrol ettik, şifre dogru mu?//aşağdakilerden hernagbi birisnde hata verirse
        //kontrol false verecek.şifre yanlış diyerek kontrol edecek. kontrol false ise şifre başarısız ama true ise sifre
        //başarılı diyecegım

        //- ilk harf kucuk harf olmali

        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){ // burda neden substring ile ilk harfi çağırmadık, çünkü
        //substring string getirir ama bizden istenen char variable ına atama yapmak. sifre.substring(0,1)>='a' dolayısıyla
        //bunu yaptıgımız an bize hata mesajı verecektir. Ve ben sana string veriryorum sen onu char a atayamazsın diyortç
        //sonuç olarak char olarak alıp char olarak da atama yapmamız gerekıyor.
            System.out.println("sifre kucuk harf ile baslamali");
            kontrol=false;
        }
        //sifre.charAt(sifre.length()-1)---- burda şu komutu veriyoruz..uzunlugun bir eksiğindeki karakteri bana char olarak
        //getir diyoruz.

        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')) {
            System.out.println("sifre rakam ile bitmeli");
            kontrol=false;
        }
        if (sifre.contains(" ")) {
            System.out.println("Sifre bosluk icermemeli");
            kontrol=false;
        }
        if (sifre.length()<10) {
            System.out.println("sifre en az 10 karakterli olmalidir");
            kontrol=false;
        }
        if (kontrol) {
            System.out.println("Şifre basariyla kaydedildi");
        }
        /*
        kalem orneginden harelket edelim. Önce kaleme saglamdır dedik ve yola çıktık. Yani boolean true diyerek bunu belirttik
        daha sonra her bir işlem de kontrol edilecek kalem şifre dogruysa tmm devam et siyecek ve diüer şartklara ugraycak
        ondan sonra da devam edecek onlardan da saglam çıkarsa en son da kalem saglamır yani true diyecek ve yazdıracak
        ama birisnde eksik olursa hemen false diyecek veya her ikisinde de kırılmışsa sonunda saglam degıl ve bir kaç
        kez kırıldı diyecek.
        ben saglam bir kalem verdim, şartlardan birisi saglanmıyrsa kalemi kır talimatı veriyorum.
         */











    }
}
