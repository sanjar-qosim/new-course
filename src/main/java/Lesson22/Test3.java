package Lesson22;

public class Test3 {
    void promoteSalary(Employee emp){
        emp.salary += 100;
    }
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.name = "Ivan";
        doctor.age = 50;
        doctor.experience = 25;
        doctor.spec ="Dentist";
        doctor.eat();
        doctor.sleep();
        doctor.heal();
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

class Xirurg extends Doctor {
    String skalpel;
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