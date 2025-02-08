package Lesson27_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test9 {

    static void abc() throws FileNotFoundException {
        try {
            File f = new File("test10.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception was caught and changed some");
            throw e;
        } finally {
            System.out.println("Final block");
        }
    }

    void method() {
        try {
            abc();
        } catch (FileNotFoundException e) {
            System.out.println("Exception was caught fully");
        }
    }

//    static void def() throws FileNotFoundException {
//        try {
//            int [] arr = {1, 2, 3};
//            System.out.println(arr[5]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception was caught and changed some");
//            throw e;
//        } finally {
//            System.out.println("Final block");
//        }
//    }

    public static void main(String[] args) {

    }
}
