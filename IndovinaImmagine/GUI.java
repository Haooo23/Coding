package IndovinaImmagine;
import javax.swing.*;
import java.awt.*;

public class GUI {

    private JFrame frame;
    private JLabel img;
    private MenuPanel menuPanel;

    public GUI(){
        frame = new JFrame("INDOVINA L'IMMAGINE");
        frame.setLayout(new BorderLayout());
        
        ChangePanel.setDefaultFrame(frame);
        menuPanel = new MenuPanel();
        // Categorie
        frame.add(menuPanel,BorderLayout.CENTER);

        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public JLabel getImg() {
        return img;
    }

    public static void main(String[] args) {
        new GUI();
    }
}
