package EserciziRecupero.Esercizio5;

public class Runner extends Thread{
    private int somma = 0;
    private int riga[];
    public Runner(int riga[]){
    this.riga = riga;
    }

    @Override
    public void run() {
        for (int i = 0; i < riga.length; i++) {
            somma += riga[i];
        }
    }
    public int getSomma() {
        return somma;
    }
}
