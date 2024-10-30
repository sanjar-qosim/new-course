package Lesson5;

public class Test3 {
    Test3(){
        
    }
    String color;
    String engine;
    int speed;

    int gaz(int skorost){
        speed+=skorost;
        return speed;
    }

    int tormoz(int skorost){
        speed-=skorost;
        return speed;
    }

    void showInfo(){
        System.out.println("Цвет: " + color + " мотор: " + engine + " скорость: " + speed);
    }
}

class Test4 {
    public static void main(String[] args) {
        Test3 car1 = new Test3();
        car1.color = "white";
        car1.engine = "V6";
        car1.speed = 60;
        car1.showInfo();

        car1.gaz(20);
        car1.showInfo();
        car1.tormoz(80);
        car1.showInfo();
        System.out.println();


        Test3 car2 = new Test3();
        car2.color = "Black";
        car2.engine = "V9";
        car2.speed = 90;
        car2.showInfo();
        car2.gaz(20);
        car2.showInfo();
        car2.tormoz(50);
        car2.showInfo();

    }
}