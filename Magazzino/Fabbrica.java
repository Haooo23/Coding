package Magazzino;

import java.util.Vector;

public class Fabbrica {

    private Vector <Prodotto> prodotti = new Vector<Prodotto>();
    private static final int MAX_PRODOTTI = 100;

    public synchronized void aggiungiProdotto(Prodotto prodotto){
        while(prodotti.size() >= MAX_PRODOTTI){
            try {
                wait(); 
            } catch (Exception e) {}
        }
        prodotti.add(prodotto);
        notifyAll();
        System.out.println("Prodotto aggiunto: " + prodotto);
    }

    public synchronized void rimuoviProdotto(){
        while(prodotti.isEmpty()){
            try {
                wait();           
            } catch (Exception e) {}
        }
        Prodotto prodotto = prodotti.firstElement();
        prodotti.remove(prodotto);
        notifyAll();
        System.out.println("Prodotto rimosso! " + prodotto);
    }
}
