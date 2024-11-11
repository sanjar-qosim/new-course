package Lesson9;

public class Car {
    String color;

    String engine;

    static int count;

    int a = 10;

    public static void changeA(int b){
        Car c1 = new Car("black", "V6");
        c1.a = b;
    }

    Car(String color, String engine){
        count++;
        this.color = color;
        this.engine = engine;
        this.count++;
    }

    public void showColor(){
        System.out.println("Color is: " + this.color);
        this.changeColor("red");
    }

    public void changeColor(String color){
        System.out.println("Color will we changed");
        int cost = 5000;
        this.color = color;
        cost +=1000;
    }

}
