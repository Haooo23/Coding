package EserciziRecupero.Esercizio15;

public class Pista {
    private static final int MAX_GOKART = 4;
    private int counter = 0;

    public synchronized void entraPista(){
        try {
            while(counter >= MAX_GOKART){
                wait();
            }
            counter++;
        } catch (Exception e) {}    
    }

    public synchronized void esciPista(){
        counter--;
        notifyAll();
    }
}
