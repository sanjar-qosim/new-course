package Lesson12;

public class Car {

    int engine;
    int doorCount;

    Car(int engine, int doorCount){
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest {

    public static void main(String[] args) {
        Car c1 = new Car(3, 4);
        Car c2 = new Car(2, 5);

        if(c1.engine > c2.engine) {
            if (c1.doorCount > c2.doorCount) {
                System.out.println("Moshnost i kol-vo dverey bolshe");
            } else {
                System.out.println("Moshnost motora bolshe, no kol-vo dverey menshe");
            }
        } else {
            System.out.println("Moshnost motora pervoy mashini menshe");
        }

    }
}