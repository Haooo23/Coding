package CocaCola;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();

        Produttore produttore = new Produttore(storage);
        Consumatore consumatore = new Consumatore(storage);
        
        produttore.start();
        consumatore.start();

    }
}
