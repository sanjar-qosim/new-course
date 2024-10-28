package Lesson4;

public class BankAccount {
    int id;
    String name;
    double balance;
    void popolnenieScheta(double summa){
        System.out.println("\nYour balance before processing: " + balance + ". Amount of adding: " + summa);
        balance += summa;
        System.out.println("Your actual balance is: " + balance + "\n");
    }
    void snyatieSoScheta(double summa){
        System.out.println("\nYour balance before processing: " + balance + ". Amount of withdrawal: " + summa);
        balance -= summa;
        System.out.println("Your actual balance is: " + balance + "\n");
    }
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        BankAccount yourAccount = new BankAccount();
        BankAccount hisAccount = new BankAccount();

        myAccount.id = 1;
        myAccount.name = "Sanjar";
        myAccount.balance = 12.35;

        System.out.println("ID of my account: " + myAccount.id);
        System.out.println();

        System.out.println(myAccount.balance);
        myAccount.snyatieSoScheta(1.5);
        myAccount.popolnenieScheta(5.5);

    }

}
