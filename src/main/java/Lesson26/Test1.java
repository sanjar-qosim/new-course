package Lesson26;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("Red", "V4");
        Car c2 = new Car("Red", "V4");
        Car c3 = new Car("Black", "V8");

        System.out.println(c1.equals(c2));

        ArrayList<Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);

        Car c4 = new Car("Black", "V8");

        System.out.println(list.contains(c4));

        System.out.println(c3.toString());
    }
}

class Car {

    String color;
    String engine;

    Car(String color, String engine){
        this.color = color;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Car) {
            return (color.equals(((Car) obj).color) && engine.equals(((Car) obj).engine));
        }
        return false;
    }

    @Override
    public String toString(){
        return "Color of car " + color + " and motor is " + engine;
    }
}
