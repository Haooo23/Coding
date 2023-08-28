package EserciziRecupero.Processore;

import java.util.Random;

public class Produttore extends Thread {

    private Buffer buffer;

    public Produttore(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run(){
        while(true){
            try {
                sleep(new  Random().nextInt(500));
            } catch (Exception e) {
            }
            buffer.addValue(1 + new Random().nextInt(10));
        }
    }
}