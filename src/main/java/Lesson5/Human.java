package Lesson5;

public class Human {
    String name;
    Car3 car;
    BankAccount bA;

    void info(){
        System.out.println("Name: " + name + "\nColor of car: " + car.color + "\nBalance of bill: " + bA.balance);
    }

}

class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "David";
        h.car = new Car3("red", "V8");
        h.bA = new BankAccount(18, 200.5);
        h.info();
        h.bA.popolneniaScheta(4.5);
        h.info();
        h.bA.snyatieSoScheta(5.0);
        h.info();
    }
}

class Car3{
    String color;
    String engine;
    Car3(String c, String e){
        color = c;
        engine = e;
    }
}

class BankAccount {
    int id;
    double balance;
    BankAccount(int id2, double balance2){
        id = id2;
        balance = balance2;
    }
    double popolneniaScheta(double a){
        return balance += a;
    }
    double snyatieSoScheta(double a){
        return balance -= a;
    }
}