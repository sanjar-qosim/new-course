package Lesson6;

public class MethodOverloading2 {
    public int sum(int i1, int i2){
        return i1 + i2;
    }
    protected String sum(String s1, String s2){
        return s1 + s2;
    }
//    COMPILE ERROR! because parameters are same
//    protected void sum(int a, int b){
//        System.out.println("PRIVET");
//    }

}

class MethodOverloading2Test {
    public static void main(String[] args) {
        MethodOverloading2 mO = new MethodOverloading2();
        int a = mO.sum(55, 55);
        System.out.println(a);
        String s = mO.sum("Privet", " moy drug!");
        System.out.println(s);
    }
}