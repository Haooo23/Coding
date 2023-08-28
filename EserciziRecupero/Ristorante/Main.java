package EserciziRecupero.Ristorante;

public class Main {
    public static void main(String[] args) {
        Ristorante ristorante = new Ristorante();
        for (int i = 0; i < 500; i++) {
            new Cliente(i, ristorante).start();
        }
    }
}