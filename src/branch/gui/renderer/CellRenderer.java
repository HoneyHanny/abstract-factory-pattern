package branch.gui.renderer;

import javax.swing.*;
import java.awt.*;

public class CellRenderer implements ListCellRenderer {
	private final JLabel cell = new JLabel(" ", JLabel.CENTER);

	@Override
	public Component getListCellRendererComponent(JList list,  Object value, int index, boolean isSelected, boolean cellHasFocus) {
		cell.setOpaque(true);
		cell.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
		cell.setBackground(new Color(0f, 0f, 0f, 0f));
		if (isSelected) {
			cell.setForeground(new Color(65, 123 ,200));
		} else {
			cell.setForeground(Color.WHITE);
		}
		cell.setText(value.toString());
		return cell;
	}
}
