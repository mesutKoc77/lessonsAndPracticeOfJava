package day29_dateTime_varargs;

public class C14_SB {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java Guzeldir");

        sb1.substring(5);//bana sonuc olarak String olarak dondurecegınden ve string; bir ımmutable oldugundan
        //sadece yazdırır ve degişkilklik yapmaz degişiklik yapılabilmesi için atama yapılmalıdı.
        System.out.println(sb1.substring(5));//Guzeldir
        // sb1=sb1.substring(5); eşitliğin sag ve saolu farklı data turu oldugundan atamayı kabul etmez
        System.out.println(sb1);//Java Guzeldir

        /*
        SB'da contains bulunmazz.
        sb1 java içeriyor möu?
        once strıngbuilder ı strıng e ceviririm ve contains methodunu kullanırım. digerkerii içnd egecerli yani
        SB da yoksa onu toString ile String e ceviririz ve String in method larını uygularız
         */

        System.out.println(sb1.toString().contains("Java"));//true
        /*
        foreach ve ımmutable
        varargs ve stringbuilder
        sokrative var
         */
    }
}
