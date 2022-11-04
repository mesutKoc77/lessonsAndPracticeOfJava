package day12_forLoops;

import java.util.Scanner;

public class C03_ForLoop {
    public static void main(String[] args) {

        // kullanicidan baslangic ve bitis sayilarini alin
        // sinirlar dahil olmak uzere
        // sinirlar ve aralarindaki sayilardan 5 ile bolunebilenleri yazdirin
        // NOT : kullanici once buyuk sayi, sonra kucuk sayi girebilir

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen başlangıç sayınızı giriniz");
        int baslangic=scanedilen.nextInt();
        System.out.println("Lutfen bitiş sayınızı giriniz");
        int bitis=scanedilen.nextInt();

        if(baslangic<bitis) {
            for (int i = baslangic; i <=bitis ; i++) {
                if (i%5==0) {
                System.out.print(i + (" "));}
            }
        }else if (baslangic>bitis){
            for (int i = baslangic; i >bitis ; i--) { if (i%5==0) {
                System.out.print(i + (" "));}
            }

        }
        scanedilen.close();











    }
}
