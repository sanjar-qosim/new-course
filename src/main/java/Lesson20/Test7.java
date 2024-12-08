package Lesson20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test7 {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";

        ArrayList <String> list1 = new ArrayList<>();

        list1.add(s3);
        list1.add(s1);
        list1.add(s2);

        System.out.println(list1);

        Collections.sort(list1);
        System.out.println(list1);

        ArrayList <String> list2 = new ArrayList<>();
        list2.add(s1);
        list2.add(s2);
        list2.add(s3);

        System.out.println();

        Iterator <String> it = list2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
