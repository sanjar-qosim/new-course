package Lesson27_1;

public class Test12 {

    static void abc() {
        int [] arr = {1, 2, 3};
        try {
            System.out.println(arr[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String s = null;
            try {
                System.out.println(s.length());
            } catch (NullPointerException e1) {
                System.out.println("Was caught " + e1.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Test12.abc();
    }
}
