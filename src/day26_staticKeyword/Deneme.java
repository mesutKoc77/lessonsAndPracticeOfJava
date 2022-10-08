package day26_staticKeyword;

public class Deneme {
    static int sayi=20;
    int yas=40;


    public Deneme() {


    }


    public void Deneme(){
        sayi++;
        yas++;
    }

    public static void main(String[] args) {
        Deneme obj1=new Deneme();//20,40
        Deneme obj2=new Deneme();//20,40
        System.out.println(obj2.sayi + " " + obj2.yas);//


    }





}
