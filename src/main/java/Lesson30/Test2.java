package Lesson30;

import java.util.ArrayList;

public class Test2 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);

        int a = GenMethods.getSecondElement(arrayList);
        System.out.println(a);

    }
}

class GenMethods {

    public static <T> T getSecondElement(ArrayList<T> aL){
        return aL.get(1);
    }
}