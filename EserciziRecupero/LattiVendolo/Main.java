package EserciziRecupero.LattiVendolo;

import java.util.Random;
import java.util.Vector;

public class Main {
	private static final int NUMERO_MUCCHE = 20;
	private static final int NUMERO_CAMION = 3;
	private static final int NUMERO_CISTERNE = 3;
	private static final int NUMERO_SECCHI = 3;
	
	public static void main(String[] args) {
		Vector <CisternaBuffer> cisterne = new Vector<>();
		Vector <SecchioBuffer> secchio = new Vector<>();
		
		for (int i = 0; i < NUMERO_CISTERNE; i++) {
			cisterne.add(new CisternaBuffer());
		}

		for (int i = 0; i < NUMERO_SECCHI; i++) {
			secchio.add(new SecchioBuffer(cisterne.elementAt(new Random().nextInt(NUMERO_CISTERNE)),i));
		}                      
		
		for (int i = 0; i < NUMERO_MUCCHE; i++) {
			new ProduttoreMucca(secchio.elementAt(new Random().nextInt(NUMERO_SECCHI))).start();
		}

		for (int i = 0; i < NUMERO_CAMION; i++) {
			new ConsumatoreCamion(cisterne.elementAt(new Random().nextInt(NUMERO_CISTERNE))).start();
		}
	}
}
