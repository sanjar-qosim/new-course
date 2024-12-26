package Lesson24;

public class Test3 {
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
    public void tushitPojar() {
        System.out.println("Uchitel tushit pojar");
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
    public void tushitPojar() {
        System.out.println("voditel tushit pojar");
    }

    @Override
    public void swim() {
        System.out.println("voditel plavaet");
    }
}

interface Help_able {
    void pomosh();
    void tushitPojar();
}

interface Swim_able {
    void swim();
}