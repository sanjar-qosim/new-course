package Lesson24;

public class Test3 {
    public static void main(String[] args) {
        Help_able h = new Driver();
        Swim_able s = new Driver();
        Employee e = new Driver();

        System.out.println(h.a);
        h.pomosh();
        h.tushitPojar("voda");

//        compile error! because, the object linked to the interface, and it can't see this method
//        h.eat();
//        h.vodit();

        s.swim();
    }
}

class Employee {
    double salary;
    String name;
    int age;
    int experience;
    void eat() {
        System.out.println("eating");
    }
    void sleep() {
        System.out.println("sleeping");
    }
}

class Driver extends Employee implements Help_able, Swim_able {
    String car;
    void drive() {
        System.out.println("driving");
    }

    @Override
    public void pomosh() {
        System.out.println("voditel pomogaet");
    }

    @Override
    public void tushitPojar(String s) {
        System.out.println("voditel tushit pojar s pomoshyu " + s);
    }

    @Override
    public void swim() {
        System.out.println("voditel plavaet");
    }
}


class Teacher extends Employee implements Help_able {
    int amountStudents;

    void teach() {
        System.out.println("teaching");
    }

    @Override
    public void pomosh() {
        System.out.println("Uchitel okazivaet pomosh");
    }

    @Override
    public void tushitPojar(String s) {
        System.out.println("Uchitel tushit pojar s pomoshyu " + s);
    }
}

interface Help_able {
    void pomosh();
    void tushitPojar(String predmet);
    public final static int a = 10;
}

interface Swim_able {
    void swim();
}

abstract class Y implements Swim_able{}
abstract class X extends Y {}
class Z extends Y {
    public void swim(){}
}