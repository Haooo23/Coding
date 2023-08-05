package EserciziRecupero.Esercizio14;

import java.util.concurrent.Semaphore;

public class Buyer implements Runnable {
    private static final int NUM_TICKETS = 100;
    private static final int NUM_SELLERS = 5;
    private static Semaphore ticketsSemaphore = new Semaphore(NUM_TICKETS, true);
    private static Semaphore sellersSemaphore = new Semaphore(NUM_SELLERS, true);
    private static int availableTickets = NUM_TICKETS;

    @Override
    public void run() {
        try {
            System.out.println("Buyer is waiting to buy a ticket.");
            
            Thread.sleep((long) (Math.random() * 1000));

            
            sellersSemaphore.acquire();
            System.out.println("Buyer is approaching the ticket booth.");

            
            if (availableTickets > 0) {
                
                ticketsSemaphore.acquire();
                availableTickets--;
                System.out.println("Buyer purchased a ticket. Tickets left: " + availableTickets);
                ticketsSemaphore.release();
            } else {
                System.out.println("Buyer couldn't buy a ticket. Tickets sold out.");
            }

            
            sellersSemaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

