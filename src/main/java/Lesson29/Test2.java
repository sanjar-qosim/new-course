package Lesson29;

import java.util.ArrayList;

public class Test2 {

}

class Student2 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student2(String name, char sex, int age, int course, double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo2 {
    void printStudent(Student2 s) {
        System.out.println("Name: " + s.name + ", sex: " + s.sex + ", age: " + s.age + ", course: " + s.course + ", grade: " + s.avgGrade);
    }

    void testStudents(ArrayList<Student2> aL, StudentsChecks sc){
        for (Student2 s : aL) {
            if (sc.testStudent(s)) {
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList<>();

        Student2 st1 = new Student2("Ivan", 'm', 22, 3, 8.3);
        Student2 st2 = new Student2("Nikolay", 'm', 28, 2, 6.4);
        Student2 st3 = new Student2("Elena", 'f', 19, 1, 8.9);
        Student2 st4 = new Student2("Petr", 'm', 35, 4, 7);
        Student2 st5 = new Student2("Maria", 'f', 23, 3, 9.1);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo2 studentInfo2 = new StudentInfo2();

        FindStudentsOverGrade findStudentsOverGrade = new FindStudentsOverGrade();
        FindStudentsUnderGrade findStudentsUnderGrade = new FindStudentsUnderGrade();
        FindStudentsOverAge findStudentsOverAge = new FindStudentsOverAge();
        FindStudentsUnderAge findStudentsUnderAge = new FindStudentsUnderAge();
        FindStudentsBySex findStudentsBySex = new FindStudentsBySex();
        FindStudentsMixCondition findStudentsMixCondition = new FindStudentsMixCondition();

        studentInfo2.testStudents(list, findStudentsOverGrade);
        System.out.println("--------------------------");
        studentInfo2.testStudents(list, findStudentsUnderGrade);
        System.out.println("--------------------------");
        studentInfo2.testStudents(list, findStudentsOverAge);
        System.out.println("--------------------------");
        studentInfo2.testStudents(list, findStudentsUnderAge);
        System.out.println("--------------------------");
        studentInfo2.testStudents(list, findStudentsBySex);
        System.out.println("--------------------------");
        studentInfo2.testStudents(list, findStudentsMixCondition);
        System.out.println("--------------------------");
    }
}

interface StudentsChecks {
    boolean testStudent(Student2 s);
}

class FindStudentsOverGrade implements StudentsChecks {
    public boolean testStudent(Student2 s){
        return  s.avgGrade > 8.5;
    }
}

class FindStudentsUnderGrade implements StudentsChecks {
    public boolean testStudent(Student2 s){
        return  s.avgGrade < 9;
    }
}

class FindStudentsOverAge implements StudentsChecks {
    public boolean testStudent(Student2 s){
        return  s.age > 25;
    }
}

class FindStudentsUnderAge implements StudentsChecks {
    public boolean testStudent(Student2 s){
        return  s.age < 25;
    }
}

class FindStudentsBySex implements StudentsChecks {
    public boolean testStudent(Student2 s){
        return  s.sex == 'm';
    }
}

class FindStudentsMixCondition implements StudentsChecks {
    public boolean testStudent(Student2 s){
        return  s.avgGrade > 7.2 && s.age < 23 && s.sex == 'f';
    }
}