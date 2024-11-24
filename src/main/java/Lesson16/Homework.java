package Lesson16;

public class Homework {

    private static final String YAHOO = "yahoo";

    private static final String GMAIL = "gmail";

    private static final String MAIL = "mail";

    public void sendEmail(String email){
        if (email.endsWith("@yahoo.com;")) {
            System.out.println(YAHOO);
        } else if (email.endsWith("@mail.ru;")) {
            System.out.println(GMAIL);
        } else if (email.endsWith("@gmail.com;")) {
            System.out.println(MAIL);
        } else {
            System.out.println("Введеная почта некорректная!");
        }
    }

    public static void main(String[] args) {
        Homework test = new Homework();
        test.sendEmail("ya@yahoo.com;");
        test.sendEmail("on.@mail.ru;");
        test.sendEmail("ona@gmail.com;");
    }
}
