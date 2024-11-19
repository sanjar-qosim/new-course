package Lesson15;

public class Test7 {
    public static void main(String[] args) {
        int money = 100;

        do {
            System.out.println("Your money: " + money);
            money -= 10;
        } while (money > 50);

        System.out.println("You don't have money!");
    }
}
