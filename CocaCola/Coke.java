package CocaCola;

public class Coke {
    private int prezzo;
    public Coke(){
        this.prezzo = 1;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public String toString(){
        return "Prezzo per lattina: " + prezzo;
    }
    
}
