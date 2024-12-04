package Lesson19;

public class Test5 {
    public static void main(String[] args) {
        String [] students = {"Petr", "Sasha"};
        String [] exams = {"Java", "html"};

        for (String i : students) {
            for (String j : exams) {
                System.out.println(i + " " + j);
            }
        }
    }
}
