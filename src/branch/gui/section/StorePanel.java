package branch.gui.section;

import branch.gui.content.ArtDecoPanel;
import branch.gui.content.ModernPanel;
import branch.gui.content.VictorianPanel;

import javax.swing.*;
import java.awt.*;

public class StorePanel extends JPanel {

	private JPanel content;
	private ModernPanel modernPanel;
	private VictorianPanel victorianPanel;
	private ArtDecoPanel artDecoPanel;
	private TitleBar titleBar;

	public StorePanel(JFrame frame, TitleBar titleBar) {
		this.titleBar = titleBar;

		setBackground(new Color(37, 6, 92));

		modernPanel = new ModernPanel(this);
		victorianPanel = new VictorianPanel(this);
		artDecoPanel = new ArtDecoPanel(this);

		setContent(modernPanel);
	}

	public JPanel getContent() {
		return content;
	}

	public void setContent(JPanel jpanel) {
		if (content != null)
			remove(content);
		content = jpanel;
		add(content);
	}

	public ModernPanel getModernPanel() {
		return modernPanel;
	}

	public VictorianPanel getVictorianPanel() {
		return victorianPanel;
	}

	public ArtDecoPanel getArtDecoPanel() {
		return artDecoPanel;
	}

	public TitleBar getTitleBar() {
		return titleBar;
	}
}
