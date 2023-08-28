package EserciziRecupero.Miniera;

import java.util.Random;

public class Gemma {
    private int peso;
    private int prezzo;
    
    public Gemma(){
        peso = new Random().nextInt(1000);
        prezzo = new Random().nextInt(500);
    }

    @Override
    public String toString() {
        return "Gemma(Peso): " + peso + " - prezzo: " + prezzo ;
    }
}
