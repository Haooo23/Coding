package EserciziRecupero.Esercizio8;

public class Main {
	private static final int MAX_UTENTI = 10;

    public static void main(String[] args) {
        CokeMachine cokemachine = new CokeMachine();
		
		for (int index = 0; index < MAX_UTENTI; index++) {
			new Utente(cokemachine).start();
		}
		
        new Fornitore(cokemachine).start();
    }
}
