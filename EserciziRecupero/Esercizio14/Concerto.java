package EserciziRecupero.Esercizio14;

public class Concerto {
    private static final int NUM_BUYERS = 200;

    public static void main(String[] args) {
        for (int i = 1; i <= NUM_BUYERS; i++) {
            Thread buyerThread = new Thread(new Buyer());
            buyerThread.start();
        }
    }
}