package branch.gui.listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class FrameDragListener implements MouseMotionListener, MouseListener {
	private final JFrame frame;
	private int x, y;

	public FrameDragListener(JFrame frame) {
		this.frame = frame;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouse released");
	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mouseClicked(MouseEvent e) {

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

	@Override
	public void mouseMoved(MouseEvent e) {

	}
}
