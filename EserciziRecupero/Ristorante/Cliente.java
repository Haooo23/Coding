package EserciziRecupero.Ristorante;

import java.util.Random;

public class Cliente extends Thread{
    private int clientId;
    private Ristorante ristorante;

    public Cliente(int clientId, Ristorante ristorante){
        this.clientId = clientId;
        this.ristorante = ristorante;
    }

    public void setPiatto(String piatto){
        System.out.println("Cliente: " + clientId + " ordinato il piatto: " + piatto);
        try {
            sleep(1000 + new Random().nextInt(3000));
        } catch (Exception e) {
            e.printStackTrace();
        }
        ristorante.esci(this);
    }

    public int getClientId() {
        return clientId;
    }

    @Override
    public void run(){
        try {
            sleep(500 + new Random().nextInt(1000));
            ristorante.entra(this);
            sleep(100 + new Random().nextInt(400));
            ristorante.ordine(this, new Random().nextInt(Ristorante.PIATTI.length));
            sleep(100 + new Random().nextInt(400));
            ristorante.esci(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
