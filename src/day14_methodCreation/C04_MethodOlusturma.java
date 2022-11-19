package day14_methodCreation;

import java.util.Scanner;

public class C04_MethodOlusturma {
    public static void main(String[] args) {

        /*
         Kullanicidan main method icinde  isim ve soyismini alin
         Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip
         isim bosluk soyisim seklinde bize donduren bir method olusturun

         input : isim : Ali  soyisim :YILMAZ
         output : Ali Yilmaz
         */
        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim=scanedilen.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim=scanedilen.nextLine();

        System.out.println(isimsoyisimBirlestirme(isim,soyisim));//yazdırdık

        String yenidegereatadik=isimsoyisimBirlestirme(isim,soyisim);//şimdide yeni bir variable a atama yaptık
        System.out.println(yenidegereatadik);

    }



    public static String isimsoyisimBirlestirme (String isima,String soyisimb){

        String birlemisisim=isima.substring(0,1).toUpperCase()+
                            isima.substring(1).toLowerCase()+
                            " "+
                            soyisimb.substring(0,1).toUpperCase()+
                            soyisimb.substring(1).toLowerCase();

        return birlemisisim;












    }











}
