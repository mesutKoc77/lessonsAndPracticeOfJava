package day09_stringManipulations;

public class C03_startsWith {

    public static void main(String[] args) {

        //no 56

        String str="Java cok guzel,cok.";


        System.out.println(str.startsWith("J"));//bu str "J" ile mi başlıyor.//booelean  olarak dondurur.

        //Strin ise yani çişft trınak içinde ise mutlaka case sensitive
        System.out.println(str.startsWith("Java"));//true
        System.out.println(str.startsWith("Java cok guzel,cok."));//true
        System.out.println(str.startsWith(""));//true//hiçlik ile başlıyor

        System.out.println(str.startsWith("cok"));//false cunku str imız cok ile başlamıyr

        //startswith de bir de toffset diye metod var o da, x inci ve sonrası y ile mi başlıypr
        //bunu boolean olarak dondurur. Örnek

        System.out.println(str.startsWith("cok", 5));//5. karakter ve sonrası cok ile mi başlıyor
        //7 ve sonrası

        System.out.println(str.startsWith("ok guzel,cok.", 6));//altıncı karakter ve sonrası
        //"ok guzel,cok." diye mi başlıyr.True

        System.out.println(str.startsWith("o", 6));//6. karakter ve sonrası "o" ile mi başlıyor/true

        System.out.println(str.startsWith("guzel,cok.", 10));//10. karakter ve sonrası "guzel,cok."
        //diye mi başlıyor. False, zira uzel,cok.
        System.out.println(str.substring(10));//10.karakter sonrası, yani saglaması.










    }
}
