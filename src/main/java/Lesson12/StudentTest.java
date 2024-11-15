package Lesson12;

import Lesson11.Student;

public class StudentTest {

    static void halfMatch(Student st1, Student st2){
        if (st1.getName().equals(st2.getName()) && st1.getCourse() == st2.getCourse() && st1.getGrade() == st2.getGrade()) {
            System.out.println("Students are same!");
        } else {
            System.out.println("Students are not same!");
        }
    }

    static void fullMatch(Student st1, Student st2){
        if (st1.getName().equals(st2.getName())) {
            if (st1.getCourse() == st2.getCourse()) {
                if (st1.getGrade() == st2.getGrade()) {
                    System.out.println("Students are same!");
                } else {
                    System.out.println("Students' grades are not same");
                }
            } else {
                System.out.println("Student's courses are not same");
            }
        } else {
            System.out.println("Student's names are not same");
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Pasha2", 3, 5.6);
        Student st2 = new Student("Pasha", 2, 5.5);

        StudentTest.halfMatch(st1, st2);
        StudentTest.fullMatch(st1, st2);
    }
}