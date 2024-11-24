package Lesson16;

import java.util.Locale;

public class Test6 {
    public static void main(String[] args) {
        String s = "PriVET:2";
        String s2 = s.toLowerCase(Locale.ROOT);
        System.out.println(s2);

        String s3 = s.toUpperCase();
        System.out.println(s3);

        boolean b1 = s.contains(":2");
        System.out.println(b1);

    }
}
