package day31_encapsulation;

public class sokrative {
    public static void main(String[] args) {

       // 1.//System.out.println(method1(true, false, false, false));//3

        //2. varargs her zaman sonda olur cunku onundeki herşeyi yutar.

        /*3
        method2(1,2,3,4);
        method2(1,2);//burda ilk iki yi i ve j alır ve dolayısıyla varargs sadece [] kalır ve 0 olur length i.
        method2(1,2,3,4,5);
        method2(1,2);//burda da 0
         */

        /*4
        StringBuilder str=new StringBuilder("ceylan");
        String yeni=str.substring(3);//burada dikkat edleim cunku sonuc bana string doncek ne demiştik
        //string ler ımmutable oldugundan onları yeni degerleriyle yazdıremak istiyorsak once onları atayarak yeni
        //degerleiyle başbaşa bırakmalıyız. eger bşz burda yeni variable ına atamadan yazsaydık yine ceylan yazardı.

        System.out.println(yeni);//lan

         */

        /*5

        StringBuilder str2=new StringBuilder("ceylan");
        str2.insert(0,"S");//insert stringbuilder methodu ve banastringbuilder doncegınden mutable dır ve direkt
        //yazdırabilirdik.
        System.out.println(str2);//Sceylan//inseert eklemek demektir silmez. 0. indeksi S yap dedik ve digerlerini bir
        //kaydırdık

        string ile stringbuildeer farklı class lardandır.
         */

        /*
        String s1="Hurriyet";
        StringBuilder s2=new StringBuilder("Hurriyet");
        if(s1==s2){
        sout("Merhaba"); }
        if(s1.equals(s2)){
        sout("Hoscakal")
        }
        java da string ile stringbuilder farklı classlardan olduklarından == ile karşılaştrıılmazlar.
        equals ile karşılaştırsan da bir şey demez yani CTE vermez fakat her zaman false vcerir.
        stringbuilder de karşılaştırma yapmak istersen compareTo methodubu kullanmamız gerekecekti.
        ya da Stringbuilder sdaki degeri toString ile String e cevirirm ve equals a bakarım.
         */








    }
     /*1.public static int method1(boolean a1, boolean... a2){

        return a2.length;
    }
  */

   /*3
    public static void method2(int i, int j, int... k){
        System.out.println(k.length);
    }

    */


}
