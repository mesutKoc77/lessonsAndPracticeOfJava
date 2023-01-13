package day33_inheritance;

public class EXC90 extends DVolvo {

    String model="xc90";

    EXC90(String renk){
        //super();
        System.out.println(renk+"bir XC90");
    }

    public static void main(String[] args) {

        EXC90 obj1=new EXC90("kırmızı");
        //EXC90 classındaki variable ve methodları içine alacak şekilde ama tekil parametreli constructor i kullanarak
        //bır obje oluşturuyrum.

    }
}
/*
yazdırrırsan :::
VOLVO PARAMETRESİZ CONS
kırmızıbir XC90
 */

/*
java nın class lara otomatik koydugu constructorlar
nasıl ki parametresiz constrcutor ise,
child lara yani extends keyword unun oldugu class larda
oluşturulan constructorların ilk satırında da super();
cpnstructor da parametresiz constructor dır.
 */
//yukarıdan ilk obje yi altı construxctor a atadı ama
/*
extends keyword unu gordugunden super constructor ı gitti
aldı getirdi ve super den de parametresiz olanı aldı
getirdi ve yazdırdı sırasıyla.
 */
