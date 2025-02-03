package Lesson28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test14 {

    static FileInputStream fis1, fis2;

    public static void main(String[] args) {
        try {
            fis1 = new FileInputStream("test9.txt");
            System.out.println("File test9.txt is exist!");

            try {
                fis2.close();
            } catch (IOException e) {
                System.out.println("Some problems with stream");
            }
        } catch (FileNotFoundException e1) {
            System.out.println("File test9.txt was not found");
        } catch (NullPointerException e2) {
            System.out.println("It's a NullPointerException");
        }
    }

}
