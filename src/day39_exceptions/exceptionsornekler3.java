package day39_exceptions;

public class exceptionsornekler3 {
    public static void main(String[] args) {
        int a=10;
        int b=2;
        try {
            System.out.println(a/b);
        try {
            Object c=a/b;
            String d=(String) c;//burda classcast exceptionı var. onu yakalayacak aşağıda yakaldı ve throw new'ı fırlattı
            //ve runtime aldı onu aradaı onu da en altta buldu ve souttaki throw keyword  u fırlattı.
        } catch (ClassCastException e) {
            throw new RuntimeException(e);
        }
        } catch (RuntimeException e) {
            System.out.println("throw keyword");
        }

        /*
        --throw u kontrollu exception için,---throws u ise; exception ın oldugunu deklare etmek için kullanırız.
        --throw ile sadeece bir exception throw edeilbeilir, throws da ise, birden fazla exception yazabilirsin ve
        bunları virgulle ayırabilirsin
        --throw bir method un içinde, throws ise bir methodun deklare edildigi satırda
        --throw dan sonra except,on olan class ın constructor ı yazılır; throws da ise, exception ın class ismi yazılır.


         */


    }
}
