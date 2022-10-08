package day05_ifElseStatements;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C07_IfElseIfStatements {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan mesafeyi kilometre olarak alin
        ve cevirmek istedigi birimi sorun,
        istedigi birim metre veya santimetre ise cevirip yazdirin,
        yoksa “istediginiz birim sisteme kayitli degil” yazdirin.
         */

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen mesafeyi km cinsinden giriniz");
        int girilenKm=scanedilen.nextInt();
        System.out.println("Lutfen Tercihinizi Giriniz"+ "\nMetre=M(m)" +"\nSantimetre=S(s)" );
        char tercih=scanedilen.next().charAt(0);
        if (tercih=='M' || tercih=='m'){
            System.out.println(girilenKm*1000);

        } else if (tercih=='S' || tercih=='s') {
            System.out.println(girilenKm*100000);
        }
        else {
            System.out.println("İstediginiz Birim Sisteme Kayıtlı Değil");}


    }
}
