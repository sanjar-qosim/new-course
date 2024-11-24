package Lesson16;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");
        String s2 = new String("   abcdefgabcd  ");
        String s3 = new String("privet");

        String s10 = s1.substring(2, 5);
        System.out.println(s10);

        String s12 = s2.trim();
        System.out.println(s12);

        String s13 = s1.substring(2, 11);
        System.out.println(s13);

        String s14 = s3.replace('r', 'Z');
        System.out.println(s14);

        String s15 = s3.replace("vet", "vivka");
        System.out.println(s15);

        String s5 = "privet";
        String s6 = "drug";
        System.out.println(s5.concat(s6));


    }
}
