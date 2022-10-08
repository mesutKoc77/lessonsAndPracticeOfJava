package day02_scanner_dataCasting;

import java.util.Scanner;

public class C10_Datacasting {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char girilenHarf=scan.next().charAt(0);
        System.out.println("Girilen Harf :" + girilenHarf);

        System.out.println("girilen harften bir sonraki harf" + (char) (girilenHarf+1));

        System.out.println("girilen harften bir sonraki harf" + (char) (girilenHarf+2));

        System.out.println("girilen harften bir sonraki harf" + (char) (girilenHarf+3));

        //çözüm, sayı degeri istemiyoruz dolayısyla değerleri char, yani harf olarak ıstedgmzden
        //başlarına char ekleyerek, harfe donusturduk.








    }
}
