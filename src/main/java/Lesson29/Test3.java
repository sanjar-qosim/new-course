package Lesson29;

import java.util.ArrayList;

public class Test3 {

}

class Student3 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student3(String name, char sex, int age, int course, double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo3 {
    void printStudent(Student3 s) {
        System.out.println("Name: " + s.name + ", sex: " + s.sex + ", age: " + s.age + ", course: " + s.course + ", grade: " + s.avgGrade);
    }

    void testStudents(ArrayList<Student3> aL, StudentsChecks3 sc){
        for (Student3 s : aL) {
            if (sc.test(s)) {
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student3> list = new ArrayList<>();

        Student3 st1 = new Student3("Ivan", 'm', 22, 3, 8.3);
        Student3 st2 = new Student3("Nikolay", 'm', 28, 2, 6.4);
        Student3 st3 = new Student3("Elena", 'f', 19, 1, 8.9);
        Student3 st4 = new Student3("Petr", 'm', 35, 4, 7);
        Student3 st5 = new Student3("Maria", 'f', 23, 3, 9.1);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo3 studentInfo = new StudentInfo3();

        studentInfo.testStudents(list, (Student3 st) -> st.avgGrade > 8.5);
        System.out.println("--------------------------");
        studentInfo.testStudents(list, (Student3 st) -> st.avgGrade < 9);
        System.out.println("--------------------------");
        studentInfo.testStudents(list, (Student3 st) -> st.age > 25);
        System.out.println("--------------------------");
        studentInfo.testStudents(list, (Student3 st) -> st.age < 25);
        System.out.println("--------------------------");
        studentInfo.testStudents(list, (Student3 st) -> st.sex == 'm');
        System.out.println("--------------------------");
        studentInfo.testStudents(list, (Student3 st) -> st.avgGrade > 7.2 && st.age < 23 && st.sex == 'f');
        System.out.println("--------------------------");
    }
}

interface StudentsChecks3 {
    boolean test(Student3 s);
}