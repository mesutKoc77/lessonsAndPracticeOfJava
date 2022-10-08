package day36_polymorphism;

public class C02_Overriding extends C01_Overloading {

    public static void main(String[] args) {
        /*
        overriding parent class daki bir methodu child class a uyralamak için kullanılır
        overriding yapabilmke için parent taki ile child daki methodun sigrnature ları
        aynı olmak zorundadır.
        child class a uyarlamayı da mthod body sınde yaparız

        sıgranute farklı olursa bu ıkı method overriden veya overriding method degil de farklı
        iki method olur.

         */

        C02_Overriding obj=new C02_Overriding();

        obj.islem(4,5);//20.0//
        obj.islem("VEli","CEM");//parent tan çekti geitrdi
        obj.islem("Hasan",4);//Hasan//bu scope da oldugundan bunu aldı.

        C01_Overloading obj2=new C02_Overriding();
        obj2.islem(5,6.4);//aramaya once data turu olan eşitiliğin solundan
        //başlıyoryz ve daha sonra override edilmiş mi ona bakıyoruz// override edilmiş aşağıda
        obj2.islem(5,"Ali");//parent a gittik bulduk, override edilmiş mi?
        //hayır dolayısıyla uyguladık.//5 Ali
        C01_Overloading obj3=new C01_Overloading();
        obj3.islem(5,6);//11.0//direkt parent dan aldık geldik. cunku
        //hem ozelligilini aldıgım yer hem de constructor aynı class dan. dolayısyla
        //override edilecek yer de constructor ın class ı oldugundan orda kaldı.

        obj3.islem(5,"Ali");//5 ALi



    }
    public void islem(double a, double b){
        System.out.println(a*b);

    }
    public void islem(String c,int d){
        System.out.println(c);
    }


}
