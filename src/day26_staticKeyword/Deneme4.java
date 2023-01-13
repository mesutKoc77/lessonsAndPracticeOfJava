package day26_staticKeyword;

public class Deneme4 {
    static int sayi=20;
    static String okul="ITU";
    int yas=40;

    public Deneme4(int a, int b, String c){
        this.sayi=a;
        this.yas=b;
        this.okul=c;
    }
    public static void method1(Deneme4 variable){

        System.out.println("sayi" + variable.sayi + "yas:" + variable.yas + " " + "okul:" + variable.okul);
    }

    public static void main(String[] args) {
        Deneme4 obj1=new Deneme4(20,30,"ODTU");
        Deneme4 obj2=new Deneme4(15,25,"Marmara");

        method1(obj1);//sayi 15, yas 30,marmara//burada şunu yaptık, method1 de bulunan dnm ye direkt obj1 in tum deger
        //lerini atadım.
        method1(obj2);//sayi 15, yas 25, marmara//burada şunu yaptık, method1 de bulunan dnm ye direkt obj2 nin tum deger
        //lerini atadım.

    }

    //static olanları static uzerinden direkt olarak çağırabilirz, ornegin staatic olan main method uzerinden
    //direkt static bir methodu bir obje ye baglı olmadan direkt çağırabilriz.
    //başında this. varsa hemen class level daki variable lara git.



}
