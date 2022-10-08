package day22_arrayList_forEachLoop;

public class C09_ForEachLoop {
    public static void main(String[] args) {
         /*
          Verilen int bir array'deki
          tum elementlerin karelerini toplayip yazdirin
         */

        int[] arr = {3,4,5,1};
        int toplam=0;
        for (int each:arr
             ) {
            toplam+=each*each;
        }
        System.out.println(" elementlerin karelerini toplami: "+toplam);


       //method ile yapsaydık
        int[] yeni = {1,3,5,2};//39
        kareleritoplami(yeni);

        //method un degerlerini burda belirleseydik
        int [] burda = {3,5};//34

        int toplamlari=simdikareleritopla(burda);


    }

    private static int simdikareleritopla(int[] burda) {
        int toplam=0;
        for (int each:burda
        ) {
            toplam+=each*each;
        }
        System.out.println(toplam);

        return toplam;
    }

    public static int kareleritoplami(int [] array){

        int toplam=0;
        for (int each:array
        ) {
            toplam+=each*each;
        }
        System.out.println(toplam);

        return toplam;
    }

}
