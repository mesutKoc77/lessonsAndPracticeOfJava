package day04_operators;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class C05_IfStatements {

    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen üçgenin kenarlarını giriniz");

        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3=scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3) //java üçlü eşitlik kontrolu yapamaz.parçalara bölmek gerekiyor
            {
            System.out.println("Üçgen, eşkenar üçgendir");
        }

        /*
        quiz den notlar
        boolean, hiçbir variable a donuşturulemez.
        eşitliğin sağı deger, solu variabledir. küçük değer buyuk variable atılabilir buna wiedening drnir.
        explicit ise buyugun kucuk variable a atanmasıdır.
        double ı int e casting yaptıgımızda explicit olacak ve double da bulunan vırgulden sonrakiler
        silinecek. yuvarlama degıl direkt atıyor.
        sout da çift tırnak içinde ne yaarsa onu yazar.
        çift tırnaksız yazarsan x i, o zaman java gider x i bulur ve değeri atar.
        tek tırnak içinde sadece ama sadece bir harf olur.
        next() ve nextLine(); java da kullanıcıdan bilgi alınması istendiğinde kullanılır.next (), space i
        gorene kadarki kelimeyi alır. nextLine() ise, \n yi yani bir alt satırı gordugu ana kadaar devam eder.
        https://www.geeksforgeeks.org/

        int num=10;

        num+=3 demek num a 3 ekle ve numa eşitle, 13
        num-=5 ise numdan 5 çıkar num a eşitle. 5
        num-- demek num dan bir çıkart
        num++ demek numa bir ekle demek

        java da aşagıakı gıbı bır kullanım yoktur.
        nam=+1;
        bunun yerine
        nam++; ya da num+=1;
        */

    }

    }

