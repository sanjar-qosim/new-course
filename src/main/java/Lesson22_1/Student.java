package Lesson22_1;

public class Student {

    private StringBuilder name;
    private int course;
    private int grade;

    public void setName(StringBuilder name){
        if (name.length() > 3) {
            this.name = name;
        } else {
            System.out.println("Длина должна превышать 3 символов!");
        }
    }

    public void setCourse(int course){
        if(course <= 4 && course >= 1) {
            this.course = course;
        } else {
            System.out.println("Курс должен быть в интервале 1-10.");
        }
    }

    public void setGrade(int grade) {
        if (grade <= 10 && grade >= 1) {
            this.grade = grade;
        } else {
            System.out.println("Оценка должна быть в интервале 1-4.");
        }
    }

    public void showInfo(){
        System.out.println("Имя: " + this.name + "\nКурс: " + this.course + "\nОценка: " + this.grade);
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName(new StringBuilder("John"));
        student1.setCourse(2);
        student1.setGrade(7);
        student1.showInfo();
    }
}