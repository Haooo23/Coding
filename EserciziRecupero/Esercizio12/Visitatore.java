package EserciziRecupero.Esercizio12;

import java.util.Random;

public class Visitatore extends Thread{
    private Museo museo;
    public Visitatore(Museo museo) {
        this.museo = museo;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000 + new Random().nextInt(3000));
            museo.entrataMuseo();
            Thread.sleep(500 + new Random().nextInt(2500));
            museo.uscitaMuseo();
        } catch (Exception e) {

        }
    }
}
