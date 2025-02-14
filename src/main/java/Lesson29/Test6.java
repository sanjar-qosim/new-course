package Lesson29;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test6 {

}


class Student6 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student6(String name, char sex, int age, int course, double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo6 {
    void printStudent(Student6 s) {
        System.out.println("Name: " + s.name + ", sex: " + s.sex + ", age: " + s.age + ", course: " + s.course + ", grade: " + s.avgGrade);
    }

    void testStudents(ArrayList<Student6> aL, Predicate<Student6> t){
        for (Student6 s : aL) {
            if (t.test(s)) {
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student6> list = new ArrayList<>();

        Student6 st1 = new Student6("Ivan", 'm', 22, 3, 8.3);
        Student6 st2 = new Student6("Nikolay", 'm', 28, 2, 6.4);
        Student6 st3 = new Student6("Elena", 'f', 19, 1, 8.9);
        Student6 st4 = new Student6("Petr", 'm', 35, 4, 7);
        Student6 st5 = new Student6("Maria", 'f', 23, 3, 9.1);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo6 studentInfo = new StudentInfo6();

        for (Student6 s : list) {
            System.out.println(s.name);
        }
        System.out.println();
        list.removeIf(x -> x.name.endsWith("a"));
        for (Student6 s : list) {
            System.out.println(s.name);
        }

//        studentInfo.testStudents(list, (Student6 st) -> st.avgGrade > 8.5);
//        System.out.println("--------------------------");
//        studentInfo.testStudents(list, (Student6 st) -> st.avgGrade < 9);
//        System.out.println("--------------------------");
//        studentInfo.testStudents(list, (Student6 st) -> st.age > 25);
//        System.out.println("--------------------------");
//        studentInfo.testStudents(list, (Student6 st) -> st.age < 25);
//        System.out.println("--------------------------");
//        studentInfo.testStudents(list, (Student6 st) -> st.sex == 'm');
//        System.out.println("--------------------------");
//        studentInfo.testStudents(list, (Student6 st) -> st.avgGrade > 7.2 && st.age < 23 && st.sex == 'f');
//        System.out.println("--------------------------");
    }
}