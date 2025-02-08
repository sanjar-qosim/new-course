package Lesson27_1;

public class Test18 {

    void abc() {
        System.out.println("abc method");
        throw new StackOverflowError();
    }

    void def() {
        try {
            abc();
            return;
        } finally {
            System.out.println("finally block");
        }
    }

    public static void main(String[] args) {
        Test18 test18 = new Test18();
        test18.def();
    }
}
