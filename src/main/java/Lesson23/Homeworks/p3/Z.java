package Lesson23.Homeworks.p3;

public class Z extends X {
    @Override
    public void abc(){
        System.out.println('Z');
    }

    public void def(){
        Z z = new Z();
        z.abc();
    }

    public void ghi(){
        X x = new Z();
        x.abc();
    }

    public static void main(String[] args) {
        Z a = new Z();
        a.abc();
        a.def();
        a.ghi();
    }
}
