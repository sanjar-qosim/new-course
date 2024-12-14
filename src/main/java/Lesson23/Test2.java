package Lesson23;

import javax.print.Doc;

public class Test2 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Teacher teacher = new Teacher();
        Driver driver = new Driver();

        Employee employee = new Employee();
        Employee employee1 = new Doctor();



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

class Doctor extends Employee {
    String spec;
    void heal() {
        System.out.println("healing");
    }
}

class Teacher extends Employee {
    int amountStudents;
    void teach() {
        System.out.println("teaching");
    }
}

class Driver extends Employee {
    String car;
    void drive() {
        System.out.println("driving");
    }
}