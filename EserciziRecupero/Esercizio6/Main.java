package EserciziRecupero.Esercizio6;

public class Main {
	private static final int MAX_FIGLI = 6;
	
    public static void main(String[] args) {
        Counter counter = new Counter();
        
        for (int i = 0; i < MAX_FIGLI; i++) {
            new Figlio(counter).start();
        }
		
		// for (int i = 0; i < MAX_FIGLI / 2; i++) {
        //     new Figlio(counter, 1).start();
        // }
    }
}
