package IndovinaImmagine;

import java.awt.*;

import javax.swing.*;

public class MenuPanel extends JPanel {
    private JButton playBtn, leaderboardBtn, settingsBtn;
    private JTextField playerName;

    public MenuPanel(){
        super(new GridLayout(4,3,0,20));
        playBtn = new JButton("PLAY");

        leaderboardBtn = new JButton("Classifica");
        leaderboardBtn.addActionListener(new MenuListener(this));
        settingsBtn = new JButton("Impostazioni");
        settingsBtn.addActionListener(new MenuListener(this));
        playerName = new JTextField("Nome del giocatore");
        

        this.add(new Panel());
        this.add(playBtn);
        this.add(new Panel());
    
        this.add(new Panel());
        this.add(playerName);
        this.add(new Panel());
    
        this.add(new Panel());
        this.add(leaderboardBtn);
        this.add(new Panel());

        this.add(new Panel());
        this.add(settingsBtn);
        this.add(new Panel());
    }
}
