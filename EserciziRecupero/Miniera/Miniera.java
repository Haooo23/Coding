package EserciziRecupero.Miniera;

import java.util.Vector;

public class Miniera {
    private static final int MAX_GEMME = 10;
    private Vector <Gemma> gemme = new Vector<>();

    public synchronized void aggiungiGemma(Gemma gemma){
        while(gemme.size() >= MAX_GEMME){
            try {
                wait();
            } catch (Exception e) {}
        }
        gemme.add(gemma);
        System.out.println("Gemma aggiunta: " + gemma + " " + gemme.size() + "/" + MAX_GEMME);
        notifyAll();
    }

    public synchronized void rimuoviGemma(){
        while(gemme.isEmpty()){
            try {
                wait();
            } catch (Exception e) {}
        }
        Gemma gemma = gemme.firstElement();
        gemme.remove(gemma);
        System.out.println("Gemma rimossa: " + gemma + " " + gemme.size() + "/" + MAX_GEMME);
        notifyAll();
    }






}
