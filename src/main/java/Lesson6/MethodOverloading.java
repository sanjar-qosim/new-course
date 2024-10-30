package Lesson6;

public class MethodOverloading {
    void show(int i1){
        System.out.println(i1);
    }
    void show(boolean b1){
        System.out.println(b1);
    }
    void show(String s1){
        System.out.println(s1);
    }

    void show(int i1, String s1){
        System.out.println(i1 + s1);
    }
    void show(String s1, int i1){
        System.out.println(s1 + i1);
    }

}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 500;
        mO.show(a);
        boolean b =true;
        mO.show(b);
        String s = "Hello!";
        mO.show(s);

        mO.show(55, " Perviy");
        mO.show("Vtoroy ", 65);
    }
}