package Lesson28;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test6 {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDateTime ldt = LocalDateTime.of(2016, Month.SEPTEMBER, 1, 16, 40);
        System.out.println(ld.getDayOfWeek());
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ld.getMonthValue());
        System.out.println(ldt.getYear());

        System.out.println();

        System.out.println(ld);
        DateTimeFormatter dtf1 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(ld.format(dtf1));

        System.out.println();

        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(ld);
        System.out.println(ld.format(shortFormat));

        System.out.println();

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(ldt);
        System.out.println(ldt.format(f));
    }
}
