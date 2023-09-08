package branch.gui.listener;

import branch.gui.section.SideBar;
import branch.gui.section.StorePanel;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class SideBarListener implements ListSelectionListener {
	private final SideBar sideBar;
	private final StorePanel storePanel;

	public SideBarListener(SideBar sideBar, StorePanel storePanel) {
		this.sideBar = sideBar;
		this.storePanel = storePanel;
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		JList<String> list = (JList<String>) e.getSource();
		int index = list.getSelectedIndex();

		storePanel.remove(storePanel.getContent());

		if (index == 0) {
			storePanel.setContent(storePanel.getModernPanel());
		} else if (index == 1) {
			storePanel.setContent(storePanel.getVictorianPanel());
		} else if (index == 2) {
			storePanel.setContent(storePanel.getArtDecoPanel());
		}

		storePanel.repaint(sideBar.getWidth(),storePanel.getTitleBar().getHeight(), storePanel.getWidth(), storePanel.getHeight());
		storePanel.revalidate();
	}
}
