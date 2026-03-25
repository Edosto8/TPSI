package Parcheggio;

import java.util.Random;

public class Auto extends Thread {
    private Random rand;
    private ParkingLot parkingLot;
    private VehicleType type;


    public VehicleType getType() {
        return type;
    }

    public Auto(String name, ParkingLot parkingLot, VehicleType vehicleType) {
        System.out.println(type);

        setName(name);
        this.rand = new Random();
        this.parkingLot= parkingLot;
        this.type= vehicleType;

    }

    @Override
    public void run() {
        try {


            int drivetime = 2000 + rand.nextInt(3000);
            System.out.println(getName() + " sta guidando per " + drivetime / 1000 + " sec");
            sleep(drivetime);

            parkingLot.enter(this);
            int parkTime = 3000 + rand.nextInt(5001);
            sleep(parkTime);
            parkingLot.exit(this);
        } catch (InterruptedException e) {
            interrupt();
        }
    }
}