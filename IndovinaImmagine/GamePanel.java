package IndovinaImmagine;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.*;


public class GamePanel extends JPanel{
    private static String ERROR_IMG_PATH = "./IndovinaImmagine/urlo spaventoso.jpg";
    private JPanel imagePanel, selectionPanel, buttonPanel, confirmPanel;
    private Vector<JRadioButton> buttons;
    private JButton confirmButton;
    private JLabel img;
    private JLabel pointsLabel;
    private ButtonGroup selectionGroup;
    public String[] filenames = {"sguardo confuso","sguardo esplosivo","sguardo mortuario","sguardo triste"};
    public String[] filenames2 = {"capibara","panda rosso","scimmia","bradipo"};
    public String[] filenames3 = {"fedez","emma marrone","laura pausini","tiziano ferro"};
    private Vector<String> images;
    private String nameFileSelected;
    public String selection;
    private Random random;
    public int points;


    public GamePanel(String selectedCategory){
        // Gioco
        super(new BorderLayout());

        imagePanel = new JPanel(new BorderLayout());
        selectionPanel = new JPanel(new BorderLayout());
        buttonPanel = new JPanel(new GridLayout(1,4));
        confirmPanel = new JPanel(new GridLayout(4,2));
        img = new JLabel();
        
        //bottoni
        selectionGroup = new ButtonGroup();
        confirmButton = new JButton("CONFERMA");
        confirmButton.addActionListener(new ButtonListener(this));

        points = 0;
        pointsLabel = new JLabel("Punti: " + points);

        selection = selectedCategory;
    
        images = new Vector<String>();
        getImages();

        buttons = new Vector<JRadioButton>();
        for(int i = 0 ; i < images.size(); i ++) {
            JRadioButton button = new JRadioButton(images.get(i));
            selectionGroup.add(button);
            buttonPanel.add(button);

            buttons.add(button);
        }

        imagePanel.add(img, BorderLayout.CENTER);

        selectionPanel.add(buttonPanel, BorderLayout.CENTER);
		selectionPanel.add(confirmPanel, BorderLayout.SOUTH);

        this.add(imagePanel, BorderLayout.CENTER);
        this.add(selectionPanel, BorderLayout.SOUTH);
    }

    public String getNameFileSelected() {
        return nameFileSelected;
    }

    public ButtonGroup getSelectionGroup() {
        return selectionGroup;
    }

    public JLabel getPointsLabel() {
        return pointsLabel;
    }

    public void showError() {
        img.setIcon(new ImageIcon(ERROR_IMG_PATH));
    }

    private void getImages() {
        File categoryFolder = new File("./IndovinaImmagine/" + selection+ "/");
        
        for (File image : categoryFolder.listFiles()) {
            StringTokenizer stringTokenizer = new StringTokenizer(image.getName(), "asd");
            images.add(stringTokenizer.nextToken());
        }
    }
    
    public void generateNewImage(String nameList[]) {
        nameFileSelected = nameList[random.nextInt(nameList.length)];
        System.out.println(nameFileSelected);
        img.setIcon(new ImageIcon("./IndovinaImmagine/" + selection+ "/" + nameFileSelected + ".jpg"));
    }
    
}
