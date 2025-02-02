package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test6 {

    public static void main(String[] args) {
        try {
            File f = new File("test.json");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Was caught exception 1");
        } catch (NullPointerException e) {
            System.out.println("Was caught exception 2");
        } catch (IOException e) {
            System.out.println("Was caught exception 3");
        } catch (RuntimeException e) {
            System.out.println("Was caught exception 4");
        }
    }
}
