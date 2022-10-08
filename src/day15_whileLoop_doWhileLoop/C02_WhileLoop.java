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












    }
}
