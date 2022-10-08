package day38_exceptions;

public class C06_Exceptions {
    public static void main(String[] args) {

        //4-NumberFormatException
        String str="56a";
       // System.out.println(Integer.parseInt(str) + 3);//.NumberFormatException
        /*
        burda ınteger olmayan  bir String i integer a ccevirmeye kalkarsak .NumberFormatException verir.
        ama içi 567 yani bir integer olsaydı o zmaan int ile toplayabilirdk.
        parseint i kullanırdık ve int e cevriridik. olur biterdi.
         */

        //5-ClassCastException------> uygun olmayan cast işlemleri ortaya çıkar.

        String a="Java";

        //Integer b=a; farklı data turlerindeki variable ları birbirlerine atayamayız

        Object b=a; //object class ı string in parent class ı oldugundan kabul etti.

        Integer c=(Integer)b;//object class ı integerin da parent i oldugundan casting il e kabul etti. ama...
        System.out.println(c);//ClassCastException

    }
}
