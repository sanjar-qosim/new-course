package Lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework {
    public static Object abc(String ... st){
        ArrayList<String> list = new ArrayList<>(Arrays.asList(st));
        Collections.sort(list);

        ArrayList<String> list2 = new ArrayList<>();
        for (String tmp : list) {
            if (!list2.contains(tmp)) {
                list2.add(tmp);
            }
        }

        return list2;
    }

    public static void main(String[] args) {
        System.out.println(abc("first", "second", "third", "first", "  ", "", "Third", "second", "third"));

    }
}
