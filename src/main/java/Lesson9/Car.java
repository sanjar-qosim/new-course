package Lesson9;

public class Car {
    final int XYZ = 123;

    String color;

    String engine;

    static int count;

    int a = 10;

    public static void changeA(int b){
        Car c1 = new Car("black", "V8");
        c1.a = b;
    }

    Car(String color, String engine){
        count++;
        this.color = color;
        this.engine = engine;
        this.count++;
    }

    public static void main(String[] args) {
        Car c1 = new Car("red", "v6");
    }

}
