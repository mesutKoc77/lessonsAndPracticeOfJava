package day26_staticKeyword;

public class C02_StaticKeyword {
    public static void main(String[] args) {
        /*
        java run time programdır. yani bu class a geldimiz an eskiyi unutur
        buranın run ı ile c01 in run ı farklıdır. dolayısıyla bir başka
        class da oluşturdugumuz obj enın degerleri ne olursa olsun silinir
        ve class level da ki degerleri alır o obje.
         */

        C01_StaticKeyword obj1=new C01_StaticKeyword();
        System.out.println(obj1.no+" , "+obj1.sayi);//20,10
        obj1.no=25;
        obj1.sayi=30;

        C01_StaticKeyword obj2=new C01_StaticKeyword();
        obj2.no++;
        obj2.sayi++;
        System.out.println(obj2.no+" , "+obj2.sayi);//21,31

        obj2.no=40;//40
        obj2.sayi++;//32

        C01_StaticKeyword obj3=new C01_StaticKeyword();
        System.out.println(obj1.no+" , "+obj1.sayi);//25,32
        System.out.println(obj2.no+" , "+obj2.sayi);//40,32
        System.out.println(obj3.no+" , "+obj3.sayi);//20,32


        //static variable lar sadece bir kere oluşturulurlar fakat her bir obje oluşturuldugunda onlar için
        //surekli bir instance variable lar atanır.
        /*
        static variable lar static olsun veya olmasın tum methodlar da kullanılabilir.
         */























    }
}
