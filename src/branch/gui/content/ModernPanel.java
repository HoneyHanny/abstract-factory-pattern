package branch.gui.content;

import branch.gui.section.StorePanel;

import javax.swing.*;
import java.awt.*;

public class ModernPanel extends ContentPanel {

	public ModernPanel(StorePanel storePanel) {
		super(storePanel);
		initImages();
	}

	private void initImages() {
		images.add(new JLabel());
		images.get(0).setIcon(new ImageIcon(new ImageIcon("res/modernchair.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));

		images.add(new JLabel());
		images.get(1).setIcon(new ImageIcon(new ImageIcon("res/modernsofa.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));

		images.add(new JLabel());
		images.get(2).setIcon(new ImageIcon(new ImageIcon("res/moderncoffeetable.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));

		images.add(new JLabel());
		images.get(3).setIcon(new ImageIcon(new ImageIcon("res/modernshelf.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));

		for (JLabel label : images) {
			label.setForeground(Color.WHITE);
			//label.setBorder(BorderFactory.createEmptyBorder(32, 32, 32, 32));
			label.setHorizontalAlignment(JLabel.CENTER);
			label.setVerticalAlignment(JLabel.CENTER);
			label.setAlignmentX(Box.CENTER_ALIGNMENT);
			label.setAlignmentY(Box.CENTER_ALIGNMENT);

			add(label);
		}
	}

}
