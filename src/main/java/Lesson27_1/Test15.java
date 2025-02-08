package Lesson27_1;

public class Test15 {

    void marafon(int tempVozduxa, int tempBega) throws PodvergnutNoguException {
        if (tempBega > 12) {
            throw new PodvergnutNoguException("Temp bega slishkom visokiy: " + tempBega);
        }

        if (tempVozduxa > 32) {
            throw new SveloNoguException();
        }

        System.out.println("Run was success");
    }

    public static void main(String[] args) {
        Test15 test15 = new Test15();

        try {
            test15.marafon(20, 13);
        } catch (PodvergnutNoguException | SveloNoguException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("You will get a medal");
        }
    }
}

class PodvergnutNoguException extends Exception {

    PodvergnutNoguException(String message) {
        super(message);
    }

    PodvergnutNoguException(){}
}

class SveloNoguException extends RuntimeException {
    SveloNoguException(String message) {
        super(message);
    }

    SveloNoguException(){}
}