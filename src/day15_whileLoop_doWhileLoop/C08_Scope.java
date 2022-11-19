package day15_whileLoop_doWhileLoop;

public class C08_Scope {

    public static void main(String[] args) {

        int a=10;

        //String a="Java";
        //aynı method içersinde, ayni isimde birden fazla variable oluşturulamaz.

        String str="Java gun gectikce guzellesiyor";
    }
    public static void method1() {

        int a=25;//fakat farklı bir method alanına girildiginde istedigin deger veya variable ataması yapabilrsin.

        //System.out.println(str); bu method içerisnde başka bir metdoddaki variable ı çağıramazsın. çünkü  farklı
        //method tamamen iki farklı alan ve tanımlama yerleridir.


        /*Scope
        java da scope, hangi variable lara nerden ulaşacagımızı veya ulaşamayacıgımızı bilmemiz açısından
        önemlidir.
         */

    }

}
