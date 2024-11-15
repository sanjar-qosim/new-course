package Lesson11;

public class Student {
    private String name;
    private int course;
    private double grade;

    public String getName(){
        return this.name;
    }

    public int getCourse(){
        return this.course;
    }

    public double getGrade(){
        return this.grade;
    }

     public Student(String name, int course, double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swap(Student s1, Student s2){
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println(s1.name);
        System.out.println(s2.name);
    }

    public static void changeName(Student s1){
        s1.name = "Vasiliy";
    }

    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Petr", 1, 5.3);

        swap(st1, st2);

        System.out.println(st1.name);
        System.out.println(st2.name);

        changeName(st2);
        System.out.println(st2.name);
    }
}
