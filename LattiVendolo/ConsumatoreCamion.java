package LattiVendolo;

import java.util.Random;

public class ConsumatoreCamion extends Thread {
    private CisternaBuffer cisternaBuffer;

    public ConsumatoreCamion(CisternaBuffer cisternaBuffer){
        this.cisternaBuffer = cisternaBuffer;
    }

    @Override 
    public void run(){
        while(true){
            try {
                sleep(new Random().nextInt(1000));
            } catch (Exception e) {}
            cisternaBuffer.removeLatte(new Random().nextInt(20));
        }
    }
}
