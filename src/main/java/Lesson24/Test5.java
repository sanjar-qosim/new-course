package Lesson24;

public class Test5 {
}

interface I1 {
    void abc();

    default void def(){
        System.out.println("This is the def method");
    };
}

class Z2 implements I1 {

    @Override
    public void abc(){
        System.out.println("This is the abc method");
    }

    public static void main(String[] args) {
        Z2 z2 = new Z2();
        z2.abc();
        z2.def();
    }
}