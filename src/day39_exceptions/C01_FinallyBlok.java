package day39_exceptions;

public class C01_FinallyBlok {
    public static void main(String[] args) {
        int a=10;
        int b=2;

        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("bolen sayı 0 olamaz");
        } finally {
            System.out.println("finally blok çalıştı");//exception oluşssa da oluşmasa da çalıştı.
        }

        /*
        peki neden finallyty e ihtiyac duyulmuş.
        mutlaka ama mutlaka finally ı calıştıracak, çalışrı ve sonra isterse exception ı fırlatır.

         */

        //iki tane catch ooldugu zaman ikisi de çalışmaz ikisinden bir tanesi çalışır
    }
}
