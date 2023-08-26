package Connessioni;

public class Main {
    private static final int MAX_CLIENT = 10;
    private static final int MAX_SERVER = 5;
    public static void main(String[] args) {
        LoadBalancer loadBalancer = new LoadBalancer();

        for (int i = 0; i < MAX_CLIENT; i++) {
            new Client(loadBalancer).start();;
        }

        for (int i = 0; i < MAX_SERVER; i++) {
            new Server(loadBalancer).start();;
        }
    }
}
