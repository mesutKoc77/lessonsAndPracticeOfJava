package day28_immutableClasses_Time;

import java.time.LocalDate;
import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) {

        LocalTime saat=LocalTime.now();//
        System.out.println(saat);//23:33:20.668610900

        System.out.println(saat.getSecond());//20

        /*
        bir for loop oluşturulaım,
        1'den 10000 e kadar olan sayıları toplatalım ve bu işlemi ne kdar surede yaptıgını bulalım
         */
        LocalTime forLoopbasi=LocalTime.now();
        System.out.println(forLoopbasi);//21:54:58.815231600

        int toplam=0;
        for (int i = 1; i <=10000 ; i++) {
            toplam+=i;
        }

        LocalTime forLoopsonu=LocalTime.now();
        System.out.println(forLoopsonu);////21:54:58.815231600

        int nanoSaniye=forLoopsonu.getNano()-forLoopbasi.getNano();
        System.out.println(nanoSaniye);

        System.out.println(saat.plusMinutes(1000));//1000 dakika sonra saat kaç oluuyor

        System.out.println(saat.minusNanos(255631));

        System.out.println(saat.withMinute(50));

    }
}
