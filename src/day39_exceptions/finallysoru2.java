package day39_exceptions;

public class finallysoru2 {
    public static void main(String[] args) {
        /*
        ornegin bir exception yakalandı bu durumda java bu exception ı bulana kadar aradaki tum kodları ıgnore eder.

         */

        String a=null;
        String b="";

        try {
            try {
                b=b+"a";
                a.length();//NullPointerException nı bulana kadar tum kodları ıgnore eder. mesela bır atl satırı ignore etti.
                b=b+"b";//ıgnore edildi.

            } catch (NullPointerException e) //geldi buldu ve aşapıdakini uyguladı.
            {
                b=b+"c";

            } finally {
                b=b+"d";
                throw new RuntimeException();//RuntimeException'nı fırlattı ve catch et dedi
            }
        } catch (Exception e) //Exception zaten RuntimeException'nı barindırdıgından yakaladı ve aşağıdaki atamayı yaptı.
        {
            b=b+"e";
        }
        System.out.println(b);

    }

    /*
    1- try blogu hem catch hem de finally ile çalışabailir.
    2-finally blogu mutlaka çalışır
    3-bir try blogu ile birden fazla catch blogu çalıştırılabilir.
    4-birden fazla catch blok varsa once child yazılır
    5-FileNotFoundException; eger bir dosyaya ulaşmak istiyor ve dosya yolunda bir problem varsa bu hata verilir.
    6-IOException; Inout ve Output ile ilgili sorunların tamamnoı yaklayan exception class ı idi.
    dosayay yazam ve dosyadan okuma ile ilgili oluşacak tum hatalrın  class ıdır.
    checked exception dır ve bunu bir throws exception içine almalıyız ve mutlaka handle etmeliyiz.

     */
    /*
    soylemiştik methodun saturına throws yazarız ve exception ile ilgili bilgi veririz.
    methodun içerisine de throw new ile spesifik exception yollarız.

     */


}
