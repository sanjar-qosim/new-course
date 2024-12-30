package Lesson23.Homeworks.p7;

class X{
    String s1 = "privet";
}

class Y extends X {
    boolean bool = false;
}

public class Test {
    public static void main(String[] args) {
        X x = new Y();
//        System.out.println(x.s1 + " " + x.bool);
//        compile error! because it can't see elements of child class (Y)
    }
}
