package EserciziRecupero.Processore;

public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Produttore produttore = new Produttore(buffer);
        Consumatore consumatore = new Consumatore(buffer);
        Consumatore1 consumatore1 = new Consumatore1(buffer);

        produttore.start();
        consumatore.start();
        consumatore1.start();
    }
}
