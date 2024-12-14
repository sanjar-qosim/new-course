package Lesson23;

public class Test3 {
    public static void main(String[] args) {
        Employee2 e = new Employee2();
        Teacher2 t = new Teacher2();
        t.eat();
        e.eat();

        Employee2 e2 = new Teacher2();
        e2.eat();
    }
}

class Eda{

}

class Frukti extends Eda {

}

class Employee2 {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;
    public void eat() {
        System.out.println("the employer eating");
    }
    void sleep() {
        System.out.println("sleeping");
    }
}

class Teacher2 extends Employee2 {
    int amountStudents;
    Frukti teach() {
        System.out.println("teaching");
        Frukti frukti = new Frukti();
        return frukti;
    }
    public void eat() {
        System.out.println("the teacher eating");
    }
}

class A {
    Employee2 objectCreation(){
        return new Employee2();
    }
}

class B extends A {

}