package EserciziRecupero.Esercizio4;

public class ChildThread extends Thread {

    private static final int n = 5;
    private static final int durationA = 1000; 

    @Override
    public void run() {
        System.out.println("Thread figlio: inizia attivita' A " + n + " volte.");

        for (int i = 1; i <= n; i++) {
            System.out.println("Thread figlio: esegue l'attivita' A " + i + " di " + n);
            doActivityA();
        }

        System.out.println("Thread figlio: concluso attivita' A.");
    }

    private void doActivityA() {
        try {
            Thread.sleep(durationA);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}