package EserciziRecupero.Esercizio8;

import java.util.Random;

public class Utente extends Thread {
    private CokeMachine cokemachine;

    public Utente(CokeMachine cokemachine){
        this.cokemachine = cokemachine;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep(500 + new Random().nextInt(1000));
            } catch (Exception e) {
                e.printStackTrace();
            }
            cokemachine.remove();
        }
    }
}
