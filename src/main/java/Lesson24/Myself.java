package Lesson24;

public class Myself extends Bio {

    void setName(String name){
        super.name = name;
    }

    void setAge(int age){
        super.age = age;
    }

    @Override
    public void pushUp() {
        System.out.println("I am doing push up");
    }

    @Override
    public void pushDown() {
        System.out.println("I am doing push down");
    }

    @Override
    public void English() {
        System.out.println("I study English");
    }

    @Override
    public void Math() {
        System.out.println("I study math");
    }
}

abstract class Bio implements Exercises, Study {
    String name;
    int age;
}

interface Exercises {
    void pushUp();
    void pushDown();
}

interface Study {
    void English();
    void Math();
}

class MyTest {
    public static void main(String[] args) {
        Myself myself = new Myself();

        myself.setName("Sanjar");
        myself.setAge(26);

        System.out.println(myself.name);
        System.out.println(myself.age);

        myself.pushUp();
        myself.pushDown();
        myself.English();
        myself.Math();
    }
}