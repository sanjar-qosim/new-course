package Lesson6;

public class HomeWork {
    void sum(){
        System.out.println(0);
    }
    void sum(int a){
        System.out.println(a);
    }
    void sum(int a, int b){
        System.out.println(a + b);
    }
    void sum(int a, int b, int c){
        System.out.println(a + b + c);
    }
    void sum(int a, int b, int c, int d){
        System.out.println(a + b + c + d);
    }
}

class HomeworkTest {
    public static void main(String[] args) {
        HomeWork hw = new HomeWork();
        hw.sum();
        hw.sum(13);
        hw.sum(2, 10);
        hw.sum(5, 5, 5);
        hw.sum(6, 6, 6, 6);
        System.out.println();
        HomeWork hw2 = new HomeWork();
        hw2.sum();
        hw2.sum(25);
        hw2.sum(3, 4);
        hw2.sum(4, 2, 0);
        hw2.sum(0, 5, 0, 5);
    }
}
