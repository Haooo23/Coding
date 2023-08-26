package Connessioni;

import java.util.Random;

public class Server extends Thread{
    
    private LoadBalancer loadBalancer;

    public Server(LoadBalancer loadBalancer){
        this.loadBalancer = loadBalancer;
    }

    @Override
    public void run(){
        while(true){
            try {
                sleep(new Random().nextInt(1000));
            } catch (Exception e) {
                // TODO: handle exception
            }
            loadBalancer.gestisci_Richiesta().elabora();
        }
    }
}
