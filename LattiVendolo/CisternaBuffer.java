package LattiVendolo;

public class CisternaBuffer {
    private static final int MAX_LATTE = 100;
    private int counterLatte = 0;
    public synchronized void addLatte(int latte){
        System.out.println(latte);
        while(counterLatte >= MAX_LATTE){
            try {
                wait();
            } catch (Exception e) {}
        }
        counterLatte+=latte;
        counterLatte = Math.min(counterLatte, MAX_LATTE);
        System.out.println("Latte aggiunto nella cisterna: " + latte + " " + "Latte rimasto: " + counterLatte + "/" + MAX_LATTE);
        notifyAll();
    }

    public synchronized int removeLatte(int latte){
        while(counterLatte <= 0){
            try {
                wait();
            } catch (Exception e) {}
            } 
            if(counterLatte >= latte){ 
                counterLatte -= latte;
                System.out.println("Latte rimosso dalla cisterna: " + latte + " " + "Latte rimasto: " + counterLatte + "/" + MAX_LATTE);
                notifyAll();
                return latte;
            }else{
                latte = counterLatte;
                counterLatte = 0;
                System.out.println("Cisterna vuota! ");
                notifyAll();
                return latte;
            }
    }
}
