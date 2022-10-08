package day08_switchStatements_StringManipulation;

public class C14_substring_terstenyazdirma {
    public static void main(String[] args) {
        // no 40
        // verilen dort basamakli bir string'i terse ceviren bir program yaziniz

        String str="Java";

        System.out.println(str.length());//toplam karakter 4 adet. 4-1. son harf tir.

        String tersStr=str.substring(3) + str.substring(2,3) + str.substring(1,2) +str.substring(0,1);


        System.out.println(tersStr);







    }
}
