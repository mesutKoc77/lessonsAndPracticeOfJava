package day11_stringManipulations_forLoop;

import java.util.Scanner;

public class C05_Soru3 {
    public static void main(String[] args) {

         /* no 69
          Kullanicinin String olarak verdigi iki fiyati
          toplayabilen bir kod yaziniz
         */

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen Birinci Sayıyı Giriniz");
        String birincifiyat=scanedilen.next();
        int yenibirincifiyat=Integer.parseInt(birincifiyat);

        System.out.println("Lutfen İkinci Sayıyı Giriniz");
        String ikincifiyat=scanedilen.next();
        int yeniikincifiyat=Integer.parseInt(ikincifiyat);

        System.out.println(yenibirincifiyat+yeniikincifiyat);

        scanedilen.close();

        //Başka bir çözüm

        String fiyat1= "$20.25";
        String fiyat2= "$34.40";

        fiyat1=fiyat1.replaceAll("\\D","" );//non int olanların tmamanını yokm ettik
        fiyat2=fiyat2.replaceAll("\\D","" );

        System.out.println(fiyat1+fiyat2);//dikkat hala string dolayısyla toplayamadı

        //imdadımıza reperclass lar geliyor. Reperclass int,short, boolean onların metod halleri

        double yenifiyat1=Double.parseDouble(fiyat1)/100;//işte burda string fiyat 1 ı artık int a yani sayısal degere donuturdu
                                                         //yukarıda yok ettigimiz noktaları tekrar elde etmek için de 100 e bolduk.
        double yenifiyat2=Double.parseDouble(fiyat2)/100;//yukarıısyla aynı

        System.out.println("fiyat1 :" + yenifiyat1);
        System.out.println("fiyat2 :" + yenifiyat2);
        System.out.println("Toplamı ise : TL"+ (yenifiyat1+yenifiyat2));

        /*
        parseInteger veya parseDouble, String olarak girilen ancak tamamen sayılardan oluşan ifadeleri int veya double a cevirir.
        */






    }
}
