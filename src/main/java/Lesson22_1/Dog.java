package Lesson22_1;

public class Dog extends Pet {
    Dog(String name){
        super.name = name;
        System.out.println("I am dog and my name is " + super.name);
    }

    public void play(){
        System.out.println("Dog plays");
    }
}
