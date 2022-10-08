package day05_ifElseStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen karakteri giriniz");
        char girilenHarf=scanedilen.next().charAt(0);

        if (girilenHarf>='a' && girilenHarf<='z') {
            System.out.println( (char) (girilenHarf-32) );
        } else {
            System.out.println(girilenHarf);}








    }
}
