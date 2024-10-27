package Lesson5;

public class Test1 {

    Test1(){}

    int summa(int a, int b, int c){
        int result = a + b +c;
        return  result;
    }

    int averageArifm(int a1, int b1, int c1){
        int result2 = summa(a1, b1, c1) / 3;
        return result2;
    }

}

class Test2{
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        int summa3 = t1.summa(1, 2, 3);
        System.out.println(summa3);
        System.out.println(t1.summa(5, 10, 15));

        int summa4 = t1.averageArifm(4, 5, 1);
        System.out.println(summa4);

    }
}
