package nl.edwincox;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class blz139 {

    public static void main(String... args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate date1 = LocalDate.of(2017, Month.JUNE, 06);
        LocalDate date2 = LocalDate.of(2017, 6, 06);
        System.out.println("Date 1 : " + date1);
        System.out.println("Date 2 : " + date2);

        System.out.println();
        LocalTime time1 = LocalTime.of(6,15);
        LocalTime time2 = LocalTime.of(6,15, 30);
        LocalTime time3 = LocalTime.of(6,15, 30, 200);

        System.out.println("Time 1 : " + time1);
        System.out.println("Time 2 : " + time2);
        System.out.println("Time 3 : " + time3);

        // Combine
        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.APRIL, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);

        System.out.println();
        System.out.println("dateTime1 : " + dateTime1);
        System.out.println("dateTime1 : " + dateTime2);

        System.out.println();
        LocalDate proefdate1 = LocalDate.of(2014, 06, 06);
        System.out.println(proefdate1);
        proefdate1 = proefdate1.plusDays(2);
        System.out.println("Na wijziging: " + proefdate1);
        proefdate1 = proefdate1.plusMonths(2);
        System.out.println("Na wijziging: " + proefdate1);

        // LocalDate and LocalTime
        System.out.println();
        LocalDate snoep1 = LocalDate.of(2020, Month.APRIL, 20);
        LocalTime snoep2 = LocalTime.of(5, 15);
        LocalDateTime totaaldatetime = LocalDateTime.of(snoep1, snoep2);
        System.out.println(totaaldatetime);
        totaaldatetime = totaaldatetime.plusDays(2);
        System.out.println(totaaldatetime);
;
    }
}