package day37_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_ExceptionE {

    public static void main(String[] args) {
         /*
        kullanicidan bir tamsayi isteyin
        kullanici tam sayi girerse karesini yazdirin
        kullanici tamsayi disinda bir deger girdiginde
        hata mesaji verip yeniden deger isteyin

        kullanici tamsayi girene kadar islem devam etsin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");

        /*
        buradaki e, ilgili hata turu yakalandıgında bunun muhafaza edilecegı variable ismidir.
        istersek degiştire de biliriz.
        e objesi ile e. diyerek kullanıcının gorebilecegı hazır hata mesajları yazdırlıabilir.
        veya biz e yi kullanamdan istedigimiz hata mesajını yazdırabiliriz. orn:"adam gibi bir deger gir"

         */


        try {
            int girilenSayi=scan.nextInt();
        } catch (InputMismatchException e) //yani  InputMismatchException gordogumde ne yapcagım?
        {
            //System.out.println(e.getMessage());//null
            //System.out.println(e.toString());//java.util.InputMismatchException
            //e.printStackTrace();//uzun hata mesajı veriyor
            System.out.println("adam gibi bir deger gir");

        }


    }





}
