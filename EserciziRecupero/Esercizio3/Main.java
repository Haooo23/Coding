package EserciziRecupero.Esercizio3;

public class Main extends Thread {
    
    public static void main(String[] args) {
        Runner runner1, runner2;
        runner1 = new Runner("Pippo");
        runner2 = new Runner("Caio");

        System.out.println("main");
        runner1.start();
        runner2.start();
    }
    
}
