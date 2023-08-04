package EserciziRecupero.Esercizio12;

public class Museo {
    private static final int MAX_VISITATORE = 5;
    private int contatoreVisitatore = 0;

    public synchronized void entrataMuseo(){

        while(contatoreVisitatore >= MAX_VISITATORE){
            try {
                wait();
            } catch (Exception e) {
                
            }
        }
        contatoreVisitatore++;
        System.out.println("Visitatore entrato! - Visitatori attualmente all'interno: " + contatoreVisitatore); ;
    }

    public synchronized void uscitaMuseo(){
        contatoreVisitatore--;
        System.out.println("Visitatore uscito!");
        notifyAll();
    }
}
