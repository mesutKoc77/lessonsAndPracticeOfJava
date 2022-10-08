package day13_forLoops_nestedForLoop;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {


    //no 50 Kullanicidan bir String alip tersten yazdirin


    Scanner scanedilen=new Scanner(System.in);
    System.out.println("Lutfen bir cumle giriniz");
    String cumle=scanedilen.nextLine();

    //"Java candir";//geldim buraya son inkdekstekren başlayark bierinci indekse dogru yazdıracagım.
        //son indeksi de length-1 den bulabilirim. sonra 1 er dazalatark yazdırırıö
        //15.35



        for (int i =cumle.length()-1; i >=0 ; i--) {
            System.out.print(cumle.charAt(i));
        }


        //terse ceviridigimiz hal, orjinal haliyle aynı mı?
        //sadece yazdırmak bır sonuctur. ama hafıza'ya kaydetmez.sout da sisteme kayıtlı degıl henuz.













    }



}
