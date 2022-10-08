package day07_ternary;

public class C05_Ternary {
    public static void main(String[] args) {
        //38 no

        int sayi= 10;

        // sayiyi kontrol edin
        // sayi cift ise sayi cifttir yazin
        // tek ise sayinin degerini 5 artirin


        /*

        Ternary ın sonucunu bir variable a atama yapacaksak, ternary in true ve false bölümlerinin
        data turlernin aynı olması gerekmektedir.
        sayi=sayi%2==0 ? "çift sayi" : sayi-3; mesela burda "çift sayı" string tir. ama sonuç int. Bunu atayamazsın işte
        yani burada sayı int, ama "çift sayi" bir string tir dolayısıyla deger ataması yapılamaz.ve sayının degeri de
        degışmemiş olacak.
        Ama bunun yazdıırılmasının onunda herhangi bir engel yoktur. Çünkü yazdırma da deger ataması yapmıyorsun,
        sadece olanı yazdırıyprsun. Şu yapılabilir yani:
        System.out.println( sayi % 2 == 0 ? "çift sayi" : sayi - 3);
         */

        System.out.println(sayi % 2 == 0 ? "cift sayi" : (sayi=sayi + 5));

        System.out.println("sayinin yeni degeri : " + sayi);








    }
}
