package Lesson24.Homework2;

public class Test {
    public static void main(String[] args) {
        Mechenosec test1 = new Mechenosec("test 1");
        System.out.println(test1.name);
        test1.eat();
        test1.sweam();
        test1.sleep();

        System.out.println();
        Animal test2 = new Mechenosec("String");
        System.out.println(test2.name);
        test2.eat();
        test2.sleep();

        System.out.println();
        Fish test3 = new Mechenosec("test 3");
        System.out.println(test3.name);
        test3.sweam();
        test3.eat();
        test3.sleep();
    }
}
