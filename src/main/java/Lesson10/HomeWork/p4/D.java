package Lesson10.HomeWork.p4;

import static Lesson10.HomeWork.p1.p2.B.*;
import Lesson10.HomeWork.p1.A;
import Lesson10.HomeWork.p1.p2.p3.C;
import Lesson10.HomeWork.p4.p5.E;
import Lesson10.HomeWork.p1.p2.B;

public class D {
    String name = "Class D";
    public static void main(String[] args) {
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        B t60 = new B();
        t60.info();

        D t1 = new D();
        System.out.println(t1.name);

        A t2 = new A();
        System.out.println(t2.name);

        C t3 = new C();
        System.out.println(t3.name);

        E t4 = new E();
        System.out.println(t4.name);

        System.out.println();

        Lesson10.HomeWork.p1.A t11 = new Lesson10.HomeWork.p1.A();
        System.out.println(t11.name);

        Lesson10.HomeWork.p1.p2.B t22 = new Lesson10.HomeWork.p1.p2.B();
        t22.info();

        Lesson10.HomeWork.p1.p2.p3.C t33 = new Lesson10.HomeWork.p1.p2.p3.C();
        System.out.println(t33.name);

        Lesson10.HomeWork.p4.p5.E t44 = new Lesson10.HomeWork.p4.p5.E();
        System.out.println(t44.name);

    }
}
