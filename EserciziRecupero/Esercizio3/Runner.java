package EserciziRecupero.Esercizio3;

public class Runner extends Thread {
    private String name;
    public Runner(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name);
    }

}
