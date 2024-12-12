package Lesson22_1;

public class Cat extends Pet {
    Cat(String name){
        super.name = name;
        System.out.println("I am cat and my name is " + super.name);
    }

    public void sleep(){
        System.out.println("Cat sleeps");
    }
}
