package Lesson16;

public class Test4 {

}

class Employee {
    double salary;
    boolean isManager;

    Employee(double salary, boolean isManager){
        this.salary = salary;
        this.isManager = isManager;
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee(100.5, true);

//        COMPILE ERROR! because two different types
//        System.out.println(emp.isManager + emp.salary);

        System.out.println("Is he manager: " + emp.isManager + "\nSalary is: " + emp.salary);

    }
}