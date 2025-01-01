package Lesson24.Homework2;

public abstract class Bird extends Animal implements Speakable {

    Bird(String name){
        super(name);
    }

    abstract void fly();

    @Override
    public void speak(){
        System.out.println(name + " sings");
    }
}
