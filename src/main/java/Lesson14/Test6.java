package Lesson14;

public class Test6 {
    public void time(){
        for (int hour = 0; hour <= 23; hour++) {
            System.out.println("Begin of outer loops");
            for (int minute = 0; minute <= 59; minute++) {
                System.out.println(hour + ":" + minute);
            }
            System.out.println("End of outer loop");
        }

       OUTER: for (int hour = 0; hour <= 23; hour++) {
            System.out.println("Begin of outer loops");
            INNER: for (int minute = 0; minute <= 59; minute++) {
                System.out.println(hour + ":" + minute);
                if (minute == 30) {
                    break OUTER;
                }
            }
            System.out.println("End of outer loop");
        }
    }

    public static void main(String[] args) {
        Test6 t6 = new Test6();
        t6.time();
    }
}
