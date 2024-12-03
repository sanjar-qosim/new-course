package Lesson18;

public class Homework {
    public static int[] sortirovka(int[] array){
        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    public static void showArray(String [][] array){
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                System.out.println(array[i][j] + i + j);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 7, -1, 15};
        int[] arr2 = sortirovka(arr1);
        for (int num : arr2) {
            System.out.print(num + "; ");
        }

        System.out.println("\n");

        String [][] names = {
                {"Sanjar", "Odil"},
                {"Hasan", "Husan"}
        };
        showArray(names);
    }
}
