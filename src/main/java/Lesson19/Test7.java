package Lesson19;

public class Test7 {
    public static void main(String[] args) {
        int[] array = {5, 45, -50, 8};

        for (int i : array) {
            i = 3;
        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}
