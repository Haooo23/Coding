package LattiVendolo;

public class Main {
	private static final int NUMERO_MUCCHE = 4;
	private static final int NUMERO_CAMION = 1;

	public static void main(String[] args) {
		CisternaBuffer cisternaBuffer = new CisternaBuffer();
		SecchioBuffer secchioBuffer = new SecchioBuffer(cisternaBuffer);

		for (int i = 0; i < NUMERO_MUCCHE; i++) {
			new ProduttoreMucca(secchioBuffer).start();;
		}

		for (int i = 0; i < NUMERO_CAMION; i++) {
			new ConsumatoreCamion(cisternaBuffer).start();;
		}
	}
}
