package Lesson19;

public class Test6 {
    public static void main(String[] args) {
        int [][] array = {{3, 5, 7}, {4, 5}, {9, 4, 8, 0}};
        for (int[] array2 : array) {
            for (int i : array2) {
                System.out.print(i + " ");
            }
        }
    }
}
