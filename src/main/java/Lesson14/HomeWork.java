package Lesson14;

public class HomeWork {
    static void time(){
        HOUR: for (int hour = 0; hour <= 5; hour++) {
            MINUTES: for (int minute = 0; minute <= 59; minute++) {
            if (hour <= 1 && minute == 10) {
                break HOUR;
            }
                SECOND: for (int seconds = 0; seconds <= 59; seconds++) {
                    System.out.println(hour + ":" + minute + ":" + seconds);
                }
            }
        }
    }

    public static void main(String[] args) {
        time();
    }
}
