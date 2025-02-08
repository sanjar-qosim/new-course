package Lesson27_1;

import java.io.IOException;

public class Test20 {

    static void abc() throws Exception {
        System.out.println("ok");
    }

    public static void main(String[] args) {
        try {
            Test20.abc();
        } catch (IOException e) {
            System.out.println("Was caught exception");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
