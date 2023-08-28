package EserciziRecupero.Miniera;

import java.util.Random;

public class Produttore extends Thread {
    private Miniera miniera;

    public Produttore(Miniera miniera) {
        this.miniera = miniera;
    }
    
    @Override
    public void run(){
        while(true){
            try {
                miniera.aggiungiGemma(new Gemma());
                sleep(new Random().nextInt(250));
            } catch (Exception e) {

            }
        }
    }
}