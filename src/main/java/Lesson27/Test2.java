package Lesson27;

public class Test2 {

    static void abc() throws NullPointerException{
        String s = null;
        System.out.println(s.length());
    }

    public static void main(String[] args) {
        int arr [] = {1, 2, 0};
        System.out.println(arr[1]);
        System.out.println("Hello");

        String s = null;

        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Was caught: " + e);
        }

        Test2.abc();
    }
}
