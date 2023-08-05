package EserciziRecupero.Esericizio13;

import java.util.Random;

public class Bevitore extends Thread{
    private Botte botte;
    public Bevitore(Botte botte) {
        this.botte = botte;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(2000 + new Random().nextInt(3000));
            botte.bere();
            Thread.sleep(500 + new Random().nextInt(2500));
            botte.finitoBere();
        } catch (Exception e) {

        }
    }
}