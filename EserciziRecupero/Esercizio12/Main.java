package EserciziRecupero.Esercizio12;

public class Main {
    public static final int VISITATORI = 50;
    

    public static void main(String[] args) {
        Museo museo = new Museo();
        for (int i = 0; i < VISITATORI; i++){
            new Visitatore(museo).start();
        }
    }
}
