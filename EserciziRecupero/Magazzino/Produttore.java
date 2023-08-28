package EserciziRecupero.Magazzino;

import java.util.Random;

public class Produttore extends Thread{
    private Fabbrica fabbrica;
    public Produttore(Fabbrica fabbrica) {
        this.fabbrica = fabbrica;
    }

    @Override
    public void run(){
        while(true){
            try {
                fabbrica.aggiungiProdotto(new Prodotto());     
                sleep(new Random().nextInt(500));
            } catch (Exception e) {}
        }
    }
}
