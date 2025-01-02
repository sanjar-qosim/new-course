package Lesson25;

public class Test3 {
    public static void main(String[] args) {
        Employee3 emp1 = new Doctor3();
        Employee3 emp2 = new Teacher3();
        Employee3 emp3 = new Driver3();

        Doctor3 d1 = (Doctor3) emp1;

        System.out.println(d1.spec);
        ((Doctor3) emp1).heal();
        System.out.println(((Doctor3)emp1).spec);

        Help_able3 h = new Doctor3();
        System.out.println(((Doctor3)h).spec);
    }
}

class Employee3 {
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

class Doctor3 extends Employee3 implements Help_able3{
    String spec = "Xirurg";

    void heal() {
        System.out.println("healing");
    }

    @Override
    public void help(){
        System.out.println("The doctor is helping");
    }
}

class Teacher3 extends Employee3 {
    int amountStudents;
    void teach() {
        System.out.println("teaching");
    }
}

class Driver3 extends Employee3 {
    String car;
    void drive() {
        System.out.println("driving");
    }
}

interface Help_able3 {
    void help();
}