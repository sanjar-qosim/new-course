package Lesson18;

public class Test7 {
    public static void main(String[] args) {
        char [] array1 = {'p', 'r', 'i', 'v', 'e', 't'};
        String s1 = new String(array1);
        System.out.println(s1);

        System.out.println();

        StringBuilder sb1 = new StringBuilder("Hello World!");
        sb1.append(array1, 2, 3);
        System.out.println(sb1);



    }
}
