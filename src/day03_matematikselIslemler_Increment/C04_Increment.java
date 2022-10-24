package day03_matematikselIslemler_Increment;

public class C04_Increment {

    public static void main(String[] args) {

        /*
        javda eşittir assignement ttır yani değer atamadır. Matematiktteki bir karşılık veya tutar degildir.
        sol taraf variable, sağ taraf ise degerdir. once eşitliğn sagından başlar sonra
        değer ataması yapara variable a.
        sürekli olarak atama yapa yapa devam eder. or; sayı:1 idi 3 eklersen artık sayı:4 olur,5 eklersen
        sayı:9 olur. en son ne ise o şeklide devam eder.

           */

        int a=12;
        int b=8;

        a +=b;

        System.out.println("a'nın değeri mi: " +a + " b'nin değeri : " +b);

        a --;
        b ++;

        System.out.println("a'nın değeri: " +a + " b'nin değeri : " +b);

        a/=b;

        System.out.println("a'nın değeri: " +a + " b'nin değeri : " +b);

        b*=3;

        System.out.println("a'nın değeri: " +a + " b'nin değeri : " +b);

    }
}
