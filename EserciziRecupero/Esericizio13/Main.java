package EserciziRecupero.Esericizio13;

public class Main {

    private static final int N_BEVITORI = 20;

    public static void main(String[] args) {
        Botte botte = new Botte();
        for (int i = 0; i < N_BEVITORI; i++) {
            new Bevitore(botte).start();
        }
    }
}
