package branch.gui.section;

import branch.gui.listener.FrameDragListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TitleBar extends JPanel {

	private JLabel title;
	private JLabel xIcon;

	public TitleBar(JFrame frame, String title) {
		setLocation(0, 0);
		setBackground(new Color(32, 32, 32));
		setLayout(new GridLayout(1, 2));
		setSize(frame.getWidth(), 32);
		setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));

		this.title = new JLabel();
		this.title.setHorizontalAlignment(SwingConstants.RIGHT);
		this.title.setHorizontalTextPosition(SwingConstants.CENTER);
		this.title.setText(title);
		this.title.setForeground(Color.LIGHT_GRAY);
		this.title.setLocation(32, 0);


		xIcon = new JLabel();
		xIcon.setIcon(new ImageIcon(new ImageIcon("res/x.png").getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH)));
		xIcon.setLocation(8, 8);
		xIcon.setSize(16, 16);
		add(xIcon);
		add(this.title);
		xIcon.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Exiting...");
				System.exit(0);
			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}
		});

		addMouseListener(new FrameDragListener(frame));
		addMouseMotionListener(new FrameDragListener(frame));
	}
}
