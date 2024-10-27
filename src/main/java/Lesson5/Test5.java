package Lesson5;


public class Test5 {
    Test5(String  cvet, String motor){
        color = cvet;
        engine = motor;
    }

    Test5(int wh, int hd){
        System.out.println("Конструктор с шириной создаля успешно");
        shirina = wh;
        dlina = hd;
        System.out.println("Ширина: " + shirina + "\nДлина: " + dlina);
    }

    Test5(){
        System.out.println("Object was created successful");
    }

    String color;
    String engine;
    int shirina;
    int dlina;

    //метод, всего лишь задаем void
    void drive(){
        System.out.println("Машина едет");
    }
}

class Test5_1 {
    public static void main(String[] args) {
        Test5 car1 = new Test5("yellow", "V3");
        Test5 car2 = new Test5(10, 5);
        System.out.println(car1.color);
        System.out.println(car2.dlina);
        car2.dlina = 7;
        System.out.println(car2.dlina);

        Test5 testObject = new Test5();
        testObject.drive();

    }
}
