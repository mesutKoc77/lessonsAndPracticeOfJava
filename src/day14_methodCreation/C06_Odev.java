package day14_methodCreation;

import java.util.Scanner;

public class C06_Odev {
    public static void main(String[] args) {

         /*
          Basit bir islem merkezi olusturma
          Kullaniciya 4 tercih sunup istedigini gerceklestirecek 4 method olusturun
          1- girilen sayi asal sayi mi ?
          2- girilen sayi palindrome mu ?
          3- girilen sayiyi tam olarak bolen tamsayilarin adedi 5'den cok mu ?
          4- sayinin rakamlar toplami

          4 method'da string olarak sonucu donecek
          main method'da sonuc bir variable'a kaydedecek
          ve sonra yazdiracak

         */
        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Hangi sayi için işlem yapmak istiyorsunuz");
        int sayi1=scanedilen.nextInt();

        System.out.println("Lutfen yapmak istediginiz işlemi seçiniz"+ "\nGirdigim sayi " + "\n1-Asal sayi mi?" +" \n2-Sayi palindrome mu?"
                +"\n3-Tam bolen sayisi kac tane? " + "\n4-Sayinin rakamlar toplami kac?");

        int sayi2=scanedilen.nextInt();


        switch (sayi2){
            case 1: //girdigim sayı asal mı?
                System.out.println(girdigimSayiAsalmi(sayi1));
                break;
            case 2://2-Sayi palindrome mu?"
                System.out.println(sayipalindromemu(sayi1));
                break;
            case 3: //3-Tam bolen sayisi kac tane?"
                System.out.println(tambolensayisibul(sayi1));
                break;
            case 4: //"4-Sayinin rakamlar toplami kac?"
                System.out.println(rakamlarToplami(sayi1));
        }

    }
    public static String girdigimSayiAsalmi (int sayi3){

        boolean asal=true;
        String sonuc="";

        for (int i = 2; i <sayi3 ; i++) {
            if (sayi3%i==0) {
                sonuc="girdiginiz sayi asal degil";
                asal=false;
                break;
            }
            else if (asal){
                sonuc="girdiginiz sayi asal";
            }
        }
        return sonuc;
    }
    public static String sayipalindromemu (int sayimiz) {

        String strsayi=sayimiz+"";
        String terssayi="";
        String sonuc2="";

        for (int i = strsayi.length()-1; i >=0; i--) {

            terssayi+=strsayi.charAt(i);
        }
        if (strsayi.equalsIgnoreCase(terssayi)) {
            sonuc2="Sayi Palindrome";
        } else { sonuc2="Sayi Palindrome degil";}

        return sonuc2;
    }
    public static String tambolensayisibul (int sayimiz) {

        int tamBolenSayisi=0;

        for (int i = 1; i <=sayimiz ; i++) {
            if (sayimiz%i==0){
                tamBolenSayisi++;

        }

        }
        return tamBolenSayisi +"";
    }
    public static String rakamlarToplami (int girilensayi){

        int rakamlarToplami=0;
        int birlerbasamagi=0;

        String strgirilenSayi=girilensayi+"";

        for (int i = 1; i <=strgirilenSayi.length() ; i++) {
            birlerbasamagi=girilensayi%10;
            rakamlarToplami+=birlerbasamagi;
            girilensayi=girilensayi/10;

        }
        return rakamlarToplami + "";
    }
    /*
    java, argumentlerle paraemtrelerin uyumunu kontrol eder.
    syntax
    public static void methodAdi (argumentler-parametreler) {Kodlar=
    static olamyan methodlar static den çağrılamzmlar
    void: return type dır. method un hangi data turunde bir sonuç uretecegını ve bize doınduracgn belirtir.
    Return type, void olursa: yani method sadece görevini ypacak ama bize bir şey döndürmeecek.
    Return type'i void olan methodlar, genelde bir şey yazdırmak amacı gudulen hedeflerde kullanılır.(çocuga elektrik
    faturası yatırtmak gibi dusunebiliriz. Makbuz bize fatura odendi belgesi veriir.
    return type'i void den baska data turune sahip olan method lar, mutlaka return keyword u ile dondureckeleri data
    uygun br sonuc veya variable dondururler.
     */

}
