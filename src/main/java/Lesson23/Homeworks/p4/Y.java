package Lesson23.Homeworks.p4;

import Lesson23.Homeworks.p3.*;

public class Y extends X {

    @Override
    public void abc(){
        System.out.println('Y');
    }

    public void def(){
        Y y = new Y();
        y.abc();
    }

    public void ghi(){
        X x = new Y();
//        x.abc();
    }

    public static void main(String[] args) {
        Y a = new Y();
        a.abc();
        a.def();
        a.ghi();
    }
}

// Compile error! Because X class on the other package