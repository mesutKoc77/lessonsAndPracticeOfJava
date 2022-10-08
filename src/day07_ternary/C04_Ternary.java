package day07_ternary;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {

        // 37//
        // Kullanicidan bir sayi isteyin
        // Kullanicinin girdigi sayiyi kontrol edip
        // sayi cift sayi ise 2 ile carpin
        // tek sayi ise 10 ile toplayin


        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen bir deger giriniz");
        int sayi=scanedilen.nextInt();


        sayi=sayi % 2 == 0 ? sayi * 2 : sayi + 10; //burada sayının degeri artık degişti.

        System.out.println("girdiğiniz sayiyi degiştirdik ve \nyeni sayiniz \n"+sayi+ " oldu");//burda ise
        //yani sout ta ise yalnızca yeni degeri yazdırmış oluyoruz, deger atama yapmıyoruz.






    }
}
