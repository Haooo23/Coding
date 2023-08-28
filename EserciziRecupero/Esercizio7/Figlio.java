package EserciziRecupero.Esercizio7;

import java.util.Random;

public class Figlio extends Thread {
	private Conto conto;

	public Figlio(Conto conto) {
		this.conto = conto;
	}

    @Override
	public void run() {
        while(true){
            try {
                conto.prelievo(10 + new Random().nextInt(1000));   
                sleep(500 + new Random().nextInt(1000));  
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
	}
}
