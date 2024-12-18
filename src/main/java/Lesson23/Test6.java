package Lesson23;

public class Test6 {

}

class Animal4 {
    String showName(){
        return "some animal";
    }

    void showInfo(){
        System.out.println("Name of info " + showName());
    }
}

class Mouse4 extends Animal4 {
    String showName(){
        return "mouse";
    }

    public static void main(String[] args) {
        Animal4 a = new Mouse4();
        a.showInfo();
    }
}