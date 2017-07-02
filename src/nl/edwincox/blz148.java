package nl.edwincox;

import java.time.LocalDate;
import java.time.Month;

public class blz148 {

    public static void main(String... args) {

        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);

        System.out.println(date.getDayOfWeek());

    }
}