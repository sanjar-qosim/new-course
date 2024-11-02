package Lesson4;

public class Student {
    int ticket;
    String name;
    String lastname;
    byte course;
    double averageScoreMath;
    double averageScoreEconomic;
    double averageScoreForeignLanguage;

    Student(int ticket1, String name1, String lastname1, byte course1, double averageScoreMath1, double averageScoreEconomic1, double averageScoreForeignLanguage1){
        ticket = ticket1;
        name = name1;
        lastname = lastname1;
        course = course1;
        averageScoreMath = averageScoreMath1;
        averageScoreEconomic = averageScoreEconomic1;
        averageScoreForeignLanguage = averageScoreForeignLanguage1;
    }
    Student(int id1, String name1, String lastname1, byte course1){
        this(id1, name1, lastname1, course1, 0.0, 0.0, 0.0);
    }
    Student(){

    }

    double averageScoreOfClasses(){
        double sredOcenka = (averageScoreMath + averageScoreEconomic + averageScoreForeignLanguage) / 3;
        System.out.println("\nИмя: " + name + "\nФамилия: " + lastname + "\nНомер билета: " + ticket + "\nГод обучение: " + course + "\nСредняя оценка: " + String.format("%.1f", sredOcenka));
        return sredOcenka;
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
        student1.averageScoreOfClasses();

        student2.averageScoreMath = 6.5;
        student2.averageScoreEconomic = 7.5;
        student2.averageScoreForeignLanguage = 7.0;
        student2.averageScoreOfClasses();

        student3.averageScoreMath = 2.5;
        student3.averageScoreEconomic = 3.8;
        student3.averageScoreForeignLanguage = 3.9;
        student3.averageScoreOfClasses();


        Student newStudent1 = new Student(58, "Paul", "Johnson", (byte) 2, 5.5, 6.5, 7.5);
        Student newStudent2 = new Student(65, "Margarita", "Watson", (byte) 2);
        Student newStudent3 = new Student();

        newStudent1.averageScoreOfClasses();
        newStudent2.averageScoreOfClasses();
        newStudent3.averageScoreOfClasses();
    }
}
