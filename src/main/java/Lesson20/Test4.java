package Lesson20;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("first");
        list1.add("second");
        list1.add("third");
        list1.add("fourth");
        list1.add("fifth");

        for (String s : list1) {
            System.out.print(s + " ");
        }
        System.out.println("");

        System.out.println(list1.indexOf("second"));
        System.out.println(list1.lastIndexOf("second"));
        System.out.println(list1.size());
        System.out.println(list1.toString());
    }
}
