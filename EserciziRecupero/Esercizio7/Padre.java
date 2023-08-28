package EserciziRecupero.Esercizio7;

import java.util.Random;
import java.util.Vector;

public class Padre extends Thread{
	private static final int MAX_FIGLI = 5;

    private Conto conto;
    private Vector<Figlio> figli;
    
	public Padre(){
        this.conto = new Conto();
        this.figli = new Vector<Figlio>();

        for (int i = 0; i < MAX_FIGLI; i++) {
			Figlio figlio = new Figlio(conto);
            figli.add(figlio);
			figlio.start();
        }
	}


    @Override

    public void run(){
        while(true){
            try {
                conto.deposita(1000 + new Random().nextInt(conto.MAX_DENARO - 1000));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
