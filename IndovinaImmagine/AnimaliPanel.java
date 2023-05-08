package IndovinaImmagine;
import java.awt.*;

import javax.swing.*;

public class AnimaliPanel extends JPanel {
    private JPanel imagePanel, selectionPanel, buttonPanel, confirmPanel;
	private JLabel img;
    private JRadioButton btn1, btn2, btn3, btn4;
    private JButton confirmButton;
    private ButtonGroup selectionGroup;
	private JLabel pointsLabel;

	public AnimaliPanel() {
		super(new BorderLayout());
		imagePanel = new JPanel(new BorderLayout());
		selectionPanel = new JPanel(new BorderLayout());
		buttonPanel = new JPanel(new GridLayout(1,4));
		confirmPanel = new JPanel(new GridLayout(4,2));

		pointsLabel = new JLabel("points: ");
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
		btn1.setText("capibara");
		btn2.setText("panda rosso");
		btn3.setText("bradipo");
		btn4.setText("scimmia");

		selectionGroup.add(btn1);
		selectionGroup.add(btn2);
		selectionGroup.add(btn3);
		selectionGroup.add(btn4);

		btn1.setActionCommand("capibara");
		btn2.setActionCommand("panda rosso");
		btn3.setActionCommand("bradipo");
		btn4.setActionCommand("scimmia");

		buttonPanel.add(btn1);
		buttonPanel.add(btn2);
		buttonPanel.add(btn3);
		buttonPanel.add(btn4);
		confirmPanel.add(confirmButton);
		confirmPanel.add(pointsLabel, BorderLayout.PAGE_END);

		this.add(imagePanel,BorderLayout.NORTH);
		this.add(selectionPanel,BorderLayout.SOUTH);
	}
	
	//bottoni

	// confirmButton.addActionListener(new ButtonListener(this));
	// points = 0;
	// pointsLabel = new JLabel("Punti: " + points);
}