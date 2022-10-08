package day02_scanner_dataCasting;

public class C07_dataCasting {
    public static void main(String[] args) {

        String isim="Esra"; //string çift tırnak içinde olavak

        isim="Ayşe";

        System.out.println(isim);

        //string e bloean oder çar atayamazsın

        boolean iyiMi=true;

        //boolean data turundeki bir variable a da int, char, string vb atayamazsın.

        int sayiInt=12;
        short sayiShort=20;
        byte sayiByte=21;
        double sayiDouble=14;


        /*
        sayiInt=sayiShort;
        sayiDouble=sayiByte;
        aynı veya benzer turler içeren variablellarda ise kontrollu geciş mumkundur.aşağıdaki gibi.
         */


        //buyuk dataya kucugu atayabirsin fakat kucuge buyuk atayamazsın zira hafızası datası yetmez.aşağodakı
        //gibi

        /*
        sayiByte=sayiInt;
        sayiShort=sayiDouble;Reassigned local variable
         */

        sayiDouble=sayiInt; //b=k
        sayiInt=sayiShort;  //b=k

        /*
        aşağıdakı örnekte ise kucuge buyugun degerini sorumluluk alarark ve buyugun yenına evet ben kucuk olsam da
        yine de degerini bana ata diyerek tekrar atanacak olan variable ı yazarsak problem de çözülmüş oluyor
         */
        sayiByte= (byte) sayiInt; //k=b
        sayiShort= (short) sayiDouble;  //k=b

        System.out.println(sayiByte);
        System.out.println(sayiShort);
















    }
}



