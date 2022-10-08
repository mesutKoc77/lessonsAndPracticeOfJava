package day28_immutableClasses_Time;

import java.time.LocalTime;
import java.time.ZoneId;

public class C05_LocalTime {
    public static void main(String[] args) {
        LocalTime saat=LocalTime.now();

        System.out.println(saat);

        LocalTime localSaat1=LocalTime.now(ZoneId.of("Europe/London"));

        System.out.println(localSaat1);

        LocalTime trsaati=LocalTime.now(ZoneId.of("Turkey"));

        System.out.println(trsaati);







    }
}
