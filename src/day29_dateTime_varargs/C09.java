package day29_dateTime_varargs;

public class C09 {
    public static void main(String[] args) {

        new C09().method(1,"Java");
        C09 obj1=new C09();//bir method oluşturmak iççin ana iskelet budur ve burada da new kelimesi onemli bir rol
        //oynuyor.
        obj1.method(2,"Java","Guzeldir");

    }
    public void method (int a, String...b){
        System.out.println(b[b.length-a]+" ");

    }
    //varargs bir arraydir ve en guzeli olan foreach loop burada kullanılabilir.
    //bu ornekte de zaten varargs ın array esaslı ozellikleri oldugu ve bu manada işlemler yapılabilecegi gösterildi.
    //yani indeksleriyle işlem yapabilriz
    //mutlaka ama mutlaka sona gelir varargs
}
