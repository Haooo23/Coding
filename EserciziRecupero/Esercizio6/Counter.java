package EserciziRecupero.Esercizio6;

public class Counter {
    private static final int MAX_COUNTER = 10;
    private int counter;
    public synchronized void increment(){
        while(counter >= MAX_COUNTER){
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        counter++;
        System.out.println(counter);
        notifyAll();
    }

    public synchronized void decrement(){
        while(counter <= 0){
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        counter--;
        System.out.println(counter);
        notifyAll();
    }
    
}