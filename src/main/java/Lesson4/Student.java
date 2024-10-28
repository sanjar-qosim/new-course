package Lesson4;

public class Student {
    int ticket;
    String name;
    String lastname;
    byte course;
    double averageScoreMath;
    double averageScoreEconomic;
    double averageScoreForeignLanguage;

    double averageScoreOfClasses(){
        return (averageScoreMath + averageScoreEconomic + averageScoreForeignLanguage) / 3;
    }

    void info(){
        System.out.println("\nИмя: " + name + "\nФамилия: " + lastname + "\nНомер билета: " + ticket + "\nГод обучение: " + course + "\nСредняя оценка: " + String.format("%.1f", averageScoreOfClasses()));
    }
}

class StudentTest{

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.ticket = 23;
        student2.ticket = 45;
        student3.ticket = 51;

        student1.name = "John";
        student2.name = "Sam";
        student3.name = "Alex";

        student1.lastname = "Doe";
        student2.lastname = "Martine";
        student3.lastname = "White";

        student1.course = 2;
        student2.course = 3;
        student3.course = 2;


        student1.averageScoreMath = 5.7;
        student1.averageScoreEconomic = 6.5;
        student1.averageScoreForeignLanguage = 6.2;
        student1.info();

        student2.averageScoreMath = 6.5;
        student2.averageScoreEconomic = 7.5;
        student2.averageScoreForeignLanguage = 7.0;
        student2.info();

        student3.averageScoreMath = 2.5;
        student3.averageScoreEconomic = 3.8;
        student3.averageScoreForeignLanguage = 3.9;
        student3.info();
    }
}
