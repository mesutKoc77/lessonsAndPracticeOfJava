package day13_forLoops_nestedForLoop;

public class C07_NestedLoop {
    public static void main(String[] args) {
        /*
         Asagidaki sekli yazdiran bir program yaziniz
         kac satir oldugu ve stirda kac yildiz olacagi input olarak veriliyor
         *
         * *
         * * *
         * * * *


         */

        System.out.println("satırımız 4 olsun");

        int satir=4;

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i; j++)
                //burası false olana kadar süslü pazarntezin dışına çıkıp işlem yapmaz
                //ne zaman ki burası false oldu süslü nün dışındakini yazdırır.
            {
                System.out.print("*"+" "  );
            }
            System.out.println("");

        }


        System.out.println("şimdi satırı sekiz yapalım");

        satir=8;
        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i; j++)
            //burası false olana kadar süslü pazarntezin dışına çıkıp işlem yapmaz
            //ne zaman ki burası false oldu süslü nün dışındakini yazdırır.
            {
                System.out.print("*"+" "  );
            }
            System.out.println("");

        }









    }
}
