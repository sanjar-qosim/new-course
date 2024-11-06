package Lesson8;

public class Student {
    static int count;
    String name;
    int course;
    int a;

    public Student(String name, int course){
        count++;
        this.name = name;
        this.course = course;
        System.out.println(count + " - student was created!");
    }

    public static void showCount(){
        System.out.println("Created: " + count);
    }
    public void showInfo(){
        System.out.println("Welcome to the Student class!");
    }

    public static void main(String[] args) {

    }
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1);
        Student st2 = new Student("Petr", 5);
        Student st3 = new Student("Masha", 3);
        Student.showCount();
    }
}