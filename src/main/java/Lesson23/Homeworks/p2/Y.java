package Lesson23.Homeworks.p2;

import Lesson23.Homeworks.p1.*;

public class Y extends X {
    Y(){}
    public void abc(){
        System.out.println('Y');
    }

    public static void main(String[] args) {
        Y y = new Y();
        y.abc();
    }
}

// COMPILE ERROR, because the created constructor with a default modification