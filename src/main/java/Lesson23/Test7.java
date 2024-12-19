package Lesson23;

public class Test7 {
    public static void main(String[] args) {
        A7 c1 = new C7();
        c1.abc(new B7());
    }
}

class A7 {
    void abc(A7 a){
        System.out.println("A");
    }
}

class B7 extends A7 {
    void abc(B7 b1){
        System.out.println("B");
    }
}

class C7 extends B7 {
    void abc(B7 b2){
        System.out.println("C");
    }
}