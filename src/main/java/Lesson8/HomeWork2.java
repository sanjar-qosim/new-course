package Lesson8;

public class HomeWork2 {
    public static final double pi = 3.14;

    double areaOfCircle(double radius) {
        return pi * (radius * radius);
    }

    static double lengthOfCircle(double radius) {
        return 2 * pi * radius;
    }

    public void info(double radius) {
        double area = areaOfCircle(radius);
        double length = lengthOfCircle(radius);
        System.out.println("Radius is: " + String.format("%.2f", radius));
        System.out.println("Area is: " + String.format("%.2f", area));
        System.out.println("Length is: " + String.format("%.2f", length));
    }
}

class  HomeWork2Test {
    public static void main(String[] args) {
        System.out.println("Pi is: " + HomeWork2.pi);
        HomeWork2.lengthOfCircle(5);
        HomeWork2 hw = new HomeWork2();
        hw.info(5);
    }
}