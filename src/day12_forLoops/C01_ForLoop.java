package day12_forLoops;

public class C01_ForLoop {
    public static void main(String[] args) {
        //no 43
        //1 den 100 e kadar (100 dahil)olan sayıları yan yana aralarında bir boşluk bırakarak yazdıralım

        for (int i = 1; i <=100; i++) {
            System.out.print(i+" ");

        }

        // 1'den 100'e kadar(100 dahil) sayilardan
        // 3 ile bolunebilenleri yan yana aralarinda bir bosluk birakarak yazdiralim
        System.out.println("");

        for (int i = 1; i <=100 ; i++) {
            if (i%3==0) System.out.print( i+" ");
        }

        // 1'den baslayarak sayilari 3'er 3'er artirarak yazdiralim
        // 100 ust sinir
        System.out.println(" ");

        for (int i = 1; i <=100 ; i+=3) {
            System.out.print(i+(" "));
        }



















    }
}
