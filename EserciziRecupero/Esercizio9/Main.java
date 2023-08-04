package EserciziRecupero.Esercizio9;

public class Main {
    public static void main(String[] args) {
        Runner thread = new Runner();
        thread.start();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {

        }
        thread.interrupt();
    }
}
