package Lesson14;

public class HomeWork {
    static void time() {
        for (int hour = 0; hour <= 5; hour++) {
            for (int minute = 0; minute <= 59; minute++) {
                if (hour > 1 && minute % 10 == 0) {
                    return;
                }
                for (int seconds = 0; seconds <= 59; seconds++) {
                    System.out.println(hour + ":" + minute + ":" + seconds);
                }
            }
        }
    }

    static void task3(int a){
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " * " + i + " = " + a*i);
        }
    }

    static void task4(int a){
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    static void task5(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    static void task6(int a){
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
//        time();
//        task3(3);
//        task4(3);
//        task5();
//        task6(5);
    }
}
