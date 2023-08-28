package EserciziRecupero.Esercizio6;

import java.util.Random;

public class Figlio extends Thread {
    private Counter counter;
    private int type;

    public Figlio(Counter counter){
        this.counter = counter;
        this.type = new Random().nextInt();
    }

    public Figlio(Counter counter, int type){
        this.counter = counter;
        this.type = type;
    }

    @Override

    public void run(){
        while(true){
            try {
                if(type > 0) {
                    counter.increment();
                } else {
                    counter.decrement();
                }
                sleep(500 + new Random().nextInt(500));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
