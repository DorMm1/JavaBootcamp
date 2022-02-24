package ex1;

import java.util.ArrayList;

public class ex1main {
    public static void main(String[] args) {
        ArrayList<transportation> typesOfTransportation = new ArrayList<>();
        typesOfTransportation.add(new Cycling());
        typesOfTransportation.add(new Driving());
        typesOfTransportation.add(new Walking());
        typesOfTransportation.add(new Transit());

        for(transportation t: typesOfTransportation){
            t.getDirection();
            t.getETA();
            System.out.println("=============================");
        }
    }

}
