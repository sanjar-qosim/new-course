package Lesson26;

import java.util.ArrayList;
import java.util.Locale;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(5);

        int a = list.get(0);
        System.out.println(a);

        Integer b = 2;
        int c = b;

        String s1 = "50";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1);

        String s2 = "true";
        boolean b1 = Boolean.parseBoolean(s2);
        System.out.println(b1);

        Integer i3 = Integer.valueOf(10);
        System.out.println(i3);
    }
}
