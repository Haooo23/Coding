package IndovinaImmagine;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CategoryPanel extends JPanel{
    private JButton animali, meme, cantanti;
    public CategoryPanel(){

        super(new GridLayout(5, 3, 0, 20));
    
        animali = new JButton("Animali");
        meme = new JButton("Meme");
        cantanti = new JButton("Cantanti");
    
        for (int index = 0; index < 3; index++) {
            this.add(new Panel());
        }
    
        this.add(new Panel());
        this.add(animali);
        this.add(new Panel());
    
        this.add(new Panel());
        this.add(meme);
        this.add(new Panel());
    
        this.add(new Panel());
        this.add(cantanti);
        this.add(new Panel());
    
        for (int index = 0; index < 3; index++) {
            this.add(new Panel());
        }

        animali.addActionListener(new CategoryListener(this));
        meme.addActionListener(new CategoryListener(this));
        cantanti.addActionListener(new CategoryListener(this));

    }

}
