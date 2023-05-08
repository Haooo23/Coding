package IndovinaImmagine;

import javax.swing.*;
import java.awt.*;

public class CantantiPanel extends JPanel{
    private JPanel imagePanel, selectionPanel, buttonPanel, confirmPanel;
	private JLabel img;
    private JRadioButton btn1, btn2, btn3, btn4;
    private JButton confirmButton;
    private ButtonGroup selectionGroup;
	private JLabel pointsLabel;

	public CantantiPanel() {
		imagePanel = new JPanel(new BorderLayout());
		selectionPanel = new JPanel(new BorderLayout());
		buttonPanel = new JPanel(new GridLayout(1,4));
		confirmPanel = new JPanel(new GridLayout(4,2));

		img = new JLabel();

		selectionGroup = new ButtonGroup();
		btn1 = new JRadioButton();
		btn2 = new JRadioButton();
		btn3 = new JRadioButton();
		btn4 = new JRadioButton();
		confirmButton = new JButton("CONFERMA");

		img = new JLabel();
		imagePanel.add(img,BorderLayout.CENTER);

		selectionPanel.add(buttonPanel,BorderLayout.CENTER);
		selectionPanel.add(confirmPanel,BorderLayout.SOUTH);

		//bottoni
		selectionGroup = new ButtonGroup();
		btn1.setText("fedez");
		btn2.setText("emma marrone");
		btn3.setText("laura pausini");
		btn4.setText("tiziano ferro");

		selectionGroup.add(btn1);
		selectionGroup.add(btn2);
		selectionGroup.add(btn3);
		selectionGroup.add(btn4);

		btn1.setActionCommand("fedez");
		btn2.setActionCommand("panda rosso");
		btn3.setActionCommand("laura pausini");
		btn4.setActionCommand("tiziano ferro");

		buttonPanel.add(btn1);
		buttonPanel.add(btn2);
		buttonPanel.add(btn3);
		buttonPanel.add(btn4);
		confirmPanel.add(confirmButton);
		confirmPanel.add(pointsLabel, BorderLayout.PAGE_END);
	}


}
