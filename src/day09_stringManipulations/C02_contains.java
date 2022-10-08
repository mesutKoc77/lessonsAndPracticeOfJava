package day09_stringManipulations;

public class C02_contains {
    public static void main(String[] args) {

        //no 55

        String str="Java cok guzel, cok.";

        //contain: bir stringin bir şey içeripi içöermedigini kontrol eder?

        System.out.println(str.contains("Java"));// "Java cok guzel, cok." string imiz Java içeriyor mu?//true
        // ya da false dondurur yan, içeirri ya da içermez de.

        System.out.println(str.contains("java"));//case sensititve oldugundan false verecek.//contains bize
        //boolean donduruyor.

        System.out.println(str.contains("cok")); //true
        //contains metodu bir string içincde char veya string olup olmadıgını bize boolean olarfak getirir.
        //contains, aranan String in ilgili String içersinde kaç adet olup olmadıgına bakmaz, sadece
        //ama sadece içerip içermediğini kontrol edip true veya false boolean olarak bize dondurur.

        //contains yazdıgımda charsequence çıkıyor yani bana bu charsequence i ara diyrm, o da gidiyor
        //char zincirinin olup olmadıgını kontrol ediyor zira string ler de bir char zinciridir.
        //ben charsequence deyip sadece char ara dersem bana java diyecek ki, benden charsequence i bul
        //diyorsun ama deger olarak char giriryorsun, ben bunu yapamam diyor. Ör:
        //System.out.println(str.contains('a')); bunda hata verecektir.
        //ama sadece "a" demiş yani string olarak a içeriyor mu deseytdim elbette d,yecek true sonucu vere
        //cekti.
        //yani charsequemce i string gibi duzunebiliriz.

        System.out.println(str.contains(" "));//true

        System.out.println(str.contains(""));//true//hiçlik//noktadan sonra ne var desem hiç deriz.







    }
}
