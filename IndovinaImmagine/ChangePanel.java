package IndovinaImmagine;

import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ChangePanel {
	private static JFrame defaultFrame;

	public static void setDefaultFrame(JFrame frame) {
		defaultFrame = frame;
	}

	public static void changeVisibility(JComponent toVisible, JComponent toInvisible) {
		if (defaultFrame == null) {
			System.out.println("Can't change panel: defaultFrame missing.");
			return;
		}

		toInvisible.setVisible(false);
		defaultFrame.remove(toInvisible);

		toVisible.setVisible(true);
		defaultFrame.add(toVisible, BorderLayout.CENTER);
	}

	public static void fixFrame() {
		SwingUtilities.updateComponentTreeUI(defaultFrame);
	}
}