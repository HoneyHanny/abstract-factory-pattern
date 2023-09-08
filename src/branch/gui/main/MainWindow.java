package branch.gui.main;

import branch.gui.section.SideBar;
import branch.gui.section.StorePanel;
import branch.gui.section.TitleBar;

import javax.swing.*;


public class MainWindow extends JFrame {

	private SideBar sideBar;
	private StorePanel storePanel;
	private TitleBar titleBar;
	private JLayeredPane layeredPane;

	public MainWindow() {
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(900, 500);
		setLocationRelativeTo(null);
		setUndecorated(true);

		initComponents();

		setVisible(true);
	}

	private void initComponents() {
		setLayout(null);
		layeredPane = new JLayeredPane();
		layeredPane.setLocation(0, 0);
		layeredPane.setSize(getWidth(), getHeight());

		titleBar = new TitleBar(this, "Furniture Store");
		storePanel = new StorePanel(this, titleBar);
		sideBar = new SideBar(this, storePanel, titleBar);

		layeredPane.add(titleBar, 0);
		layeredPane.add(sideBar, 1);
		layeredPane.add(storePanel, -1);

//		layeredPane.setLayer(titleBar, 0);
//		layeredPane.setLayer(sideBar, 1);
//		layeredPane.setLayer(storePanel, 2);

		add(layeredPane);
		layeredPane.setVisible(true);

//		getLayeredPane().setComponentZOrder(titleBar, 0);
//		getLayeredPane().setComponentZOrder(sideBar, 1);
//		getLayeredPane().setComponentZOrder(storePanel, 2);
		// fix Z-index

		sideBar.setLocation(0, titleBar.getHeight());

		storePanel.setLocation(sideBar.getWidth(), titleBar.getHeight());
		storePanel.setSize(getWidth() - sideBar.getWidth(), getHeight());

		System.out.println("Width: " + storePanel.getWidth());
		System.out.println("Height: " + storePanel.getHeight());
		System.out.println("X: " + storePanel.getX());
		System.out.println("Y: " + storePanel.getY());
	}
}
