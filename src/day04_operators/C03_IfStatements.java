package day04_operators;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

        // Kullanicidan bir sayi isteyin,
        // sayiyi kontrol edip 5 ile bolunebiliyorsa “Sayi 5’in tam kati” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayı giriniz");
        int girilenSayi=scan.nextInt();

        if (girilenSayi%5==0) { //bak burda suslu parantez acarak; java'ya aşağıdaki body if e baglıdır,
            //çalışıp çalışmamasına ona bağlıyorm dedik.//burda % işareti kalanı bulmak için kullanılır.

        System.out.println("Girilen Sayı 5 in katıdır");//burda bolunen olursa yazdırır aksi halde yazdırmaz
            //ve basit if cumlecıgı oldugu için gerisiyle ugrasıp kendisi, BOLUNMEZ demez bunun yerine
            //hiç yazdırmaz.banane der, boluyorsa yazdırırım. basif if cumleleri bunlar.
        }













    }




}
