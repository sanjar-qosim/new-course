package Lesson16;

public class Test9 {
    public static void main(String[] args) {
        String s1 = new String("ok");
        String s2 = new String("ok");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println();

        String s3 = "Hi";
        String s4 = "Hi";
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println(s1 != s4);

        System.out.println();

        String s10 = "How are you?";
        String s11 = "hor are you?";
        System.out.println(s10.equals(s11));
        System.out.println(s10.equalsIgnoreCase(s11));
    }
}
