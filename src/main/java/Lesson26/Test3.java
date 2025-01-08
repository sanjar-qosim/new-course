package Lesson26;

public class Test3 {

    void abc(int i){
        System.out.println("int");
    }

    void abc(byte i){
        System.out.println("byte");
    }

    void abc(long i){
        System.out.println("long");
    }

    void def(Object o){
        System.out.println("Object");
    }

    void def(String o){
        System.out.println("String");
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc(5);
        t.def("hello");
    }
}
