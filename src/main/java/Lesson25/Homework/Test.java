package Lesson25.Homework;

public class Test {

    public static void main(String[] args) {
        Animal test1 = new Mechenosec("test1");

//        Speakable [] array1 = {test1};

        Animal [] array2 = {test1};
        Animal [] array3 = {test1};

        System.out.println(array2[0] instanceof Mechenosec);

    }
}
