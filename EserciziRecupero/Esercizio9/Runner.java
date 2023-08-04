package EserciziRecupero.Esercizio9;

public class Runner extends Thread{

    private long start;

    @Override
    public void run() {
        try {
            start = System.currentTimeMillis();
            Thread.sleep(10000);
            long end = System.currentTimeMillis() - start;
            System.out.println("Tempo trascorso in sleep:" + end);
        } catch (Exception e) {
            System.out.println("Thread interrotto - tempo trascorso in sleep: " + ((System.currentTimeMillis() - start)/1000) + " seconds");
        }
    }
}
