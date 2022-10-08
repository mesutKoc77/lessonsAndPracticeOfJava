package day13_forLoops_nestedForLoop;

public class C05_nestedForLoop {
    public static void main(String[] args) {

        /*
         Asagidaki sekli yazdiran bir program yaziniz
         kac satir oldugu ve stirda kac yildiz olacagi input olarak veriliyor
         * * * * * * * *
         * * * * * * * *
         * * * * * * * *
         * * * * * * * *

         */

        //burda 4 satır ve her satırda 8 yıldız var. inner loop 1 den başlayıp 8 e kadar yani 8 kere yıldız yazdrcak.
        //outer loop da satır sayısı kadar bunu tekrarlayacak yanş 4 kere ama her inner bitişinde aşağıya inmesi lazım.
        //yani 1. satırda 8 adet yıldız yazdırdın hemen aşağıya in.

        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=8; j++) {
                System.out.print("* " );

            }
            System.out.println("");

        }
        //yani şunu yaptık. dış loop emri verdi 1 kere yap dedi inner loop u. bu emir çerçevesinde inner a indi. inner 1
        //den başladı 8 kere yazdı ve false u gordugu an yan 9 u gordugu an hemen aşğıya ındı ve sout u yazdırıp outer daki
        //2. kez inner loop vazifesini yazdır dedi ve 4 e kadar devam etti.














    }
}
