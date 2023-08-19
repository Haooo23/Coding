package CartaSassoForbice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Gioco {

    String mosse[] = {"sasso","carta","forbice"}; //1 2 3
    private static InputStreamReader isr = new InputStreamReader(System.in);
	private static BufferedReader br = new BufferedReader(isr);

    public void play(){
        int mossaUtente = 0;
        int mossaBot;
        int puntiUtente = 0;
        int puntiBot = 0;
        do {
        
            try {
                System.out.println("Scegli la mossa: [1]Sasso - [2]Carta - [3]Forbice");

                mossaUtente = Integer.parseInt(br.readLine());
                mossaBot = 1 + new Random().nextInt(3);
                System.out.println(mosse[mossaUtente - 1] + " vs " + mosse[mossaBot - 1]);
                if(mossaUtente > mossaBot || (mossaUtente == 1 && mossaBot == 3)) {
                    System.out.println("Hai vinto");
                    puntiUtente++;
                }else if(mossaUtente == mossaBot){
                    System.out.println("Hai pareggiato");
                }else{
                    System.out.println("Hai perso");
                    puntiBot++;
                }
            } catch (Exception e) {}
            System.out.println("Punti Utente: " + puntiUtente);
            System.out.println("Punti Bot: " + puntiBot);
        } while (mossaUtente != 4);
        if(puntiUtente == 3){
            System.out.println("Hai vinto " + puntiUtente);
        }else{
            System.out.println("Hai perso contro il bot " + puntiBot);
        }
    }
}
