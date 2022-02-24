package ex1;

public class Driving implements transportation{


    @Override
    public void getETA() {
        System.out.println("Calculating ETA by driving");
    }

    @Override
    public void getDirection() {
        System.out.println("Calculating Direction by driving");

    }
}
