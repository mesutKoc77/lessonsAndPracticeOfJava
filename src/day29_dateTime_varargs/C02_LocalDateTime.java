package day29_dateTime_varargs;

import java.time.LocalDateTime;

public class C02_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime Ldt=LocalDateTime.now();
        System.out.println(Ldt);//2022-09-12T13:33:34.273223600
        /*
        date ve time i datetiem faomatter ile manıpule edebilirz.
        şiömdiye kadar ogrendigimizle de ancak string e cevririerek yapabilir.z şoyle ki
         */
        //bu tarih 2022 ile mi başloyor veya 2022 ye mi ait
        String tarihVeSaat=Ldt.toString();

        System.out.println(tarihVeSaat.startsWith("2022"));//true
        System.out.println(tarihVeSaat.contains("2022"));//true

        //



    }
}
