package Lesson27_1;

public class Test16 {

    public static void main(String[] args) {
//        Test16.createPassword("qweqweqweqewqweqwe");

        Samolet samolet = new Samolet();
        samolet.waitPlan();
        samolet.flyPlan();
        samolet.cancelFly();
    }

    public static void createPassword(String pswrd) {
        if(pswrd.length() < 6) {
            throw new IllegalArgumentException("It must be over then 6 letters");
        }
        if(pswrd.length() > 12) {
            throw new IllegalArgumentException("It must be less then 12 letters");
        }
        System.out.println("Password was created successfully");
    }
}

class Samolet {
    String sostoyanie = "pending";

    public void flyPlan(){
        sostoyanie = "in air";
        System.out.println("Plan is flying");
    }

    public void waitPlan(){
        if(sostoyanie.equals("in air")) {
            throw new IllegalStateException("State is in air");
        }
        String sostoyanie = "pending";
        System.out.println("Is pending");
    }

    public void cancelFly(){
        if(sostoyanie.equals("in air")) {
            throw new IllegalStateException("State is in air");
        }
        sostoyanie = "cancel";
        System.out.println("Plan was canceled");
    }
}