package Lesson18;

public class OtherTasks {
    public static void maxElement(int [] array){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    public static void sumOfAllElements(int [] array){
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        System.out.println(result);
    }

    public static void findElementWithIndex(int [] array, int index){
        if (index < array.length && index > 0) {
            int result =  array[index];
            System.out.println(result);
        } else {
            System.out.println("Invalid index!");
        }
    }

    public static void main(String[] args) {
        int[] array1 = {100, 5, 3, -5, 15, 2, 1, 6};
        int[] array2 = {5, 5, -5};

        maxElement(array1);
        System.out.println();

        sumOfAllElements(array2);
        System.out.println();

        findElementWithIndex(array1, 3);
        System.out.println();
    }
}
