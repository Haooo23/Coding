package EserciziRecupero.Esercizio11;

import java.util.Random;

public class Persone extends Thread{
    private Telescopio telescopio;
    private int idpersona;
    private  String status;

    public Persone(int idpersona, Telescopio telescopio){
        this.idpersona = idpersona;
        this.telescopio = telescopio;
        this.status = "attesa";
    }

    @Override
    public void run(){

        try {
            telescopio.entra(this);
            sleep(500 + new Random().nextInt(500));
            telescopio.esci();    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getStatus() {
        return status;
    }

    public int getIdpersona() {
        return idpersona;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

}
