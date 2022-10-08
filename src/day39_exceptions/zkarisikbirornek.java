package day39_exceptions;

public class zkarisikbirornek {
    String name;
    void parseName(){
        System.out.print("1");
        try {
            System.out.print("2");
            int x=Integer.parseInt(name);//burda bir exceptioon oluştu ve onu bulana kadar digerlerini ignore etti.
            System.out.print("3");
        } catch (NumberFormatException e) {
            System.out.print("4");
        }
    }

    public static void main(String[] args) {
       zkarisikbirornek obj1=new zkarisikbirornek();
       obj1.name="Leroy";
       obj1.parseName();
        System.out.print("5");

    }

}
