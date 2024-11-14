package Lesson12;

public class Test10 {

    void maximum(int a, int b, int c){
        if (a > b && a > c) {
            int i1 = 5;
            System.out.println("Maximum: " + a);
        } else if (b > a && b > c) {
            int i1 = 4;
            System.out.println("Maximum: " + b);
        } else if (c > a && c > b) {
            int i1 = 3;
            System.out.println("Maximum: " + c);
        }
    }

    void abc(){
        String str;
        int a = 10;
        if (a >= 10) {
            str = "Privet";
        }
        if (a <= 10) {
            str = "Poka";
        } else {
            str = null;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        int salary = 800;

        boolean b = true;

        if(salary < 200) {
            System.out.println("Salary is too small");
        } else if (salary < 400 && b == false || true) {
            System.out.println("Salary is average");
        } else if (b ==  true) {
            System.out.println("Salary is high");
        } else {
            System.out.println("Salary is very good");
        }

        Test10 t1 = new Test10();
        t1.maximum(5, 7, 0);

        int a = 10;
        int ab = 20;
        int maximum = (a < ab) ? a : ab;
        System.out.println(maximum);

    }
}
