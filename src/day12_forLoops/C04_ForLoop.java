package day12_forLoops;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {
        //no 46

        // kullanicidan pozitif bir tam sayi alin
        // 1'den o sayiya kadar (sayi dahil) tum sayilarin toplamini yazdirin

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi=scanedilen.nextInt();
        int sayilarintoplami=0;

        for (int i = 1; i <=sayi ; i++) {
            sayilarintoplami+=i;
            //ornegin 1 ile başaladı toplam 1 oldu. sonra gitti 2 ye dondu. 2 yi aldı (eşitligin sagında
            //n devam) toplama ekledi, toplam 1 idi 3 oldu. sonra 3 u alacak, onu toplmaa ekleeyccek ve altı olacak. daha
            //sonra 4 u alacak ve 10 olacak.....

        }
        System.out.println(sayilarintoplami);


        scanedilen.close();



    }
}
