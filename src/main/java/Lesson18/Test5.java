package Lesson18;

public class Test5 {
    public static void main(String[] arrayTest) {
        int array1[] = {1, 9, -5, 0, -15};
        int array2[] = {1, 9, -5, 0, -15};
        int array3[] = array2;

        System.out.println(array1 == array2);
        System.out.println(array2 == array3);

        System.out.println(array1.equals(array2));

        array1[1] = 0;
        array2[5-3] = 3;
        array1[array1.length] = 10;


    }
}
