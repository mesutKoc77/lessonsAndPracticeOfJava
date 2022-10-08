package day03_matematikselIslemler_Increment;

public class C05_Pre_Post_Increment {
    public static void main(String[] args) {

        int a=10;

        System.out.println(a++); //10
        System.out.println(a);//11

        a=10; //ornek pre increment

        System.out.println(++a);//11
        System.out.println(a);//11

        a=10; //başka bir ornek post increment

        int b=a++; //b 10, a 11

        System.out.println("a nın değeri :" + a + "b nin değeri :" + b);

        a=10;

        b=++a; //a=11 b=11

        System.out.println("a nın değeri: " + a + " b nin değeri : " +b);

        /*
        oncelıgı neeye erecgımızı ++ olan işlem veriyor
         a++ boyle olunca once eşitliypruz (yani atamayı yapıyoruz) sonra arttırıyoruz.
        . ++a burda once arttırypruz sonra eşitliyoruz (yani atamayı yapıypruz)
         */

        //başka bir ornek verirsek

        int c=10;
        System.out.println("c nın değeri :" + ++c);//c 11

        int d=c++;

        System.out.println( "c nin değeri " + c + "d nin değeri :" + d); //c=12 d=11



















    }
}
