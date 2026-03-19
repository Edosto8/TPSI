import java.util.ArrayList;

public class Stiva {
    private final int MAX ;
    private ArrayList<LootItem> stiva;

    public Stiva(int MAX) {
        this.stiva = new ArrayList<>();
        this.MAX = MAX;
    }
    public synchronized void depositoLoot(LootItem lootItem) throws InterruptedException {
        while(stiva.size()==MAX) {
            System.out.println(Thread.currentThread().getName()+ " in attesa (stivaSize" + stiva.size() + ")");
            wait();
        }
        stiva.add(lootItem);
        System.out.println(Thread.currentThread().getName()+ " ha aggiunto" +lootItem+ "(stivaSize" + stiva.size() + ")");
        notifyAll();
    }
    public synchronized LootItem getLootItem() throws InterruptedException {
        while(stiva.isEmpty()){
            wait();
        }
        LootItem toGetBack= stiva.remove(0);
        notifyAll();
        return toGetBack;
    }
}
