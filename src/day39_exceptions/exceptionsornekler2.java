package day39_exceptions;

public class exceptionsornekler2 {
    public static void main(String[] args) {

        /*
        java bir exceptionı gordu ise onu bulana kadar kod blogundakileri ignore eder ve onu buldugu an yapıştırır.
         */
        String a = null;
        String b = "";

        try {
            try {
                int c = a.length() + b.length();//burda a nın uzunlugu yok yanı nullpointer exceptiıon hatasını aldı. onu catch
                //edene kadar takip etti ve birnci catch de buldu, onun da içine girdi, if in içi true oldugundan onun da içi
                //ne girdi. bu sefer Runtime exception ı gordu ve onu da catch edene kadar digerlerini ignor edip bu exceptionı
                //bulana kadar takip etti ve en aşağıda catch de kini buldu true dedi içine girdi ve throw keyword u sout etti.
            } catch (NullPointerException e) {
                if (b.length() == 0) {
                    throw new RuntimeException();
                }
                System.out.println("null, pointerdır uzunlugu olamaz");//bunu uygulamadı cunku; RuntimeException();
                //ını bulanaa kadar ıgnore etti. aşağıda buldu ve yazdı.
            }
        }catch (RuntimeException e) {
                System.out.println("throw keyword");
            }
        }
        /*
        bir try ile birden fazla catch çalışmaz.
         */

    /*
    burda bir try in içerisine nasıl bir tane daha try eklenmiş.
    şöyle ki ikinci try dan başla ikinci catch e kadar işaret altına al ve handle et...
     */


}
