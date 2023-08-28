package EserciziRecupero.Miniera;

public class Main {
    public static void main(String[] args) {
        Miniera miniera = new Miniera();
        Consumatore consumatore = new Consumatore(miniera);
        Produttore produttore = new Produttore(miniera); 

        consumatore.start();
        produttore.start();
    }
}
