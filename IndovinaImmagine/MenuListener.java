package IndovinaImmagine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuListener implements ActionListener {

    private MenuPanel menuPanel;

    public MenuListener(MenuPanel menuPanel){
        this.menuPanel = menuPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch (e.getActionCommand()) {
            case "PLAY":
            
            break;
            
            case "Impostazioni":
            ChangePanel.changeVisibility(new CategoryPanel(),menuPanel);
            break;
        

        }
    }
    
}
