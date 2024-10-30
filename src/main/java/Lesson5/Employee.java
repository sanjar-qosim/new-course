package Lesson5;

public class Employee {
    private int id;
    private String surname;
    private int age;
    private String department;
    private double salary;
    Employee(int id2, String surname2, int age2, String department2, double salary2){
        id = id2;
        surname = surname2;
        age = age2;
        department = department2;
        salary = salary2;
        System.out.println("ID: " + id2 + "\nSurname: " + surname2 + "\nAge: " + age2 + "\nDepartment: " + department2 + "\n");
    }
    void promoteSalary(){
        salary *= 2;
        System.out.println("Congrats! Your salary was promoted! The new salary is: " + salary);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(458, "Jackson", 28, "Marketing", 1500);
        Employee employee2 = new Employee(248, "White", 32, "IT", 1200);

        employee1.promoteSalary();
        employee2.promoteSalary();
    }
}
