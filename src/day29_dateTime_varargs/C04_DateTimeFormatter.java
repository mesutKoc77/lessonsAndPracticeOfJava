package day29_dateTime_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime bugun=LocalDateTime.now();
        System.out.println(bugun);//2022-09-12T14:24:21.591759400

        DateTimeFormatter dtf=DateTimeFormatter.BASIC_ISO_DATE;
        System.out.println(dtf.format(bugun));//20220912

        DateTimeFormatter dtf2=DateTimeFormatter.ISO_DATE_TIME;//once date timeformater objesi oıluşturuyuroz onun uzerine
        //iligili tarihi atıypruz ve çıktı olarak istediigimiz formatta alıyruz.

        System.out.println(dtf2.format(bugun));//2022-09-12T14:29:54.7941765

        DateTimeFormatter obj3=DateTimeFormatter.ISO_WEEK_DATE;

        System.out.println(obj3.format(bugun));//2022-W37-1

        /*
        benim istedigim formatta yazmasını istersem?
        01/09/2022 olarak yazdırısın ya da 1/9/2022 ya da 1/9/22 ya da 1/Eylul/2022
         */
        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(dtf3.format(bugun));//

        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("d/M/YY");
        System.out.println(dtf4.format(bugun));//12/9/22

        DateTimeFormatter dtf5=DateTimeFormatter.ofPattern("d/MMM/YY");

        System.out.println(dtf5.format(bugun));//12/Sep./22
        /*
		 format olustururken
		 GUN
		 d : basta 0 varsa onu yazmadan gun numarasi
		 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
		 DDD : yilin kacinci gunu oldugunu yazar
		 E, EE, EEE : gun isminin ilk 3 harfi
		 EEEE : gun isminin tamamini

		 AY (Ay icin M, dakika icin m kullanilir)
		 M : basta 0 varsa onu yazmadan ay numarasi
		 MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
		 MMM : Ay isminin ilk 3 harfi
		 MMMM : Ay isminin tamami

		 YY : yilin son iki rakamini
		 YYYY : Yilin tamamini


		 Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

		 HH : saatin tamami, tek rakamli saat olursa 02 gibi
		 H  : tek rakamli saat olursa sadece saati

		 a yazarsak AM veya PM degerini yazar


		 */

        //20:05
        LocalDateTime saat=LocalDateTime.now();

        DateTimeFormatter obj4=DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(obj4.format(saat));//

        //8.07pm

        DateTimeFormatter obj5=DateTimeFormatter.ofPattern("h:mm a");
        System.out.println(obj5.format(saat));//8:07 nachm.


    }
}
