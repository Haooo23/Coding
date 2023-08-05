package EserciziRecupero.Esercizio4;

public class Main {
    public static void main(String[] args) {
        ChildThread childThread = new ChildThread();
        childThread.start();

        int numChecks = 0;

        while (childThread.isAlive()) {
            try {
                Thread.sleep(500);
                numChecks++;
                System.out.println("Padre: controlla se il thread figlio sia vivo... (Controllo: " + numChecks + ")");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Thread principale: Thread figlio finito il processo. Uscita...");
    }
}
