package branch.gui.listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrameDragListener extends MouseAdapter {
	private final JFrame frame;
	private Point mouseDownCompCoords;
	private int x, y;

	public FrameDragListener(JFrame frame) {
		this.frame = frame;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouse released");
		mouseDownCompCoords = null;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mouse pressed");
		x = e.getX();
		y = e.getY();
		System.out.println(x + " " + y);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouse dragged");

		int xx = e.getXOnScreen();
		int yy = e.getYOnScreen();
		System.out.println(xx + " " + x);
		frame.setLocation(xx - x, yy - y);
	}
}
