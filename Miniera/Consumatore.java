package Miniera;

import java.util.Random;

public class Consumatore extends Thread{
    private Miniera miniera;

    public Consumatore(Miniera miniera){
        this.miniera = miniera;
    }

    @Override
    public void run(){
        while(true){
            try {
                miniera.rimuoviGemma();
                sleep(new Random().nextInt(1000));
            } catch (Exception e) {

            }
        }
    }
}
