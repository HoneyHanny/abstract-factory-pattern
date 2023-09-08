package branch.gui.section;

import branch.gui.renderer.CellRenderer;
import branch.gui.listener.SideBarListener;

import javax.swing.*;
import java.awt.*;

public class SideBar extends JPanel {

	private final String[] styles = { "Modern", "Victorian", "Art Deco" };
	private final JList<String> list = new JList<String>(styles);
	private final JLabel storeText = new JLabel("Store");

	public SideBar(JFrame frame, StorePanel storePanel, TitleBar titleBar) {
		setSize(200, frame.getHeight() - titleBar.getHeight());
		setBackground(new Color(10, 5, 23));
		var boxLayout = new BoxLayout(this, BoxLayout.PAGE_AXIS);
		setLayout(boxLayout);

		storeText.setHorizontalTextPosition(JLabel.CENTER);
		storeText.setHorizontalAlignment(JLabel.CENTER);
		storeText.setVerticalTextPosition(JLabel.CENTER);
		storeText.setVerticalAlignment(JLabel.CENTER);

		setMaximumSize(new Dimension(getWidth(), getHeight()));

		var emptyBorder = BorderFactory.createEmptyBorder(8, 8, 8, 8);

		storeText.setBorder(BorderFactory.createEmptyBorder(16, 16, 16, 16));

		add(storeText);
		add(list);
		list.setOpaque(false);
		list.setCellRenderer(new CellRenderer());
		list.addListSelectionListener(new SideBarListener(this, storePanel));
		list.setSelectedIndex(0);

		storeText.setForeground(new Color(100, 100, 200));
	}

	public JList<String> getList() {
		return list;
	}
}
