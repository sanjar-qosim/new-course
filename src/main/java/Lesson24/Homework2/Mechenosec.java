package Lesson24.Homework2;

public class Mechenosec extends Fish {

    Mechenosec(String name){
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Mechenosec is not a predator fish and it eats same food");
    }

    @Override
    void sweam() {
        System.out.println("Mechenosec is a beautiful fish, which fast sweam");
    }
}
