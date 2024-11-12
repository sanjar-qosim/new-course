package Lesson9;

public class HomeWork1 {
    HomeWork1(){
        System.out.println("Object was created!");
    }
}

class HomeWork1Test {
    public static void main(String[] args) {
        HomeWork1 hw1 = new HomeWork1();
        HomeWork1 hw2 = new HomeWork1();
        HomeWork1 hw3 = new HomeWork1();
        HomeWork1 hw4 = new HomeWork1();
        HomeWork1 hw5 = new HomeWork1();
        HomeWork1 hw6 = new HomeWork1();
        HomeWork1 hw7 = new HomeWork1();
        HomeWork1 hw8 = new HomeWork1();

        hw2 = null;
        hw3 = null;
        hw4 = null;
        hw5 = null;
        hw6 = null;
        hw7 = null;

        System.out.println();

        System.out.println(hw1);
        System.out.println(hw2);
        System.out.println(hw3);
        System.out.println(hw4);
        System.out.println(hw5);
        System.out.println(hw6);
        System.out.println(hw7);
        System.out.println(hw8);

    }
}