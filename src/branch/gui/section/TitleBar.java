package branch.gui.section;

import branch.gui.listener.FrameDragListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class TitleBar extends JPanel {

	private JLabel title;
	private JLabel xIcon;
	private JLabel empty;
	private int x, y;

	public TitleBar(JFrame frame, String title) {
		setLocation(0, 0);
		setBackground(new Color(32, 32, 32));
		setLayout(new GridLayout(1, 3));
		setSize(frame.getWidth(), 32);
		setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));

		empty = new JLabel("");

		this.title = new JLabel();
		this.title.setHorizontalAlignment(SwingConstants.CENTER);
		this.title.setHorizontalTextPosition(SwingConstants.RIGHT);
		this.title.setText(title);
		this.title.setForeground(Color.LIGHT_GRAY);
		this.title.setLocation(32, 0);

		xIcon = new JLabel();
		xIcon.setIcon(new ImageIcon(new ImageIcon("res/x.png").getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH)));
		xIcon.setLocation(8, 8);
		xIcon.setSize(16, 16);
		add(xIcon);
		add(this.title);
		add(empty);

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

//		addMouseListener(new MouseAdapter() {
//			@Override
//			public void mousePressed(MouseEvent e) {
//				x = e.getX();
//				y = e.getY();
//			}
//
//			@Override
//			public void mouseDragged(MouseEvent e) {
//				int xx = e.getXOnScreen();
//				int yy = e.getYOnScreen();
//				frame.setLocation(xx - x, yy - y);
//			}
//		});

		addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {
				x = e.getX();
				y = e.getY();
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
		addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int xx = e.getXOnScreen();
				int yy = e.getYOnScreen();
				frame.setLocation(xx - x, yy - y);
			}

			@Override
			public void mouseMoved(MouseEvent e) {

			}
		});
	}
}
