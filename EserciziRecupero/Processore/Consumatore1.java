package EserciziRecupero.Processore;

import java.util.Random;

public class Consumatore1 extends Thread {
    private Buffer buffer;
    public Consumatore1(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep(new Random().nextInt(250));  
                int value = buffer.getValue(false); //maggiori
                if(value > 0){
                    System.out.println("Valore(MAGGIORE): " + value );
                }
            } catch (Exception e) {
            }
        }
    }
}
