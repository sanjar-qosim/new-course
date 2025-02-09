package Lesson28;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Homework {

    public static DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy, dd-MMMM !! hh:mm");
    public static DateTimeFormatter format2 = DateTimeFormatter.ofPattern("hh:00, dd/MMM/yy");

    public static void switchWorkers(LocalDateTime start, LocalDateTime finish, Period period, Duration duration){
        while (start.isBefore(finish)){
            System.out.println("We are working from: " + start.format(format1));
            start = start.plus(period);
            System.out.println("Till: " + start.format(format1));
            System.out.println("We are breaking from: " + start.format(format2));
            start = start.plus(duration);
            System.out.println("Till: " + start.format(format2));
            System.out.println("\n----------------------------\n");
        }
    }

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2025, Month.JANUARY, 6, 9, 0);
        LocalDateTime ldt2 = LocalDateTime.of(2025, Month.JANUARY, 30, 18, 0);
        switchWorkers(ldt1, ldt2, Period.ofDays(5), Duration.ofDays(2));
    }
}
