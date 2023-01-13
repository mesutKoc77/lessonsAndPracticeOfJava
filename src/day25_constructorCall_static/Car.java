package day25_constructorCall_static;

public class Car {
    String marka = "Toyota";


    public static void main(String[] args) {


        Car car1;
        // System.out.println(car1.marka);
        /*
        car 1 e deger atmaadogımız için sout yapamadık. yani kkullanamadık ama oluşturmaya da itiraz etmez.
         */
        Car car2 = null;
        //System.out.println(car2.marka);
        //null bir degr degildir.java eşittir işaretigini gordugunden cte vermez ama çalıştırmak isteedgimizde
        //null pointer exception verir.

        System.out.println(new Car().marka);//burda atama yok fakat sadece çalıştrıdk.


    }


}
