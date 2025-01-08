package Lesson26;

public class Test4 {

    static void abc(String s){ // 1
        System.out.println("A");
    }

    static void abc(String ... s){ // 3
        System.out.println("B");
    }

    static void abc(Object s){ // 2
        System.out.println("C");
    }

    static void abc(String s1, String s2){
        System.out.println("D");
    }

    static void def(Long a){ // 4
        System.out.println("E");
    }

    static void def(Long ... a){
        System.out.println("F");
    }

    static void def(long a){
        System.out.println("G"); //1
    }

    static void def(Object a){ // 3
        System.out.println("H");
    }

    static void def(Integer a){
        System.out.println("I"); // 2
    }

    public static void main(String[] args) {
        Test4.abc("ok");
        Test4.def(50);
    }
}
