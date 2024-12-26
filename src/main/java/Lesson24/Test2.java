package Lesson24;

public class Test2 {
    public static void main(String[] args) {
        Figura f = new Kvadrat();
        System.out.println(f.kolvoStoron);
        f.ploshad();
    }
}

abstract  class Figura {

//    Figura(int kolvoStoron){
//        this.kolvoStoron = kolvoStoron;
//    }

    int kolvoStoron = 0;

    abstract void perimeter();

    abstract void ploshad();

    void showInfo(){
        System.out.println("This is figura");
    }
}

class Kvadrat extends Figura {


    int kolvoStoron = 4;

    @Override
    public void perimeter(){
        int storona1 = 10;
        System.out.println("Perimeter is: " + 4 * storona1);
    }

    @Override
    public void ploshad(){
        int storona1 = 10;
        System.out.println("Ploshad is: " + storona1 * storona1);
    }
}

class Pryamougolnik extends Figura {
    int kolvoStoron = 4;
    int storona1 = 0;
    int storona2 = 5;

    @Override
    public void perimeter(){
        System.out.println("Perimeter is: " + 2 * (storona1 + storona2));
    }

    @Override
    public void ploshad(){
        int storona1 = 10;
        System.out.println("Ploshad is: " + storona1 * storona2);
    }
}

class Okrujnost extends Figura {
    int kolvoStoron = 0;
    int raduis = 0;

    @Override
    public void perimeter(){
        System.out.println("Perimeter is: " + 2 * 3.14 * raduis);
    }

    @Override
    public void ploshad(){
        int storona1 = 10;
        System.out.println("Ploshad is: " + 3.14 * raduis * raduis);
    }
}

abstract class Chetirexugolnik extends Figura {
    void def(){
        System.out.println("Eto chetiroxugolnik");
    }
}
