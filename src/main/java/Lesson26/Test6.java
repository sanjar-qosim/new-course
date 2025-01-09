package Lesson26;

public class Test6 {

    int a =3;

    Test6(){
        a = 4;
    }

    {
        a = 5;
    }

    public static void main(String[] args) {
        Test6 test6 = new Test6();
        System.out.println(test6.a);
    }
}

//class A {
//
//    static final int b = 10;
//
//    static {
//        b = 10;
//    }
//}

class B {

    static int c;

    static final int d;

    static final int e = 1;

    static final int f;

    static {
        c = 5;
        d = 3;
//        e =2;
        f = 0;
    }
}