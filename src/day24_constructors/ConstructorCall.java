package day24_constructors;

public class ConstructorCall {
    /*
     bir constructor çalışırken başka bir constructor ın da çalışmasını istiyotsak constructor call devreye girer.
     constructor call için this(varsa paramtre) syntax ile yapılır.
     kurallar:
     1- this(), constructor ın ilk satırına yazılmadlıdır.
     2-ilk kuraldan doalyı tabii ki constructor ın içinde sadece bir tane constructor call yer alır.
     */

    ConstructorCall() {
        System.out.println("parametresiz constructor calıştı");
    }

    ConstructorCall(int sayi) {
        this();
        System.out.println("parametreli constructor calıştı");
    }

    public static void main(String[] args) {

        ConstructorCall obj1 = new ConstructorCall(20);

    }


}
