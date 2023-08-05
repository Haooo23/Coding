package EserciziRecupero.Esericizio13;

public class Botte {
    public static final int MAX_BEVITORI = 3;
    public static final int MAX_LITRI = 100;
    private int litri = MAX_LITRI;
    private int counter = 0;

    public synchronized void bere(){
        try {

            if(litri <= 0){
                return;
            }

            while( counter >= MAX_BEVITORI){ 
                wait();
            }
            litri--;
            counter++;
            System.out.println("Nuovo bevitore: " + counter + " Litri rimasti: " + litri);
        } catch (Exception e) {
            System.out.println("PIENO");
        }
    }

    public synchronized void finitoBere(){
        try {
            counter--;
            System.out.println("Bevitore uscito: " + counter);
            notifyAll();
        } catch (Exception e) {
            System.out.println("LIBERO");
        }
    }

    public int getLitri() {
        return litri;
    }
}
