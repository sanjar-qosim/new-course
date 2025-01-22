package Lesson27;

public class Test1 {
    public static void main(String[] args) {
        Animal ani = new Tiger();
        System.out.println(ani.a);
        System.out.println(ani.b);
        ani.abc();
        ani.def();
    }
}

class Animal {

    int a = 5;

    static int b = 10;

    void abc(){
        System.out.println("Non static method from Animal class");
    }

    static void def(){
        System.out.println("Static method from Animal class");
    }
}

class Tiger extends Animal {

    int a = 15;

    static int b = 20;

    void abc(){
        System.out.println("Non static method from Tiger class");
    }

    static void def(){
        System.out.println("Static method from Tiger class");
    }
}