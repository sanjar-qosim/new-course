package Lesson20;

import java.util.ArrayList;
import java.util.List;

public class Test9 {
    public static void main(String[] args) {
        ArrayList <String> l1 = new ArrayList<>();
        l1.add("one");
        l1.add("two");
        l1.add("three");
        l1.add("four");
        l1.add("five");
        System.out.println("l1: " + l1);

        ArrayList <String> l2 = new ArrayList<>();
        l2.add("one");
        l2.add("three");
        l2.add("four");
        l1.removeAll(l2);
        System.out.println("l1: " + l1);

        boolean res1 = l1.containsAll(l2);
        System.out.println(res1);


    }
}
