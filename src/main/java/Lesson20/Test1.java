package Lesson20;

import java.util.ArrayList;
import java.util.List;


public class Test1 {
    public static void main(String[] args) {
        ArrayList <String> list1 = new ArrayList<>();
        list1.add("first");
        list1.add("second");
        System.out.println(list1);

        Car car = new Car();
        List <Car> list2 = new ArrayList();
        list2.add(car);
    }
}

class Student {}

class Car {}