package EserciziRecupero.Esercizio8;

public class CokeMachine {
    private static final int N = 50;
    private int count = N;

    public synchronized void deposit(){
        while(count > 0){
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        count = N;
        System.out.println("⚠ Si segnala che la macchinetta e' vuota! ⚠");
        System.out.println("Macchinetta riempita");
        notifyAll();
    }

    public synchronized void remove(){
        while(count == 0){
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        count--;
        System.out.println("Lattina venduta! Lattine rimaste: " + count);
        notifyAll();
    }
}