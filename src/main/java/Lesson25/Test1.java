package Lesson25;

public class Test1 {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Doctor();
        Employee emp3 = new Driver();

        Employee [] array2 = {emp1, emp2, emp3};

        for (Employee emp : array2) {
            emp.work();
        }

    }
}

abstract class Employee {

    void sleep(){
        System.out.println("Employee sleeps");
    }

    abstract void work();
}

class Teacher extends Employee implements Help_able {

    @Override
    void work(){
        System.out.println("Teacher works");
    }

    @Override
    public void help(){
        System.out.println("Teacher helps");
    }
}

class Driver extends Employee implements Help_able {

    @Override
    void work(){
        System.out.println("Driver works");
    }

    @Override
    public void help(){
        System.out.println("Driver helps");
    }
}

class Doctor extends Employee implements Help_able {

    @Override
    void work(){
        System.out.println("Doctor works");
    }

    @Override
    public void help(){
        System.out.println("Doctor helps");
    }
}

interface Help_able {
    void help();
}