package Lesson29;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;

public class TestEmployee {

    public static void printEmployee(Employee employee){
        System.out.println("Name: " + employee.getName() + ". Department: " + employee.getDepartment() + ". Salary: " + employee.getSalary());
    }

    public static void filterOfEmployee(ArrayList<Employee> aL, Predicate<Employee> t){
        for (Employee emp : aL) {
            if (t.test(emp)) {
                printEmployee(emp);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        Employee employee1 = new Employee("John", "IT", 2000);
        Employee employee2 = new Employee("Eric", "Finance", 1800);
        Employee employee3 = new Employee("Eva", "Sales", 450);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        filterOfEmployee(employees, (Employee emp) -> Objects.equals(emp.getDepartment(), "IT"));
        System.out.println("-------");
        filterOfEmployee(employees, (Employee emp) -> emp.getName().startsWith("E") && emp.getSalary() != 450);
        System.out.println("-------");
        filterOfEmployee(employees, (Employee emp) -> !Objects.equals(emp.getName(), emp.getDepartment()));
        System.out.println("-------");
    }
}
