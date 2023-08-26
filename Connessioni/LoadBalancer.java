package Connessioni;

import java.util.Vector;

public class LoadBalancer {
    private static final int MAX_CONNESSIONI = 30;
    private Vector <Connessione> connessioni;

    public LoadBalancer(){
        this.connessioni = new Vector<>();
    }

    public synchronized boolean connect(String richiesta, int porta , String ip){
        if(connessioni.size()>= MAX_CONNESSIONI){
            return false;
        }
        connessioni.add(new Connessione(richiesta, porta, ip));
        notifyAll();
        return true;
    }

    public synchronized Connessione gestisci_Richiesta(){
        while(connessioni.isEmpty()){
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        Connessione connessionetmp = connessioni.firstElement();
        connessioni.remove(connessionetmp);
        notifyAll();
        return connessionetmp;
    }

}
