package ex1;

public class Walking implements transportation{
    @Override
    public void getETA() {
        System.out.println("Calculating ETA by walking");
    }

    @Override
    public void getDirection() {
        System.out.println("Calculating direction by walking");
    }
}
