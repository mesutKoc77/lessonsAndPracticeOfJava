package day07_ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        // 36 no Soru 3- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen bir harf isteyiniz");
        char harf= scanedilen.next().charAt(0);

        System.out.println(harf>='a' && harf<='z' ? (char) (harf-32) : harf);



    }
}
