package Lesson28;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test19 {

    public static void main(String[] args) {
        Animal animal = new Mouse();

        try {
            animal.run();
        } catch (IOException e) {
            System.out.println("Object was caught");
        }
    }
}

class Animal {
    void run() throws IOException {
        System.out.println("Animal is running");
    }
}

class Mouse extends Animal {

    @Override
    void run() {
        System.out.println("Mouse is running");
    }
}