package day15_whileLoop_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        // iki basamakli sayilardan 7 ile bolunebilenleri whileloop ile yanyana yazdirin

        int sayi=10;

        while (sayi<100) {
            if (sayi % 7 == 0) {
                System.out.print(sayi + " ");
            }
            sayi++;//bu artttırım işlmeini manuel ekleedik.
        }

        /*

        while lopp da da balangıç şarrtı, bitiş şartı ve arttırım miktarını yazmak zorundayız.


        özlelikle artış miktarı unutulursa sonsuz loop oluşur.
         */


        //***********************************
        int a = 0;
        for (a = 0; a < 10; a++)//en son geldi a ya 10 dedi a ya atmaasını yaptı ama a<10 şartı true olmadıgından
        //if body sini yazdırmadı.
        {
            System.out.println(a);
        }

        System.out.println("for için a degerimiz : " + a);

        System.out.println("**********");

        a = 0;
        while (a < 10)//en son geldi a ya 10 dedi a ya atmaasını yaptı ama a<10 şartı true olmadıgından
        //if body sini yazdırmadı.
        {
            System.out.println(a);
            a += 2;
        }
        System.out.println("while için a degerimiz : " + a);

        //dongu den 3 tmeel aşama var a ya variable ını veya degerini ata, şartı koy, arttırım miktarını koy
        System.out.println("**************************");
        a = 0;

        do {
            System.out.println("do while donuyor : " + a);
            a += 3;
        } while (a < 10); //12 yi aldı a ya atadı ama burada while şartı artıkfalse oldugu için yukarıdaki loop
        // kırıldı

        System.out.println("do while için a degerimiz : " + a);


    }
}
