package day09_stringManipulations;

import java.util.Scanner;

public class C04_endsWith {
    public static void main(String[] args) {

        //no 57
        //endswith de sunu soruyor, degerimiz x ile mi bitiyor

        String str="Java cok guzel,cok.";

        System.out.println(str.endsWith("cok"));//str "cok" ile mi  bitiyor, false olur cunku degerimiz cok.
        // ile biitiyor

        System.out.println(str.endsWith("cok."));//true

        System.out.println(str.endsWith(""));//bu hiçlik ile mi bitiyor//true

        /*
          kullanicidan bir mail alin
          - mail @ icermiyorsa "gecersiz mail"
          - mail @gmail.com icermiyorsa, "mail gmail olmali"
          - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
          yazdiralim
          eger bu hatalar yoksa "mailiniz basari ile kaydedildi" yazdirin
         */

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen Mailinizi Giriniz");
        String girilenmail=scanedilen.nextLine();

        //if ile kuracaksan ilk adımdan başla ve ikinci den devam et.

        if (!girilenmail.contains("@"))//mail, @ içermiyorsa (contains in başına ! koyarsan olayı tersine çevirir)
            // diye sorduk true yani evet içermiyor diye boolean
            //deger atarsa hemen aşağıyı yazdır dedik.false sa zaten buraya hiç yazdırmaz. çunku if in mantıgı
            //bu..false ya da true diye sorar true ise sout un içindekini dondurur.
            //not, burası true  çıkarsa "gecersiz mail" yazdır. demektir bunun anlamı.
            //false çıkarsa yani @ bulunuyorsa hemen birinci else if e geç.
            //if, else if lerin birbirlerine bağlılıkları false bağlıdır, yani ilk if false çıkarsa hemen ikinci
            //else if e geçer onu kontrol eder o da false ise diğerine geçer.
            //true buldugu yeri yazdırır her zaman.
            //mesela örnegımızde mailin içinde @ varsa false diyeecek ve diğer else if e geçeçek.
            //örnek "ahmet@gmail.commmm" yazalım. Burda ilk if e gelecek; @ içermiyor mu dedi cevabı false
            //aldıgından hemen else if e geçti. ondan da false alırsa digerine geçer. Vel hasılı kelam
            //true bulana kadar devam eder.
            {
            System.out.println("gecersiz mail");}
        else if (!girilenmail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");}
        else if (!girilenmail.endsWith("@gmail.com")){
            System.out.println("mailde yazim hatasi var");}
        else {
            System.out.println("mailiniz basari ile kaydedildi");

        }
        //bu yapıda switch kullanılmaz cunku swıtch, boolean, float ve double kabul etmez.
        //boolean ifadelerde başa koyulan unlem işareti olayı tersine çevirir. Örnek, "contains içeriyor" mu
        //nun başına ! koyarsak "contains içermiyorsa" anlamı çıkar
















    }
}
