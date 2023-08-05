package EserciziRecupero.Esercizio15;

public class Main {
    public static void main(String[] args) {
        Pista pista = new Pista();
        Spogliatoio spogliatoio = new Spogliatoio();
        
        
        for (int i = 0; i < 8 ; i++) {
            new Amici(pista, spogliatoio,i+1).start();
        }
    }
}
