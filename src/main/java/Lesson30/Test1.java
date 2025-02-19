package Lesson30;


public class Test1 {

    public static void main(String[] args) {
        Info <String> info1 = new Info<>("privet");
        System.out.println(info1);
    }
}

class Info<T>{
    private T value;

    public Info(T value){
        this.value = value;
    }

    @Override
    public String toString(){
        return "[{" + value + "}]";
    }
}
