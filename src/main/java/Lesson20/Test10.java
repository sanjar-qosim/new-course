package Lesson20;

import java.util.HashMap;
import java.util.Map;

public class Test10 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(777, "Ivanov Sasha");
        map.put(778, "Tregulov Zaur");
        map.put(779, "Sidorova Lilya");

        System.out.println(map);
    }
}
