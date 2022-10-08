package day25_constructorCall_static;

public class Deneme {
    //obje lerin ozellikleri olacak instance var,able ları atayalım
    String isim="John Doe";
    int yas=40;
//şimdi constructor oluşturulaım

    public Deneme(){
        isim="Seher";

    }
    //şimdi de parametreli constructor oluşturulaım

    public Deneme(String isim, int yas) {
        this();
        this.yas = yas;//bu scope da yas variable ının degeri var mı? var. hemen prantezlerin içinde. onu alacak ve yas
        //a atayacak. olmasayadı yukarıdakı ınstance yas ı atayacaktı.
    }

    //şimdi de main method oluşturarak orada istedigimiz ozelliklerde araba lar uretelim. istedigimz ozelliklerde
    //obje ler oluşturulaım. Unutmayalım obje oluşturur  oluşturmaz hemen objenın ınstance variable ları atanır

    public static void main(String[] args) {
        Deneme obj1=new Deneme();//hemen yukarı çıktı parametresiz constructor ı buldu içe girmeden once instance variable
        //ları atadı. isim john doe ve yas 40 dedi daha sonra  suslu nun içinde isim variable ına baktı ilgili scope da
        // isim variable var mı ? yok. o zaman demek ki bu isim variable ı class level daki ınsatnace isim variable ına
        //aittir ve ona atamış oldu.
        // instance isim seher oldugundan instance isimin
        //degerini seher ile degiştrdi. yaş da degişkilki olmadıugından 40 olarak devam etti.
        Deneme obj2=new Deneme("Fatih",35);
        System.out.println(obj2);////Deneme{isim='Seher', yas=35}
        System.out.println(obj1);//Deneme{isim='Seher', yas=40}

        System.out.println("isim:"+obj1.isim+
                           "yas:"+obj2.yas    );//isim:Seheryas:35
    }


    @Override
    public String toString() {
        return "Deneme{" +
                "isim='" + isim + '\'' +
                ", yas=" + yas +
                '}';
    }


}
