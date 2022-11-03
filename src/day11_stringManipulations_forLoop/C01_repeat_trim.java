package day11_stringManipulations_forLoop;

public class C01_repeat_trim {
    public static void main(String[] args) {

        String str="Java Candir";

        System.out.println(str.repeat(4));//kaç kere istersen o degeri yazar
        // Java CandirJava CandirJava CandirJava Candir

        str="    Ali kos   ";

        str = str.trim();//baştaki ve sondaki boşukları alır//Ali kos

        System.out.println(str);//Ali kos


    }
}
