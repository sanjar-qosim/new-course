package Lesson13;

public class Employee {

    public static void main(String[] args) {
        switch ("sunday") {
            case "monday":

            case "tuesday":

            case "wednesday":

            case "thursday":

            case "friday":
                System.out.println("Work till 18:00");
                break;
            case "saturday":
                System.out.println("Work till 12:00");
                break;
            case "sunday":
                System.out.println("day off");
                break;
            default:
                System.out.println("day is not valid");
        }

        final int a = 1;
        final int b = 2;

        switch (1 * 3) {
            case 1:

            case a * b:

            case 3:

            case 4:

            case 5:
                System.out.println("Work till 18:00");
                break;
            case 6:
                System.out.println("Work till 12:00");
                break;
            case 7:
                System.out.println("day off");
                break;
            default:
                System.out.println("day is not valid");
        }
    }
}
