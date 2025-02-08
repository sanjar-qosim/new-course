package Lesson27_1.HomeWork;

public class Tiger {

    public void eat(String food){
        if (!food.equals("meat")) {
            throw new NotMeatException("The tiger doesn't eat " + food);
        }
        System.out.println("The tiger is eating " + food);
    }

    public void drink(String liquid) throws NotWaterException {
        if(!liquid.equals("water")) {
            throw new NotWaterException("The tiger doesn't drink " + liquid);
        }
        System.out.println("Tiger is drinking " + liquid);
    }
}
