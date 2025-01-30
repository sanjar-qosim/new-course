package Lesson27;

import java.io.*;

public class Test4 {

    public static void main(String[] args) {
        File f =new File("test.txt");

        try {
            System.out.println("Bye");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Was caught exception");
        } finally {
            System.out.println("This is finally block");
        }

        System.out.println("This code is not belong to exception");
    }
}
