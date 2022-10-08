package day39_exceptions;

public class aaexceptionssokrative {
    /*
   1- Compile Time Exception ların diger adı Checked Exception dır.
   2- kodumuzj çalışabilmesi için Compile Time Exception lar handle edilmelidir.
   3- throws keyword u ile CompileTimeExceptions lar giderilebilirler
   4- throws method satırında ve method parantezin den hemen sonra yazılır.
   throw ise bir method un içinde
   5-dosyayay ulasılamadıgı zaman FileNotFoundException hatası gelir.
   IOexceprion ınput veya output yapılırken ortaya çıkan problemlerde ortaya çıkar.
   6-
    int num1=12;
        int num2=0;

        try {
            System.out.println(num1 / num2);
        } catch  (ArithmeticException e) {
            System.out.println("0 olmaz");
        } catch (Exception e) {
            System.out.println("beni yazdırmaz cunku child i once yazdırır.");
        }

        bu kod blogund parent child iilişkisi vardır; child i ilk sıraya yazar parent i ise sonrakisıraya, child daki
        hatayı bulunca digerlerinin tamamını ignore eder. sout etmez yani digerlerini

    7- nullpointerexcption, bir Runtimeexception dır.
    8- throws, method un parantezi ile suslu parantez arassına yazılır birkaç adet yazılabilir.
    throw ile bir adet exception, throws ile ise birden çok exception uretilebilir.

    9-
    /*
        try {
            calis();
        } catch (Exception e) {
            System.out.println(e.getMessage());//burda da  edeki mesajı nasıl getirecegımızı goruyoruz.

        }

    }

    public static void calis(){
        throw new RuntimeException("çok çalıs");//burdaki cok calıs lafzı e ye karşılık gelir.

    }
    10- String s2="12345";
        int i=Integer.parseInt(s2);//string i int e cevirdik.
        System.out.println(i+2);

    11-
    null pointer ile işaretlenen bşr variable ın length i olmaz.NullPointerException verir.

        String s2=null;

        System.out.println(s2.length());
     */


}
