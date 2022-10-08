package day29_dateTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C03_PeriodofTime {
    public static void main(String[] args) {
        // dogum tarihinizi ve bugunu local date olarak olusyurup
        // kac yasinda oldugunuzu yazdirin

        LocalDate bugun=LocalDate.now();
        LocalDate dogumtarihi=LocalDate.of(1972,01,01);
        Period yas=Period.between(dogumtarihi,bugun);
        System.out.println(yas);//P50Y8M11D

        System.out.println(yas.getYears());//


    }
}
