package Magazzino;

import java.util.Random;

public class Prodotto {
    
    private int value;
    public Prodotto() {
        value = new Random().nextInt(1000);
    }
    
    @Override
    public String toString(){
        return "Prodotto: " + value;
    }
}
