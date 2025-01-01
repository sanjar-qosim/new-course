package Lesson24.Homework;

public class Mammal {

    protected String name;

    Mammal(String name){
        this.name = name;
    }

    protected void eat(){
        System.out.println("Mammal eats");
    }

    protected void sleep(){
        System.out.println("Mammal sleeps");
    }

    protected void run(){
        System.out.println("Mammal runs");
    }
}
