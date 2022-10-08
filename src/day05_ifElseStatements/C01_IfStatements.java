package day05_ifElseStatements;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {
        // basit if cumleleri ile ilgili ornek
        // Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scanedilen=new Scanner(System.in); //oğrenci 50lik kagıtı okuttu, ve bu degeri scanet e atadı. scanet
        //in değeri artık 50lik kagıt. sonra java ya diyoruz ki sen bu degerin ilgili bolumunu al, yani üni yönetimi
        //olarak bana yarayacak olan 50 dir kağıt onun için, aşağıya iniyoruz nextdouble diyerek sadece 50 yi
        //bana getir diyerek 50 yi çekerek artık girilen notun bu oldugunu belirtiyoruz.

        System.out.println("Lutfen Notunuzu Giriniz");
        double girilenNot=scanedilen.nextDouble();

        if (girilenNot>=50) {
            System.out.println("Tebrikler Sınıfı Geçtiniz");
        }
        if (girilenNot<50){
            System.out.println("Çabalarınız İçin Teşekkürler");
        }







    }
}
