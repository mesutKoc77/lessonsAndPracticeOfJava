package day26_staticKeyword;

public class Soru {
    public static long square(int x){
        long y=x*(long)x;
        x=-1;
        return y;
    }

    public static void main(String[] args) {
        int value=9;
        long result=square(value);
        System.out.println(value);//9
        System.out.println(result);//81
        //ınstance vvariable lara local variable larda denebilir.
        //instance lar obje ile staitcc ler ise class ismi ile çağırılırlar.
    }
}
