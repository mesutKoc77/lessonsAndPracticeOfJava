package day39_exceptions;

public  class C02_Final {

    static  final int OKUL=111;//DEGİŞTİREMZSİN MESELA BUNU VE GENELDE VARİABLE İSMİ BUYUK HARF OLUR.

    public static void main(String[] args) {

        /*
        final; variable, method ve class lar için kullanılabilir. ama son defgerdir sonradan deger atanamaz.
        bu bir etiketttir yani bir data turu degildir.
        ama method final olarak tanımlanır etiket lenırse override edilemez. dolayısyla guncelleyemezsin neyse odur.
        class, final olarak tanımlanırsa bu durumda da parent ilan edilemez.

        FİNALLY blogu ise;
        try blogu ile kullanılır< exception olussa da oluşmasa da çalışır.

       finalize() ise; bir methoddur, garbage collector için bir on hazırlık yapar e kullanılmayan objeleri toparlar.

         */

        final int sayi=10;
        System.out.println(sayi);
        //sayi=20;//dyemezsın

        System.out.println(Integer.MAX_VALUE);


    }
    public static final void methid1(){

    }




}
