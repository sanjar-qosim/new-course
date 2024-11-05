package Lesson7_1;

import Lesson7.Employee;

public class TretiyClass {
    public static void main(String[] args) {
        Employee emp = new Employee(1000);
        System.out.println(emp.salary);
        emp.doubleSalary();
    }
}
