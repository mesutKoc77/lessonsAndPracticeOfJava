package day02_scanner_dataCasting;

public class C09_Datacasting {
    public static void main(String[] args) {

        int intSayi=567;

        byte byteSayi= (byte) intSayi;

        System.out.println("intsayi :" + intSayi + "byte'a çevirirsek" + byteSayi);

        /*
        1- eğer kucuk data (byte) turunu, buyuk data (int) variable na atama yaparsak otomatik genişler.
        2- eğer buyuk data (int) turunu, küçük data (byte) variable na atama yaparsak,
        yanına ısrarla (byte) yazılır ve java sorumlulugu kabul etmeyerek işlemi kabul eder.
        data kaybi(ondalikli kismin gitmesi) veya donusum olabilir.
         */


    }
}
