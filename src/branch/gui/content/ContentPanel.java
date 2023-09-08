package branch.gui.content;


import branch.gui.section.StorePanel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ContentPanel extends JPanel {

	protected ArrayList<JLabel> images;
	protected GridLayout gridLayout;

	public ContentPanel(StorePanel storePanel) {
		// setBorder(BorderFactory.createLineBorder(Color.WHITE));
		setBorder(BorderFactory.createEmptyBorder(64, 64, 64, 64));
		gridLayout = new GridLayout(3, 3, 64, 64);


		setLayout(gridLayout);
		setOpaque(false);
		images = new ArrayList<JLabel>();
		// setSize(storePanel.getWidth(), storePanel.getHeight());
	}
}
