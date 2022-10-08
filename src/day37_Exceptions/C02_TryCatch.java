package day37_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_TryCatch {
    public static void main(String[] args) {

        /*
        yzdıgımız kodda oncesinden bir hata oluşma riski ongurursek o kod blogunu trycatch ile sarmalarız.
        try/catch de uc blok var
        1-try blogu: hata cıkma ihitmalinin oldugu yer
        2- catch keywordu () sabittir.
        parantez deki exception turu de yazacgımız koda gore degişiypr
        e harfiise yakalanan hatanın(exception) muhafaza edilecegı obje dir.
        3- catch {} blogu ise hata olması durumunda çalıaşcak koddur.

        try catch blogu ile hem kodu çalıştırabilir ki burada iyi gunler yazdı
        hem de sorunu ("hayat ne guzel")  kullanıcıya bildirebirliriz.

        buna kodun handle edilmesi denir ve boylece kodun çalışması devam eder.

         */

        Scanner scan;//while ın içinde surekli olarak scanner objesi oluşturmamak için scan ın Scanner data turu
        //oldugunu burada belirttim ve while içinde surekli olarak her yazılan scan objesini ben alacagım.
        //Ben scan objesini buraya yazarak scan ın Scanner clasında oldugunu belirttim ve sonradan aşağıda deger ata
        //mış olacagım.her seferinde obje oluşmadı sadece deger atanmış olacaak.
        boolean tekrar=true;//kod bogunu sureklı tekrarla
        int girilenSayi=0;//loop un içinde oluşturmuş olsaydım en aşağıda göremezdim ondan burada girdim.

        while (tekrar){
            scan=new Scanner(System.in);
            System.out.println("Lutfen bir tamsayi giriniz");
            try {
                girilenSayi=scan.nextInt();
                break;//bunu diyerek şu emri veriyorum. Problemle karşılaşmazsan dur ve kodu çalıştır. ama problemle
                //karşılaştırgın muddetce de aşağıyı surekli devam ettir.break ın anlamı loop u burada kır demektir.
            } catch (InputMismatchException e) {
                System.out.println("lutfen adam gibi bir deger gir");
            }

        } System.out.println("girilen sayinin karesi : " + girilenSayi*girilenSayi) ;

    }
}
