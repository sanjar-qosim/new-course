package Lesson24.Homework;

public class Lion extends Mammal implements Animal{

    Lion(String name){
        super(name);
    }

    @Override
    public void eat(){
        System.out.println("Lion likes a meat");
    }

    @Override
    protected void sleep(){
        System.out.println("Lion sleeps more than half a day");
    }

    @Override
    protected void run(){
        System.out.println("Lion is not a fastest mammal");
    }
}
