package Lesson25.Homework;

public abstract class Mammal extends Animal implements Speakable{

    Mammal(String name){
        super(name);
    }

    abstract void run();
}

interface Speakable {
    default void speak(){
        System.out.println("Somebody speaks");
    }
}