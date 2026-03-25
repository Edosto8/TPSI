package Parcheggio;

public class ParkingLot {
    private int availableSlots;
    private final int MAX;
    public ParkingLot (int initialSlots) {
       this.MAX= initialSlots;
        this.availableSlots= MAX;



    }
    public synchronized void enter (Auto auto) throws InterruptedException {
        while (availableSlots< auto.getType().getPostiOccupati()) {
            System.out.println( auto.getName()+"in attesa (parcheggio pieno)");
            wait();
        }
        availableSlots-=auto.getType().getPostiOccupati();
        System.out.println(auto.getName()+ " entrata. Posti disponibili " + availableSlots);
    }
    public synchronized void exit(Auto auto) {
        availableSlots+=auto.getType().getPostiOccupati();
        System.out.println(auto.getName() + " uscita. posti disponibili " + availableSlots);
        notifyAll();
    }
}
