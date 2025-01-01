package Lesson24.Homework;

public class Bird {

    protected String name;

    Bird(String name){
        this.name = name;
    }

    protected void eat(){
        System.out.println("Bird eats");
    }

    protected void sleep(){
        System.out.println("Bird sleeps");
    }

    protected void fly(){
        System.out.println("Bird flies");
    }

    protected void speak(){
        System.out.println("Bird can sings");
    }
}
