package LattiVendolo;

import java.util.Random;

public class ProduttoreMucca extends Thread {
    private SecchioBuffer secchioBuffer;
    public ProduttoreMucca(SecchioBuffer secchioBuffer){
        this.secchioBuffer = secchioBuffer;
    }

    @Override
    public void run(){
        while(true){
            try {
                sleep(new Random().nextInt(500));
            } catch (Exception e) {}
            secchioBuffer.addLatte();
        }
    }
}
