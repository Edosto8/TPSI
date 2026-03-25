package Parcheggio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ParkingLot p = new ParkingLot(6);
        VehicleType type = VehicleType.CAMION;
        List<Auto> autos = new ArrayList<>();
        final int max_Auto0 = 10;
        VehicleType[] types= VehicleType.values();
        final Random r = new Random();

        for (int i = 0; i < max_Auto0; i++) {
            int index = r.nextInt(0, types.length);
            autos.add(new Auto("Auto" + (i+1), p, types[index]));



        }
        for (Auto a : autos) a.start();
        for (Auto a : autos) a.join();
        System.out.println("FINE");
    }
}
