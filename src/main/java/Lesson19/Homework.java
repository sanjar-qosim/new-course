package Lesson19;

public class Homework {
    public static void abc(String ... n){
        String [] el = new String[n.length];
        for (int i = 0; i < n.length; i ++) {
            el[i] = n[i];
        }
        for (String i : el) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        abc(args);
    }
}
