package Lesson24.Homework;

public class Lesson24 {
    public static void main(String[] args) {
        Mechenosec mechenosec = new Mechenosec("test1");
        System.out.println(mechenosec.name);
        mechenosec.showInfo();

        System.out.println();
        Speakable speakable = new Penguin("Test 2");
//        speakable.eat();
//        speakable.fly();
//        speakable.sleep();
        speakable.speak();

        System.out.println();

        Animal lion = new Lion("Test 3");
        lion.eat();

        System.out.println();

        Mammal lion2 = new Lion("Test 4");
        System.out.println(lion2.name);
        lion2.eat();
        lion2.sleep();
        lion2.run();
    }
}

class Mechenosec {

    Mechenosec(String name){
        this.name = name;
    }

    String name;

    void showInfo(){
        System.out.println("This is a Mechenosec class");
    }
}

interface Speakable {
    void speak();
}

interface Animal {
    void eat();
}