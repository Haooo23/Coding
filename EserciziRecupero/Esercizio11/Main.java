package EserciziRecupero.Esercizio11;

public class Main {
    public static void main(String[] args) {
        Telescopio telescopio = new Telescopio();

        for (int i = 0; i < 10; i++) {
            new Persone(i, telescopio).start();
        }
    }
}
