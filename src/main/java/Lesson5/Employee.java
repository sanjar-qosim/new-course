package Lesson5;

public class Employee {
    Employee(int id, String surname, int age, String department, double salary2){
        salary = salary2;
        System.out.println("ID: " + id + "\nSurname: " + surname + "\nAge: " + age + "\nDepartment: " + department + "\n");
    }
    private double salary;
    void promoteSalary(){
        salary = salary * 2;
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
