package LattiVendolo;

public class SecchioBuffer {
    private static final int MAX_LATTE = 15;
    private int counterLatteSecchio = 0;
    private CisternaBuffer cisternaBuffer;

    public SecchioBuffer(CisternaBuffer cisternaBuffer){
        this.cisternaBuffer = cisternaBuffer;
    }

    public synchronized void addLatte(){
        while(counterLatteSecchio >= MAX_LATTE){
            try {
                wait();
            } catch (Exception e) {}
        }
        counterLatteSecchio++;
        System.out.println("Latte aggiunto al secchio latte rimasto: " + counterLatteSecchio + "/" + MAX_LATTE);
        notifyAll();
    }

    public synchronized void removeLatte(){
        while(counterLatteSecchio <= 0){
            try {
                wait();
            } catch (Exception e) {}
        }
        cisternaBuffer.addLatte(counterLatteSecchio);
        counterLatteSecchio = 0;
        System.out.println("Latte rimosso al secchio latte rimasto: " + counterLatteSecchio + "/" + MAX_LATTE);
        notifyAll();
    }
}
