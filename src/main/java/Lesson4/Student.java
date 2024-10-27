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
}

class StudentTest{

    public static void main(String[] args) {

        Student john = new Student();
        Student sam = new Student();
        Student alex = new Student();

        john.ticket = 23;
        sam.ticket = 45;
        alex.ticket = 51;

        john.name = "John";
        sam.name = "Sam";
        alex.name = "Alex";

        john.lastname = "Doe";
        sam.lastname = "Martine";
        alex.lastname = "White";

        john.course = 2;
        sam.course = 3;
        alex.course = 2;


        john.averageScoreMath = 5.7; john.averageScoreEconomic = 6.5; john.averageScoreForeignLanguage = 6.2;
        double johnsAverageScore = john.averageScoreOfClasses();
        System.out.println("\nИмя: " + john.name + "\nФамилия: " + john.lastname + "\nНомер билета: " + john.ticket + "\nГод обучение: " + john.course + "\nСредняя оценка: " + String.format("%.1f", johnsAverageScore));

        sam.averageScoreMath = 6.5; sam.averageScoreEconomic = 7.5; sam.averageScoreForeignLanguage = 7.0;
        double samAverageScore = sam.averageScoreOfClasses();
        System.out.println("\nИмя: " + sam.name + "\nФамилия: " + sam.lastname + "\nНомер билета: " + sam.ticket + "\nГод обучение: " + sam.course + "\nСредняя оценка: " + String.format("%.1f", samAverageScore));

        alex.averageScoreMath = 2.5; alex.averageScoreEconomic = 3.8; alex.averageScoreForeignLanguage = 3.9;
        double alexesAverageScore = alex.averageScoreOfClasses();
        System.out.println("\nИмя: " + alex.name + "\nФамилия: " + alex.lastname + "\nНомер билета: " + alex.ticket + "\nГод обучение: " + alex.course + "\nСредняя оценка: " + String.format("%.1f", alexesAverageScore));

    }
}
