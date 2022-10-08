package day03_matematikselIslemler_Increment;

public class C07_Pre_Post_Increment {

    public static void main(String[] args) {

        int a=10;

        a++;

        System.out.println(a); //a 11

        ++a;

        System.out.println(a);//a 12

        // her halukarda arttırdım.

        //yeni bir variable oluşturun, a nın değerini yeni variable a atayın sonra a nın degerni bir arttırın.

        int b=a;

        a++;

        System.out.println("a nın değeri : " + a + " b nin değeri : " + b); //a 13 b 12

        int c=a++;

        System.out.println(" a nin değeri : " +a + "c nin değeri :" + c); //c 13 a 14













    }
}
