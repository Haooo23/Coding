package Connessioni;

import java.time.LocalTime;

public class Connessione {
    private String richiesta;
    private int porta;
    private String ip;

    public Connessione(String richiesta, int porta, String ip){
        this.richiesta = richiesta;
        this.porta = porta;
        this.ip = ip;
    }

    public void elabora(){
        try {
            Thread.sleep((long)(10+Math.random()*300));
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("[" + LocalTime.now() + "] elaborato " + ip + " : " + porta + "/" + richiesta);
    }
}
