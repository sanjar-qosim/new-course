package Lesson17;

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good day!!!");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb2);

        System.out.println(sb2.length());
        System.out.println(sb2.charAt(4));

        System.out.println(sb2.indexOf("o"));

        String s = sb2.substring(5);
        System.out.println(s);
        String s2 = sb2.substring(5, 8);
        System.out.println(s2);

        System.out.println(sb2.subSequence(5, 8));

        sb2.append(22);
        System.out.println(sb2);
        sb2.append(true);
        System.out.println(sb2);
        sb2.append(sb2);
        System.out.println(sb2);

        System.out.println(sb2.insert(4, 55));

        StringBuilder sb10 = new StringBuilder("Hello World!");
        sb10.delete(3, 6);
        System.out.println(sb10);

        StringBuilder sb11 = new StringBuilder("Hello World!");
        sb11.deleteCharAt(6);
        System.out.println(sb11);

        sb11.reverse();
        System.out.println(sb11);

        StringBuilder sb12 = new StringBuilder("Vsem privet");
        sb12.replace(0, 4, "Pete");
        System.out.println(sb12);

        System.out.println(sb12.capacity());
        System.out.println(sb1.capacity());
    }
}
