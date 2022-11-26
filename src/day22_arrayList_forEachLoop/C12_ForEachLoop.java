package day22_arrayList_forEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C12_ForEachLoop {
    public static void main(String[] args) {

         /*
        Kullanicidan bir cumle ve bir harf alin
        for-each loop kullanarak
        harfin cumlede kac kez gectigini bulup yazdirin
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen Cumleyi Giriniz");
        String cumle = scan.nextLine();
        System.out.println("Lutfen Harf Giriniz");
        String harf = scan.next().substring(0, 1);//eger bir kaç harf girerse ilk harfini alabiliriz.//char lar
        //method larda cuk kullanılmıyor dolayısyla string alıp ilk harfini aldım.

        String [] karakterler=cumle.split("");
        System.out.println("bir görelim: "+Arrays.toString(karakterler));//bir görelim.
        int sayac = 0;

        for (String each:karakterler
             ) {if (each.contains(harf)){
                 sayac++;
        }

        } if (sayac==0){
            System.out.println("harf yok");
        } else {
            System.out.println(sayac);}



    }





    }
