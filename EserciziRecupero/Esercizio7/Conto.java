package EserciziRecupero.Esercizio7;

public class Conto {
    public final int MAX_DENARO = 10000;
    private int denaro = MAX_DENARO;

    public synchronized void deposita(int denaro){
        while(this.denaro > 0){
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.denaro += denaro;
        System.out.println("\n----------------------------------------------\nSoldi depositati: " + denaro + " | Soldi nel conto: " + this.denaro + "\n----------------------------------------------------\n");
        notifyAll();
    }

    public synchronized void prelievo(int denaro){
        while(this.denaro <= 0){
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.denaro -= denaro;
        System.out.println("Soldi prelevati: " + denaro + " | Soldi nel conto: " + this.denaro);
        notifyAll();
    }
}
