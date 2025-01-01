package Lesson24.Homework;

public class Penguin extends Bird implements Speakable{

    Penguin(String name) {
        super(name);
    }

    @Override
    protected void eat(){
        System.out.println("Penguin likes eating fish");
    }

    @Override
    protected void sleep(){
        System.out.println("Penguin sleeps together with other penguins");
    }

    @Override
    protected void fly(){
        System.out.println("Penguin can't fly");
    }

    @Override
    public void speak(){
        System.out.println("Penguin can't sing as nightingale");
    }
}
