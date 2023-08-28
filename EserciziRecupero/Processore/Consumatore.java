package EserciziRecupero.Processore;

import java.util.Random;

public class Consumatore extends Thread {
    private Buffer buffer;
    public Consumatore(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep(new Random().nextInt(250));  
                int value = buffer.getValue(true); //minori
                if(value > 0){
                    System.out.println("Valore(MINORE): " + value );
                }
            } catch (Exception e) {
            }
        }
    }
}
