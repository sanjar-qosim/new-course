package Lesson22;

public class Test1 {
// инкапсуляция1

    final String sex;
    private String name;
    private boolean clever;
    private int age;

    public Test1(String sex){
        this.sex = sex;
    }

    public boolean isClever(){
        return clever;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid data");
        }
    }


}
