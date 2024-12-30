package Lesson24;

public class Test5 {
}

interface I1 {
    static void def(){
        System.out.println("This is a static method");
    }

    default void abc(){
        System.out.println("This is the abc method");
    };
}

class R implements I1 {
    public static void main(String[] args) {
        I1.def();
    }
}

//class Z2 implements I1 {
//
//    @Override
//    public void abc(){
//        System.out.println("This is the abc method");
//    }
//
//    public static void main(String[] args) {
//        Z2 z2 = new Z2();
//        z2.abc();
//        z2.def();
//    }
//}