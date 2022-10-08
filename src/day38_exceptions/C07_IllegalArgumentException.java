package day38_exceptions;

import java.util.Scanner;

public class C07_IllegalArgumentException {
    public static void main(String[] args) {

        /*
        biz istersek kontrolllu exception da fırlatabiliriz.

        kullanıcıdan yasını isteyen negatif girrese
        IllegalInputException fırlatıp çalışmayı durdururun

         */
        /*
        biz kodumuzun istyedigimiz satırında exception fırlattırabilriiz.
        bu exceptionın turunu de biz belirleyeblirz.
        bir throw keyword u ile bir exception fırlatılabilir.z
        throw kelimesinden sonra new + exception class ı +parametre olarak da hata mesajı yazılabilir.

         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Ltfen yasınızı giriniz");
        int sayi=scan.nextInt();

        if (sayi<0){
            throw new IllegalArgumentException("yas negatif olamaz");
        }

    }

}
