package CocaCola;

import java.util.Random;

public class Consumatore extends Thread {
    private Storage buffer;

    public Consumatore(Storage buffer){
        this.buffer = buffer;
    }

    @Override
    public void run(){
        while(true){
            try {
                buffer.removeLattina();
                sleep(new Random().nextInt(1000));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

