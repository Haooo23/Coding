package EserciziRecupero.LattiVendolo;

import java.util.Random;

public class ConsumatoreCamion extends Thread {
	private CisternaBuffer cisternaBuffer;

	public ConsumatoreCamion(CisternaBuffer cisternaBuffer){
		this.cisternaBuffer = cisternaBuffer;
	}

	@Override 
	public void run(){
		while(true){
			try {
				sleep(2000 + new Random().nextInt(1000)); // da 2 a 3 secondi
			} catch (Exception e) {
				e.printStackTrace();
			}
			cisternaBuffer.removeLatte(1 + new Random().nextInt(20));
		}
	}
}
