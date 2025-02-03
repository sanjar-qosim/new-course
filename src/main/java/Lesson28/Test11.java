package Lesson28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test11 {

    static FileInputStream fis1;
    static FileInputStream fis2;

    public static void abc() {
        try {
            fis1 = new FileInputStream("test1.txt");
            try {
                fis2 = new FileInputStream("test2.txt");
            } catch (FileNotFoundException e) {
                System.out.println("Catch 2");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Catch 1");
        } finally {
            System.out.println("Final block");
            try {
                fis1.close();
                fis2.close();
            } catch (IOException e) {
                System.out.println("Catch in finally block");
            }
        }
    }

    public static void main(String[] args) {
        Test11.abc();
    }
}
