package Lesson11;

public class Car {
    private String color;
    private String engine;
    private int countOfDoor;

    public void setColor(String color){
        this.color = color;
    }

    public void setEngine(String engine){
        this.engine = engine;
    }

    public void setCountOfDoor(int countOfDoor){
        this.countOfDoor = countOfDoor;
    }

    public String getColor(){
        return this.color;
    }

    public String getEngine(){
        return this.engine;
    }

    public int getCount(){
        return this.countOfDoor;
    }

    public static void swapColor(final Car x, final Car y){
        String tmpColor = x.color;
        x.color = y.color;
        y.color = tmpColor;
        System.out.println("First object: " + x.color);
        System.out.println("Second object: " + y.color);
    }
    public static void changeCountOfDoor(Car car, int count){
        car.countOfDoor = count;
    }

    Car(){}

    Car(String color, String engine, int countOfDoor){
        this.color = color;
        this.engine = engine;
        this.countOfDoor = countOfDoor;
    }
}

class CarTest {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setColor("Black");
        c1.setEngine("V8");
        c1.setCountOfDoor(3);

        System.out.println(c1.getCount());
        Car.changeCountOfDoor(c1, 4);
        System.out.println(c1.getCount());
        System.out.println();

        Car c2 = new Car();
        Car c3 = new Car();

        c2.setColor("Pink");
        c2.setEngine("X1");
        c2.setCountOfDoor(3);

        c3.setColor("Grey");
        c3.setEngine("Y1");
        c3.setCountOfDoor(4);

        Car.swapColor(c2, c3);
        System.out.println();

        Car c4 = new Car("Red", "M1", 6);
        System.out.println(c4.getColor());
        System.out.println(c4.getEngine());
        System.out.println(c4.getCount());
    }

}