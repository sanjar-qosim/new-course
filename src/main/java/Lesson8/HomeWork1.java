package Lesson8;

public class HomeWork1 {
    static double umn3(double a, double b, double c){
        return a * b * c;
    }
    static void del(int a, int b) {
        System.out.println("Answer is: " + a / b);
        System.out.println("Remain is: " + a % b);
    }
}

class HomeWork1Test {
    public static void main(String[] args) {
        System.out.println(HomeWork1.umn3(5, 1, 10));
        HomeWork1.del(10, 3);

        System.out.println();

        System.out.println(HomeWork1.umn3(2, 2, 2));
        HomeWork1.del(77, 7);
    }
}
