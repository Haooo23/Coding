package EserciziRecupero.Processore;

public class Buffer {
    
    private int value = -1;

    public synchronized void addValue(int value) {
        while(this.value > 0) {
            try {
                wait();
            } catch (Exception e) {} 
        }
        this.value = value;
        notifyAll();
    }

    public synchronized int getValue(Boolean isLess) {
        while(value < 0){
            try {
                wait();
            } catch (Exception e) {}
        }
        int savedValue = value;
        if(isLess){
            if(savedValue < 5){
                value = -1;
                notifyAll();
                return savedValue;
            }
        }else{
            if(savedValue > 5){
                value = -1;
                notifyAll();
                return savedValue;
            }
        }
        notifyAll();
        return -1;
    }
}