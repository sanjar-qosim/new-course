package Lesson28;

import java.time.*;

public class Test4 {

    static void smenaDejurnogo(LocalDate start, LocalDate finish, Period p){
//        LocalDate data = start;
        while (start.isBefore(finish)) {
            System.out.println("It's a " + start + ". Should be changed the worker");
            start = start.plus(p);
        }
    }

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDate finish = LocalDate.of(2017, Month.MAY, 31);
        Period p = Period.ofWeeks(2);

        Test4.smenaDejurnogo(start, finish, p);
    }
}
