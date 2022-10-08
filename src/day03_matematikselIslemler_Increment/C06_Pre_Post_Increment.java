package day03_matematikselIslemler_Increment;

public class C06_Pre_Post_Increment {
    public static void main(String[] args) {

        int a=10;
        System.out.println("a nın değeri :" + ++a);//a 11

        int b=a++; //önce atamayı yap, sonra deger arttır. //b 11 a 12

        System.out.println("b nin değeri :" + b + " a nın yeni değeri ise : " + a);

        int c=b++ +a; //once atama, c 23 a 12 b 12 //burda en onemli şey şu; ++ sonradan geldiği için
        //önce atamayı yaptık yani c variablena değer atadık, b+a, daha sonra b nin değerini
        //bir arttırdık.


        System.out.println("a nın değeri :" +a + "b nin değeri: " + b + " c nin değeri:" + c);

        System.out.println("Son toplam : " + (a+b+c)); //47












    }
}
