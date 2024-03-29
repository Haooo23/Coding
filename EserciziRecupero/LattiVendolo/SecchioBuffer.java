package EserciziRecupero.LattiVendolo;

public class SecchioBuffer {
	private static final int MAX_LATTE = 15;

	private int counterLatteSecchio = 0;
	private CisternaBuffer cisternaBuffer;
	private int id;

	public SecchioBuffer(CisternaBuffer cisternaBuffer, int id){
		this.cisternaBuffer = cisternaBuffer;
		this.id = id;
	}

	public synchronized void addLatte(){
		while(counterLatteSecchio >= MAX_LATTE){
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		counterLatteSecchio++;
		System.out.println("[SECCHIO][" + id  + "}Latte aggiunto al secchio | Latte contenuto: " + counterLatteSecchio + "/" + MAX_LATTE);
		notifyAll();

		if (counterLatteSecchio >= MAX_LATTE) {
			removeLatte();
		}
	}

	private void removeLatte(){
		// while(counterLatteSecchio <= 0){
		// 	try {
		// 		wait();
		// 	} catch (Exception e) {}
		// }
		cisternaBuffer.addLatte(counterLatteSecchio);
		counterLatteSecchio = 0;
		System.out.println("[SECCHIO] Secchio Svuotato!\n");
		notifyAll();
	}
}
