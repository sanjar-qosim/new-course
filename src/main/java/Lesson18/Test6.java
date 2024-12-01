package Lesson18;

public class Test6 {
    public static void maxMin(double [] array){
        double max = array[0];
        double min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);
    }

    public static void main(String[] args) {
        double [] array1 = {45, -45, 0, 15, 99, 1, -44.5, 98.4};
        maxMin(array1);
        System.out.println();
        maxMin(new double [] {0.2, -1.5, -5, 19, -9});
    }
}
