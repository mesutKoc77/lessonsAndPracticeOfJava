package day28_immutableClasses_Time;

import java.time.LocalDate;

public class C03_LocalDate {

    public static void main(String[] args) {
        LocalDate tarih=LocalDate.now();

        System.out.println(tarih);//2022-09-11

        System.out.println(tarih.getDayOfWeek());//SUNDAY

        System.out.println(tarih.getDayOfMonth());//11

        System.out.println(tarih.getDayOfYear());//254

        System.out.println(tarih.getMonth());//SEPTEMBER

        System.out.println(tarih.getMonthValue());//9

        System.out.println(tarih.plusYears(3).plusMonths(2).plusDays(10));//2025-11-21

        System.out.println(tarih.minusWeeks(7).minusDays(3));//2022-07-21

        LocalDate dogTrh1=LocalDate.of(2011,10,12);
        LocalDate dogTrh2=LocalDate.of(2011,10,14);

        if(dogTrh1.isBefore(dogTrh2)){
            System.out.println("1.si daha buyuk");
        } else if (dogTrh1.isAfter(dogTrh2)) {
            System.out.println("2.si daha buyuk");
        }else {
            System.out.println("her ikisi aynı gun dogmus");}

        System.out.println(dogTrh1.isLeapYear());//false
        System.out.println(tarih.lengthOfYear());//365

        System.out.println(tarih.withDayOfMonth(20));//2022-09-20

    }
}
