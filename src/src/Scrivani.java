public class Scrivani extends Thread {
    private Stiva s;
    public Scrivani (String name, Stiva stiva) {
        super(name);
        this.s= stiva;

    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

        }

    }
}
