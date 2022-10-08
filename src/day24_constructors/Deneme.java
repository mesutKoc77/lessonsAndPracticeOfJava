package day24_constructors;

public class Deneme {
    String isim="John Doe";
    int yas=40;

    public Deneme(){
        isim="Seher";
    }

    public Deneme(String isim, int yas){
        this();
        this.yas=yas;
    }

    public static void main(String[] args) {
        Deneme obj1=new Deneme();
        Deneme obj2=new Deneme("Fatih", 35);
        System.out.println("iisim"+obj1.isim+
                "yas:"+obj2.yas);
    }
    //16.17



}
