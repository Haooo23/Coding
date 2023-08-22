package Magazzino;

import java.util.Random;

public class Consumatore extends Thread{
    private Fabbrica fabbrica;
    public Consumatore(Fabbrica fabbrica) {
        this.fabbrica = fabbrica;
    }

    @Override
    public void run(){
        while(true){
            try {
                fabbrica.rimuoviProdotto();
                sleep(new Random().nextInt(1000));
            } catch (Exception e) {}
        }
    }
}
