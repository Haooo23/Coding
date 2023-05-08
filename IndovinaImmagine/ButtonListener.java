package IndovinaImmagine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonModel;

public class ButtonListener implements ActionListener {
    private GamePanel gp;
    
    public ButtonListener(GamePanel gamePanel){
        this.gp = gamePanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ButtonModel bm = gp.getSelectionGroup().getSelection();
        String risposta = bm.getActionCommand();

        e.getActionCommand();

        if(e.getActionCommand() == "CONFERMA"){
            if(risposta.equals(gp.getNameFileSelected())){

                System.out.println("CORRETTO!");
                
                gp.points += 10;

                gp.getPointsLabel().setText("Punti: " + gp.points);

                if (gp.selection == "Meme") {
                    gp.generateNewImage(gp.filenames);
                } else if(gp.selection == "Animali"){
                    gp.generateNewImage(gp.filenames2);
                } else {
                    gp.generateNewImage(gp.filenames3);
                }
            }else{
                System.out.println("ERRATO!");
                gp.showError();
            }
        }
    }
}
