package Lesson28.HomeWork;

public class Main {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();

        tiger.eat("meat");

        try {
            tiger.drink("water");
            try {
                tiger.drink("cola");
            } catch (NotWaterException e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is a finally block");
        }
    }
}
