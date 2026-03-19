public class Pirati extends Thread {
    private Stiva stiva;
    public Pirati(Stiva stiva, String name) {
        setName(name);
        this.stiva = stiva;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try{
                stiva.depositoLoot(new LootItem("LootItem" +(i+1), 120));

            }catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }

    }
}
