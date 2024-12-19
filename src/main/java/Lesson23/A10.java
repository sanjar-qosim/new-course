package Lesson23;

public class A10 {
    String s1 = "privet";

    static double d1 = 3.14;

    int summa(int ... i){
        int result = 0;
        for (int a : i) {
            result += a;
        }
        return result;
    }
    static void abc(){
        System.out.println("static method");
    }
}

class B10 extends A10 {
//    String s2 = super.s1 + ", drug";

    boolean s1 = true;
    int summa(int ... i){
        int result = super.summa(i);
        System.out.println("res: " + result);
        return result;
    }

    public static void main(String[] args) {
        B10 b10 = new B10();
//        System.out.println(b10.s2);
        b10.summa(5, 5);
    }
}
