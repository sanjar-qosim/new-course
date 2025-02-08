package Lesson28;

import java.time.*;
import java.util.concurrent.ThreadLocalRandom;

public class Test1 {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        System.out.println();

        LocalDate ld1 = LocalDate.of(2014,5,15);
        System.out.println(ld1);

        LocalDate ld2 = LocalDate.of(2014, Month.APRIL, 22);
        System.out.println(ld2);

        System.out.println();

        LocalTime lt1 = LocalTime.of(15, 30);
        System.out.println(lt1);
        System.out.println(LocalTime.of(23, 59));
        System.out.println();

        ld1 = ld1.plusDays(5);
        System.out.println(ld1);
        ld1 = ld1.minusDays(20);
        System.out.println(ld1);
    }
}
