package CocaCola;

import java.util.Random;

public class Produttore extends Thread {
    private Storage buffer;
    
    public Produttore(Storage buffer){
        this.buffer = buffer;
    }

    @Override 
    public void run(){
        while(true){
            try {
                buffer.addLattina(new Coke());
                sleep(new Random().nextInt(250));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}