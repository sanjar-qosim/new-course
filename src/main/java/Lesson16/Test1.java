package Lesson16;

public class Test1 {
    public static void main(String[] args) {
        String s1 = new String("privet");
        String s2 = new String("abcdefgabcd");

        int a = s1.length();
        System.out.println(a);

        char c1 = s1.charAt(0);
        System.out.println(c1);

        int c2 = s1.indexOf('p');
        System.out.println(c2);

        int st1 = s1.indexOf("vet");
        System.out.println(st1);

        int i4 = s2.indexOf('a', 5);
        System.out.println(i4);

        int i5 = s2.indexOf("c", 5);
        System.out.println(i5);

        boolean b1 = s2.startsWith("abc");
        System.out.println(b1);

        boolean b2 = s2.startsWith("abc", 7);
        System.out.println(b2);

        boolean b3 = s2.endsWith("bcd");
        System.out.println(b3);



    }
}
