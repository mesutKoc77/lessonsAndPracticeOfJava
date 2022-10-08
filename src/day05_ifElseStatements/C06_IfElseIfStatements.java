package day05_ifElseStatements;

import java.util.Scanner;

public class C06_IfElseIfStatements {
    public static void main(String[] args) {

         /*
        Ogrencinin notu 85 ve ustu ise AA,
        (85 ve ustu  degilse) 65 ve ustu ise BB,
        (65 ve ustu  de degilse) 50 ve ustu ise CC,
        (geriye kalanlar) DD

         */

        //

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen Notunuzu Giriniz");
        double girilenNot=scanedilen.nextDouble();

        if (girilenNot>=85){
            System.out.println("Notunuz AA" );
        } else if (girilenNot>=65) { //else if in anlamı "değilse" yan, yukarıdaki şart false ise....yani true yu
            //bulana kadar devam edecek, false, false diye devam eder. true yu buldugu an durur ve onu yazar
            System.out.println("Notunuz BB"); }
        else if (girilenNot>=50) {
            System.out.println("Notunuz CC");}
        else //geriye kalan her ne varsa
            {System.out.println("Çabalarınız için Teşekkürler");}

            //kod her zaman yukarıdan aşağıya çalışır. yukarıdaki kodlardan biri biterse, hemen aşagıya geçer
            //ve devam eder. else de sadece iki secenek vardı ama else if lerde birden fazla secenek vardır
            // else kullanılmazsa kodlar ve mantık birbirine bağlı degıldır.





        }

    }


