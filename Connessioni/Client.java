package Connessioni;

import java.util.Random;

public class Client extends Thread {
    
    private LoadBalancer loadBalancer;
    private final String TIPO_RICHIESTA [] = {"login", "ordina", "annulla", "storico", "account"};

    public Client(LoadBalancer loadBalancer){
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
            String richiesta = TIPO_RICHIESTA[new Random().nextInt(TIPO_RICHIESTA.length)];
            int porta =  1024 + new Random().nextInt(3000-1024);
            String ip =  (1 + new Random().nextInt(254)) + "." +  (1 + new Random().nextInt(254)) + "." +  (1 + new Random().nextInt(254)) + "." +  (1 + new Random().nextInt(254));
            loadBalancer.connect(richiesta, porta, ip);
        }
    }


}
