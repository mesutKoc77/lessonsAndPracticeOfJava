package day29_dateTime_varargs;

public class C08_Varargs {
    public static void main(String[] args) {
         /*
           verilen sayilardan sonuncuus haric digerlerini toplayip
           bulunan toplam degerini son sayi ile carpip
           yazdiran bir method olusturun
           input 3,4,5,6
           output 3 * (4+5+6) = 45
         */
        islemYap2(3,4,5,0,1);//varargs dan sonra element konulmaz. cunku onune geleen hersey,i alır.
        //dolayısyla varargs en sonda olmalı ve
        //bu soru varargs ile çözmek istersek işlemi method da varargs i işlerken yamalıyız.

    }

    public static void islemYap2(int ... a) {

        int toplam=0;

        for (int i = 0; i <a.length-1 ; i++) {

            toplam+=a[i];

        }
        System.out.println(toplam*a[a.length-1]);//12

    }
}
