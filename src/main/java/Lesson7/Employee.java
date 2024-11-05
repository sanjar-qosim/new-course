package Lesson7;

public class Employee {
    public double salary;
    public void doubleSalary(){
        double result = salary * 2;
        System.out.println("Your new salary is: " + result);
    }
    public Employee(double salary){
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(850);
        System.out.println(emp.salary);
        emp.doubleSalary();

    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(950);
        System.out.println(emp.salary);
        emp.doubleSalary();
    }
}
