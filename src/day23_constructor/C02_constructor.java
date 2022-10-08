package day23_constructor;

public class C02_constructor {
    public static void main(String[] args) {

        Araba arb1=new Araba();
        //eşitligin sagındaki bölüm constructor dır.
        arb1.marka="Toyota";
        arb1.model="Corolla";

        //eşitliğin solunda evet ben bir araba alacagım diyorsun ama eşitilipin sagı ile de ne tur bir araba alacagını
        //soylemiş oluyorsun ki bu da bizi constructor a goturuyor.

        System.out.println(arb1.marka + arb1.model);//ToyotaCorolla

        Araba arb2=new Araba();
        System.out.println(arb2.marka + arb2.model);//burda deger atamsı
        //yapılmadıgından ilgili variable ların default degerlerinin
        //atamaası gerçekleşir. String ler için tabii ki Null atanır.
        //null, null

        Araba arb3=new Araba("Corolla");//şimdi ise manuel
        //olarak ekledigimiz <<Araba(String model){}>> parametreli
        //constructor dan obje oluşturduk.





    }
}
