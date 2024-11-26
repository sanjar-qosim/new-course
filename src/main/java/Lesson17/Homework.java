package Lesson17;

public class Homework {

    public boolean raven1(StringBuilder x, StringBuilder y){
        if (x.length() != y.length()) {
            return false;
        }
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != y.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean raven2(StringBuilder x, StringBuilder y){
        if (x.toString().equals(y.toString())) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Homework test = new Homework();

        StringBuilder name1 = new StringBuilder("Sanjar");
        StringBuilder name2 = new StringBuilder("Sanj");
        StringBuilder name3 = new StringBuilder(" Sanjar");
        StringBuilder name4 = new StringBuilder("Sanjar ");
        StringBuilder space = new StringBuilder(" ");
        StringBuilder name0 = new StringBuilder("Sanjar");

        System.out.println(test.raven1(name1, name2));
        System.out.println(test.raven2(name1, name2));
        System.out.println();

        System.out.println(test.raven1(name3, name4));
        System.out.println(test.raven2(name3, name4));
        System.out.println();

        System.out.println(test.raven1(name0, name1));
        System.out.println(test.raven2(name1, name0));
        System.out.println();

        System.out.println(test.raven1(space, name3));
        System.out.println(test.raven2(name4, space));
    }
}
