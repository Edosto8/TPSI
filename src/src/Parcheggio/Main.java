package Parcheggio;

public class Main {
    public static void main(String[] args) {
        ParkingLot p = new ParkingLot(6);
        VehicleType type = VehicleType.CAMION;
        Auto auto = new Auto("cio", p, type);
    }
}
