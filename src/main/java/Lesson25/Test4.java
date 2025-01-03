package Lesson25;

public class Test4 {
    public static void main(String[] args) {
        String [] array1 = {"hi", "bye"};
        Object [] array2 = array1;
        String [] array3 = (String[]) array2; // must make casting, because not every Object is a String

        array3[0] = String.valueOf(new StringBuilder("ok"));
    }
}
