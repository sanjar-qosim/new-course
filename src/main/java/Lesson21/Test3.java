package Lesson21;

public class Test3 {
    Test3(){
        System.out.println("This is constructor!");
    }

    void Test3(){
        System.out.println("This is method!");
    }

    int Test3 = 3;
}

class A {
    public static void main(String[] args) {
        Test3 t = new Test3();
    }
}
