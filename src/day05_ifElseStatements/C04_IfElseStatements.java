package day05_ifElseStatements;

import java.util.Scanner;

public class C04_IfElseStatements {

    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Bir karakter giriniz");
        char girilenHarf=scanedilen.next().charAt(0);

        if (girilenHarf>='A' && girilenHarf<'Z') {
            System.out.println("Karakter Buyuk Harf");
        } else {
            System.out.println("Karakter Kucuk Harf");}


    }
}
