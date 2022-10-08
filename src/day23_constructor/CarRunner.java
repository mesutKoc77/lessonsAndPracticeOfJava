package day23_constructor;

public class CarRunner {
    public static void main(String[] args) {

        Car car1=new Car();//car class ından instance variable ve instance methodlardan birer kopya
        //oluşturdu.

        System.out.println(car1.fiyat+","+car1.ilanNo +","+
                car1.marka +", "+ car1.model + ", "+
                car1.yil);

        // 0,0,deger atanmadi, deger atanmadi, 0

        car1.yil=2017;
        car1.model="prius";
        car1.marka="Toyota";
        car1.ilanNo=1234;
        car1.fiyat=12000;

        System.out.println(car1.fiyat+","+car1.ilanNo +","+
                car1.marka +", "+ car1.model + ", "+
                car1.yil);//12000,1234,Toyota, prius, 2017

        Car car2=new Car();//yukarıdaki gibi bir obje nın her ozelligini yeniden yazmak zor
        //olacagından java da bunun kısa yolu vardır.

        System.out.println(car2);//code, generate bolumunden toString ile oluşturdugumuz
        //tum degerlere buradan hemen ulaşabildik. tek tek yazmak zorunda kalmadık.
        System.out.println(car1);//yukarıdaki gibi tek tek yazmadık.
        //ilanNo:1234, marka:'Toyota', model:'prius', yil:2017, fiyat: 12000
        /*
        yani toString ile matbuu sabit özellikleri bir arada bulup gorebiliriz.
        ama deger atamadk için tek tek deger atanmalı.
         */
        car2.yil=2019;
        car2.model="corsa";
        car2.marka="Opel";
        car2.ilanNo=1235;
        car2.fiyat=10000;
        System.out.println(car2);
        //ilanNo:1235, marka:'Opel', model:'corsa', yil:2019, fiyat: 10000

        Car car3=new Car(1236,"volvo","s90",2010,13000);
        System.out.println(car3);
        //ilanNo:1236, marka:'volvo', model:'s90', yil:2010, fiyat: 13000

    }
}
