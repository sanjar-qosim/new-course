package Lesson19;

public class Test4 {
    public static void main(String[] args) {
        int[] array = {5, 45, -50, 8};
        int result = 0;
        for (int i : array) {
            result += i;
        }
        System.out.println(result);
    }
}
