package ex1;

public class Transit implements transportation{
    @Override
    public void getETA() {
        System.out.println("Calculating ETA by transit");
    }

    @Override
    public void getDirection() {
        System.out.println("Calculating direction by transit");
    }
}
