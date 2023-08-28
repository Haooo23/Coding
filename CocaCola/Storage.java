package CocaCola;

import java.util.Vector;

public class Storage {
    private static final int MAX_LATTINE = 10000;
    private Vector<Coke> coca = new Vector<>();

    public synchronized void addLattina(Coke coke){
        while(coca.size() >= MAX_LATTINE){
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }   
        }
        coca.add(coke);
        notifyAll();
        System.out.println("LATTINA AGGIUNTA");
    }   

    public synchronized void removeLattina(){
        while(coca.isEmpty()){
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Coke coke = coca.firstElement();
        coca.remove(coke);
        System.out.println("LATTINA RIMOSSA");
        notifyAll();
    }
}

