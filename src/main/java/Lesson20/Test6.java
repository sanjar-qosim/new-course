package Lesson20;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");

        ArrayList <StringBuilder> list1 = new ArrayList<>();

        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);

        ArrayList <StringBuilder> list2 = (ArrayList<StringBuilder>) list1.clone();

        System.out.println(list1 == list2);

        list1.get(0).append("!!!");
        System.out.println(list2.get(0));

        StringBuilder [] array = {sb1, sb2, sb3};
        List<StringBuilder> list8 = Arrays.asList(array);
        System.out.println(list8);

    }
}
