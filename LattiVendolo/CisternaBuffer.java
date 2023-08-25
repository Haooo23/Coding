package LattiVendolo;

public class CisternaBuffer {
	private static final int MAX_LATTE = 100;

	private int counterLatte = 0;

	public synchronized void addLatte(int latte){
		while(counterLatte >= MAX_LATTE){
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		counterLatte+=latte;
		counterLatte = Math.min(counterLatte, MAX_LATTE);
		System.out.println("[CISTERNA] Latte aggiunto nella cisterna: " + latte + " " + "Latte contenuto: " + counterLatte + "/" + MAX_LATTE);
		notifyAll();
	}

	public synchronized int removeLatte(int latte){
		while(counterLatte <= 0){
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		if(counterLatte >= latte){ 
			counterLatte -= latte;
			System.out.println("[CISTERNA] Latte rimosso dalla cisterna: " + latte + " | Latte contenuto: " + counterLatte + "/" + MAX_LATTE);
			notifyAll();
			return latte;
		}else{
			latte = counterLatte;
			counterLatte = 0;
			System.out.println("[CISTERNA] Latter rimosso dalla cisterna:" + latte + " | Cisterna vuota! ");
			notifyAll();
			return latte;
		}
	}
}
