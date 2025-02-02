package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test7 {

    public static void main(String[] args) {
        StringBuilder res = new StringBuilder("");
        try {
            File f = new File("test9.txt");
            System.out.println("Object was created");
            FileInputStream fis = new FileInputStream(f);
            int counter = 0;
            while (true) {
                counter++;
                res.append(fis.read());
                System.out.println("Info is reading");
                if (counter == 3) {
                    fis.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception 1");
        } catch (IOException e) {
            System.out.println("Exception 2");
        } finally {
            System.out.println("Final");
        }
    }
}
