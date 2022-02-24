package ex1;

public class Cycling implements transportation{
    @Override
    public void getETA() {
        System.out.println("Calculating ETA by cycling");
    }

    @Override
    public void getDirection() {
        System.out.println("Calculating direction by cycling");
    }
}
