package Lesson25.Homework;

public abstract class Fish extends Animal {

    Fish(String name) {
        super(name);
    }

    @Override
    void sleep() {
        System.out.println("It's interesting to watch sleeping fishes");
    }

    abstract void sweam();
}
