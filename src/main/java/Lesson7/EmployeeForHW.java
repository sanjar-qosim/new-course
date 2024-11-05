package Lesson7;

public class EmployeeForHW {
    protected int id;
    public String surname;
    private double salary;
    public void showId(){
        System.out.println(id);
    }
    public void showSurname(){
        System.out.println(surname);
    }
    public void showSalary(){
        System.out.println(salary);
    }
    public EmployeeForHW(int id, String surname, double salary){
        this(id);
        this.surname = surname;
        this.salary = salary;
    }
    EmployeeForHW(int id, String surname){
        this(id);
        this.surname = surname;
    }
    private EmployeeForHW(int id){
        this.id = id;
    }
}

class EmployeeForHWTest {
    public static void main(String[] args) {
        EmployeeForHW emp1 = new EmployeeForHW(251, "Petrov");
        EmployeeForHW emp2 = new EmployeeForHW(234, "Ivanov", 534000);
//        Compile error! Because this constructor is a private
//        EmployeeForHW emp3 = new EmployeeForHW(234);

        emp1.showId();
        emp1.showSurname();
        emp1.showSalary();
        System.out.println();
        emp2.showId();
        emp2.showSurname();
        emp2.showSalary();
//        Compile error! Because this variable is a private
//        emp2.salary;
    }
}
