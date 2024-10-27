package Lesson3;

public class Part1 {
    public static void main(String[] args) {
        int a = 5;
        int b = a * 2;
        int x = 1, y = 2, z = 3;
        int num1 = 11;
        int num2 = 3;
        int celayaChast = num1 / num2;
        int ostatok = num1 % num2;

        int num3= 5;
        int num4 = 3;
        int num5 = num3 - num4++;
        int num6 = num3 - ++num4;
        System.out.println(num5);
        System.out.println(num6);

        int num7 = 5;
        num7 = num7 + 3;
        num7 += 3;
        num7 -= 10;
        num7 *= 10;
        num7 /= 10;
        num7--;
        System.out.println(num7);

        int num8 = 5;
        int num9 = 5;
        num7 = num8 = num9 = 18; // присваивает значение с права
        long num10 = num9;
        System.out.println(num7);

        boolean b1 = 5 >= 4;
        boolean b2 = 5 == 5;
        boolean b3 = num7 < num6;
        boolean b4 = 5 != 6;
        System.out.println(b4);

        int account = -1000;
        boolean isEnough = account > 0;
        System.out.println(isEnough);


        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool3 = true;
        boolean boolRes = bool2 || bool1 && bool3; // если несколько логических операторов, то && оператор имеет высокий приоритет, также можно юзать скобки
        System.out.println(boolRes);

        boolean bool10 = true;
        boolean bool11 = false;
        System.out.println(!bool10);

        byte num20 = 10;
        byte num21 = 5;
        boolean boolNum20 = num20 > num21;
        boolean boolNum21 = ! (num20 > num21);
        System.out.println(!boolNum21);

        byte num22 = 5;
        byte num23 = 4;
        boolean boolNum22 = num22 > num23 || num22 < num23;
        boolean boolNum23 = num22 > num23 && ++num23==num22;
        System.out.println(boolNum23);

        byte num31 = 1;
        byte num32 = 2;
        boolean boolNum31 = num31 == 1 | num32 == 2; // здесь уже не работает short-circuit
        System.out.println(boolNum31);

        byte num41 = 10;
        byte num42 = 5;
        System.out.println(num41|num42);

        boolean bool20 = true;
        boolean bool21 = false;
        boolean bool22 = false;
        boolean boolRes20 = bool20 ^ bool21 ^ bool22;
        System.out.println(boolRes20);


        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20l;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;
        System.out.println(result);

        int home1 = 5;
        int home2 = 8;
        int resHome1 = home1-- - --home1 + ++home1 + home1++ + home1;
        int resHome2 = ++home2 - home2++ + ++home2 - --home2;
        System.out.println(resHome1);
        System.out.println(resHome2);
    }
}
