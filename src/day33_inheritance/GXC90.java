package day33_inheritance;

public class GXC90 extends DVolvo {

    String model="XC90";

    GXC90(){
        System.out.println("parametresiz XC90");

    }
    GXC90(String renk){
    super(renk);
        System.out.println(renk+"renginde bir"+model);
    }
    GXC90(String renk,String yakit){
        this("mavi");
        System.out.println(renk+"renginde bir"+yakit+"li"+marka);

    }

    public static void main(String[] args) {
        GXC90 arb1=new GXC90();//VOLVO PARAMETRESİZ CONS
                               //parametresiz XC90
        GXC90 arb2=new GXC90("sari");//Volvo parametreli cons
                                           //sarirenginde birXC90

        GXC90 arb3=new GXC90("mavi","elektrik");//Volvo parametreli cons
                                                          //mavirenginde birXC90
                                                           //mavirenginde birelektrikli





    }







}
