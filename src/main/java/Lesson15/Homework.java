package Lesson15;

public class Homework {

    static void time() {
        int hour = 0;
        OUTER: while (hour <= 5) {
            int minute = 0;
            MIDDLE: do {
                int seconds = 0;
                INNER: while (seconds <= 59) {
                    if (hour > 1 && minute % 10 == 0) {
                        return;
                    }
                    System.out.println(hour + ":" + minute + ":" + seconds);
                    seconds++;
                }
                minute++;
            } while (minute <= 59);
            hour++;
        }
    }

    static void task1(int a) {
        int i = 1;
        while (i <= 10) {
            System.out.println(a + " * " + i + " = " + a*i);
            i++;
        }
    }

    static void task2(int number, int degree) {
        int i = 1;
        int result = 1;
        while (i <= degree) {
            result *=number;
            i++;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        time();
        task1(3);
        task2(3, 3);
    }
}
