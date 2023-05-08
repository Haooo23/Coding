package IndovinaImmagine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CategoryListener implements ActionListener {
    private CategoryPanel cp;
    
    public CategoryListener(CategoryPanel categoryPanel){
        this.cp = categoryPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ChangePanel.changeVisibility(new GamePanel(e.getActionCommand()), cp);
    }
}


