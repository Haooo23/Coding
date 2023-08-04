package EserciziRecupero.Esercizio5;

import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Random random = new Random();
        int matrice[][] = {
            {random.nextInt(100),random.nextInt(100),random.nextInt(100)},
            {random.nextInt(100),random.nextInt(100),random.nextInt(100)},
            {random.nextInt(100),random.nextInt(100),random.nextInt(100)}
        };

        Runner thread1, thread2, thread3;
        thread1 = new Runner(matrice[1]);
        thread2 = new Runner(matrice[2]);
        thread3 = new Runner(matrice[0]);

        try {
            thread1.start();
            thread1.join();      
            thread2.start();       
            thread2.join(); 
            thread3.start();
            thread3.join(); 
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        System.out.println("Risultato: " + (thread1.getSomma()+thread2.getSomma()+thread3.getSomma()));
    }

    

}
