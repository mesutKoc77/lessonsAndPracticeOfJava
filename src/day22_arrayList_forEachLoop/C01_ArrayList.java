package day22_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_ArrayList {
    public static void main(String[] args) {
         /*
          Kullanicidan istedigi kadarb String alarak bir liste olusturup
          bu listeyi bize donduren bir method olusturun
          Kullanicinin bitirmesi icin Q harfine bastirin
         */
        List<String>istenenList=new ArrayList<>();
        istenenList=listeOlustur();
        System.out.println(istenenList);

    }

    private static List<String> listeOlustur() {
        List<String> olusanListe=new ArrayList<>();
        Scanner scanedilen=new Scanner(System.in);
        String girilenDeger="";

        while (!(girilenDeger.equals("Q"))){
            System.out.println("Lutfen Listenin Elemanlarını Giriniz");
            girilenDeger=scanedilen.next();
            if (!girilenDeger.equals("Q")){

                olusanListe.add(girilenDeger);
            }
        }

return olusanListe;

    }


}
