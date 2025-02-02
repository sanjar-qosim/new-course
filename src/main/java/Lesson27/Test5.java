package Lesson27;

import java.io.*;

public class Test5 {

    void abc() throws FileNotFoundException{
        File f = new File("test.json");
        FileInputStream fis = new FileInputStream(f);
    }

    void def() {
        System.out.println("Hi! This is a def method.");
        try {
            abc();
        } catch (FileNotFoundException e) {
            System.out.println("Was caught exception: " + e);
        }
    }

    public static void main(String[] args) {
        Test5 test5 = new Test5();
        test5.def();
    }
}
