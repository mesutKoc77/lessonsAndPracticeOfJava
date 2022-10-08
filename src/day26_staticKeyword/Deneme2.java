package day26_staticKeyword;

public class Deneme2 {
    static int sayi=20;
    int yas=40;

    public Deneme2() {
        sayi++;
        yas++;
    }

    public static int method1(){
        return sayi;
    }

    public int method2(){
        return yas;
    }

    public static void main(String[] args) {
        Deneme2 obj1=new Deneme2();
        System.out.println(obj1.yas + " " + obj1.sayi);//,41,21
        Deneme2 obj2=new Deneme2();
        System.out.println(obj2.yas + " " + obj2.sayi);//41,22
        Deneme2 obj3=new Deneme2();
        System.out.println(obj3.yas + " " + obj3.sayi);//41,23

        //buraya kadar her bir obje oluşturmada static in degeri surekli degişti.Yani obje 2 yi oluştururduktan sonra
        //sen yeniden obje 1 in static degerini yazdırsan artık obje 2 oluşturulurken 1 arttırıldıgı için statik in yeni
        //degeri yazılmış olacaktır.
        obj1.sayi++;//24
        obj2.sayi++;//25
        System.out.println(obj1.sayi);//25
        System.out.println(obj1.yas + " " + obj1.sayi);//,41,25
        System.out.println(obj2.yas + " " + obj2.sayi);//41,25
        System.out.println(obj3.yas + " " + obj3.sayi);//41,25
        //aslında kafaa karışıklıgını gidermek için statşc olanın başına instance variable ın eklenmemesi daha saglıklı
        //olacaktır. zaten static herpsi için gecerlidir yani obj1 ın statiği ile obj2 nın statiği aynı dır sonuçta
        //static varaible lar class a baglıdırlar kesinlikle objelerle baglantılı degildirler.


    }

}
