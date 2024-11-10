package Lesson8;

public class Test1 {
    public final int a;
    Test1(int a){
        this.a = a;
    }
    Test1(){
        a = 10;
    }
    Test1(boolean b){
        a = 15;
    }

    public void abc(final short s){
        final byte b;
        b = 10;
        System.out.println(s + b);
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1(true);
        System.out.println(t1.a);
        Test1 t2 = new Test1();
        System.out.println(t2.a);
//        Compile error! Because this variable is constant
//        t1.a = 54;
        Test1 t3 = new Test1(160);
        System.out.println(t3.a);
    }
}
