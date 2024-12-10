package Lesson22_1;

import Lesson22.Test1;
// инкапсуляция1

public class Test2 {
    public static void main(String[] args) {
        Test1 test1 = new Test1("Male");
        test1.setAge(22);
        System.out.println(test1.getAge());
    }
}
