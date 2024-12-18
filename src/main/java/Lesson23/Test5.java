package Lesson23;

public class Test5 {
    public static void main(String[] args) {
        Employee3 E = new Teacher3();
        Employee3 emp = new Employee3();
        Teacher3 t = new Teacher3();

//        emp.sleep();
//        t.sleep();
    }
}

class Eda3 {

}

class Frukti3 extends Eda3 {

}

class Employee3 {
    double salary = 100;
    String name = "Kolya";
    public void eat() {
        System.out.println("the employer eating");
    }
    private void sleep() {
        System.out.println("sleeping");
    }
}

class Teacher3 extends Employee3 {
    int amountStudents;
    Frukti teach() {
        System.out.println("teaching");
        Frukti frukti = new Frukti();
        return frukti;
    }
    @Override
    public  void eat() {
        System.out.println("the teacher eating");
    }
    private void sleep(){
        System.out.println("the teacher sleeping");
    }
}