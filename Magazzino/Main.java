package Magazzino;

public class Main {

    public static void main(String[] args) {
        Fabbrica fabbrica = new Fabbrica();
        Consumatore consumatore = new Consumatore(fabbrica);
        Produttore produttore = new Produttore(fabbrica);

        consumatore.start();
        produttore.start();
    }
}
