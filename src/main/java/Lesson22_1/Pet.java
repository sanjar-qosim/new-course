package Lesson22_1;

public class Pet extends Animal{
    Pet(){
        super.eye = 2;
        System.out.println("I am pet");
    }

    protected String name;

    protected final int tail = 1;

    protected final int paw = 4;

    public void run(){
        System.out.println("Pet runs");
    }

    public void jump(){
        System.out.println("Pet jumps");
    }
}
