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

        List<String> bambaskaList=baskaListOlusturma();
        System.out.println(bambaskaList);

    }

    private static List<String> baskaListOlusturma() {
        Scanner scanner=new Scanner(System.in);
        String ifade="";
        List<String> bambaskaList=new ArrayList<>();
        do {
            System.out.println("Lutfen kelimeleri giriniz çıkmak için 0 a basiniz");
            ifade=scanner.nextLine();
            if (!ifade.equals("0")){
                bambaskaList.add(ifade);
            }

        }while (!ifade.equals("0"));
        return bambaskaList;

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
