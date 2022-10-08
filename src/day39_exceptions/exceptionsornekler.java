package day39_exceptions;

public class exceptionsornekler {
    public static void main(String[] args) {

        String a=null;
        String b="";

        try {
            int c=a.length()+b.length();
            throw new RuntimeException();

        } catch (NullPointerException e) {
            System.out.println("null, bir pointer dir, uzunlugu olamaz");

        } catch (RuntimeException e) {
            System.out.println("throw keyword");

        }
        /*
        burda ilkin a nın lengtını yazdıramayagını anlayınca hemen null ile ilgili hatayı aradı ve onu yazıdrıp başka
        hiçbir şeyi yazdırma ihtiyacı hissetmedi.
        sadece bir tanesi çalışır yani hangisini bulduysa onu çalıştırır.
         */



    }


}
