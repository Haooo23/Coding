package EserciziRecupero.Esercizio15;

import java.util.Random;

public class Amici extends Thread {
    private Pista pista;
    private Spogliatoio spogliatoio;
    private int ID;

    public Amici(Pista pista, Spogliatoio spogliatoio,int ID) {
        this.pista = pista;
        this.spogliatoio = spogliatoio;
        this.ID = ID;
    }
        
    @Override
    public void run() {
        try {

            spogliatoio.entraSpogliatoio();
            System.out.println("Amico: " + ID + " entrato in spogliatoio");
            Thread.sleep(500 + new Random().nextInt(1000));
            spogliatoio.esciSpogliatoio();
            System.out.println("Amico: " + ID + " uscito dallo spogliatoio");
            Thread.sleep(500 + new Random().nextInt(1000));
            pista.entraPista();
            System.out.println("Amico: " + ID + " entrato in pista");
            for (int i = 0; i < 15; i++) {
                Thread.sleep(1000 + new Random().nextInt(500));
                System.out.println("Amico: " + ID + " Numero giri: " + i);
            }
            pista.esciPista();
            System.out.println("Amico: " + ID + " uscito dalla pista dopo 15 giri");
            Thread.sleep(100 + new Random().nextInt(100));
            spogliatoio.entraSpogliatoio();
            System.out.println("Amico: " + ID + " entrato in spogliatoio");
            Thread.sleep(500 + new Random().nextInt(1000));
            spogliatoio.esciSpogliatoio();
            System.out.println("Amico: " + ID + " uscito dallo spogliatoio");

        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}  