package Lesson8;

public class Student {
    static int count;
    String name;
    int course;
    static int a;
    int b;

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
    void abc(){
        a++;
    }
//    Compile error! Because static method uses only static variables
//    static void abcd(){
//        b++;
//    }

    static void abcd(){
        Student st1 = new Student("StaticTest", 110);
        st1.b++;
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1);
        Student st2 = new Student("Petr", 5);
        Student st3 = new Student("Masha", 3);
//        And we can use static method without create the object
        Student.showCount();
        st3.showCount();
        System.out.println(Student.count);

//        Another case
        st1.abc();
        st2.abc();
        st3.abc();
        System.out.println("Test: " + Student.a);

        Student.abcd();
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