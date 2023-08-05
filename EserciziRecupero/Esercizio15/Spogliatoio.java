package EserciziRecupero.Esercizio15;

public class Spogliatoio {
    private static final int MAX_PERSONE_SPOGLIATOIO = 2;
    private int counter = 0;

    public synchronized void entraSpogliatoio(){
        try {
            while(counter >= MAX_PERSONE_SPOGLIATOIO){
                wait();
            }
            counter++;
        } catch (Exception e) { 
            e.printStackTrace();
        }
    }
    
    public synchronized void esciSpogliatoio(){
        counter--;
        notifyAll();
    }
}
