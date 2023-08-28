package EserciziRecupero.Esercizio8;

public class Fornitore extends Thread {
    
    private CokeMachine cokemachine;

    public Fornitore(CokeMachine cokemachine){
        this.cokemachine = cokemachine;
    }

    @Override
    public void run() {
        while(true){
            try {
                sleep(3000);
                cokemachine.deposit();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
