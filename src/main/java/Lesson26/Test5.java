package Lesson26;

public class Test5 {

    String s1;

    {
        System.out.println("It's a init block");
        int a = 5;
        System.out.println(a);
        System.out.println(s1);
    }

    {
        System.out.println("Second init block");
    }

    static {
        System.out.println("It's a static init block");
    }

    Test5(){
        System.out.println("It's a constructor 1");
    }

    Test5(int a){
        this();
        System.out.println("It's a constructor 2");
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        Test5 t2 = new Test5(1);
    }
}
