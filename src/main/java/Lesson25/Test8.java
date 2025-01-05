package Lesson25;

public class Test8 implements A, B{
    public static void main(String[] args) {
        Test8 test8 = new Test8();
        System.out.println(A.num);
        System.out.println(B.num);
    }
}

interface A {
    int num = 10;
}

interface B {
    int num = 20;
}