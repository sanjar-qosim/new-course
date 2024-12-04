package Lesson19;

public class Test2 {
    public static void sum(int... num){
        int result = 0;
        for (int i = 0;i < num.length; i++) {
            result += num[i];
        }
        System.out.println(result);
    }

    public static void abc(int [] ... array){

    }

    public static void main(String[] args) {
        sum(6454, 4654, 6546);
    }
}
