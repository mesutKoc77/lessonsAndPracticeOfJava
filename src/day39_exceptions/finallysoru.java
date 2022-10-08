package day39_exceptions;

public class finallysoru {
    public static void main(String[] args) {

        String a=null;

        try {
            a.concat("b");//NullPointerException ını yakala ve true olan kod blogunu uygula.
        } catch (NullPointerException e) {//buldu
            a="";//aldı uyguladı
        } finally {
            System.out.println(a.concat("c"));//hiçlik ile c yi birleştirdi.
        }


    }


}
