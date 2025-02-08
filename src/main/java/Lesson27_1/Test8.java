package Lesson27_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8 {

    static int abc() {
        try {
            File f = new File("test9.txt");
            FileInputStream fis = new FileInputStream(f);
            return 5;
        } catch (FileNotFoundException e) {
            System.out.println("Exception was caught");
            return 6;
        } finally {
            System.out.println("Final block");
            return 7;
        }
    }

    static StringBuilder def() {
        StringBuilder a = new StringBuilder("Hi");
        try {
            File f = new File("test10.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception was caught");
            return a;
        } finally {
            a.append("!!!");
            System.out.println("Final block");
            System.out.println("Variable a: " + a);
        }
        return a;
    }

    public static void main(String[] args) {
//        System.out.println(Test8.abc());
        System.out.println(Test8.def());

    }
}
