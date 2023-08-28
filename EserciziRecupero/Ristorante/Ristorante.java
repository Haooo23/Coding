package EserciziRecupero.Ristorante;

import java.util.Vector;

public class Ristorante {
    private static final int MAX_CLIENTI = 100;
    private Vector<Cliente> clienti = new Vector<>();

	public static final  String PIATTI[] = {"caccio e pepe", "ragu", "pesto", "lasagne", "ricotta"};

    public synchronized void entra(Cliente cliente){
        while(clienti.size() >= MAX_CLIENTI){
            try {
                wait();
            } catch (Exception e) {
				e.printStackTrace();
            }
        }
        clienti.add(cliente);
        System.out.println("Cliente entrato: " + cliente.getClientId());
		notifyAll();
    }

    public void ordine(Cliente cliente, int idPiatto){
        cliente.setPiatto(PIATTI[idPiatto]);
    }

    public synchronized void esci(Cliente cliente){
        while(clienti.isEmpty()){
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        clienti.remove(cliente);
        System.out.println("Cliente uscito: " + cliente.getClientId());
        notifyAll();
    }
}
