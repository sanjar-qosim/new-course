package Lesson24;

public class Test4 {
    Jumpable j1 = new Human();
    Jumpable j2 = new Animal();
}

class Human implements Jumpable {

    @Override
    public void jump(){
        System.out.println("Human jumps");
    }
}

class Animal implements Jumpable {
    @Override
    public void jump(){
        System.out.println("Animal jumps");
    }
}

interface Jumpable {
 void jump();
}

interface A2 {
    void abc();
}

interface B2 extends A2, Jumpable {
    void def();
}

abstract class D implements B2 {
//    it has all what interface A2 has
}