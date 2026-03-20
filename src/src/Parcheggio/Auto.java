package Parcheggio;

import java.util.Random;

public class Auto extends Thread {
    private Random rand;
    private ParkingLot parkingLot;

    public Auto() {
        this.rand = new Random();
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
        } catch (InterruptedException e) {
            interrupt();
        }
    }
}