package Lesson28;

import java.time.*;

public class Test4 {

    static void smenaDejurnogo(LocalDate start, LocalDate finish){
        LocalDate data = start;
        while (data.isBefore(finish)) {
            System.out.println("Should be changed a worker");
            data = data.plusMonths(1);
        }
    }
}
