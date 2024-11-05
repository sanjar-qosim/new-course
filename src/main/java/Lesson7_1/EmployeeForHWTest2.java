package Lesson7_1;

import Lesson7.EmployeeForHW;

public class EmployeeForHWTest2 {
    public static void main(String[] args) {
        EmployeeForHW emp2 = new EmployeeForHW(234, "Ivanov", 534000);

//        Compile error! Because this constructor is a default, and it can't be used in other package
//        EmployeeForHW emp1 = new EmployeeForHW(251, "Petrov");

//        Compile error! Because this constructor is a private
//        EmployeeForHW emp3 = new EmployeeForHW(234);

        System.out.println();
        emp2.showId();
        emp2.showSurname();
        emp2.showSalary();


    }
}
