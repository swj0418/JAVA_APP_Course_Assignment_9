package drawwithmouse;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.*;
import javax.swing.*;

class Point{
	int x, y;
}

class MyPanel extends JPanel implements MouseMotionListener {
	private int index = 0;
	Point[] array = new Point[1000];
	public MyPanel() {
		this.addMouseMotionListener(this);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if (index > 1000) {
			return;
		}
		array[index] = new Point();
		array[index].x = e.getX();
		array[index].y = e.getY();
		index++;
		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Point p : array) {
			if(p != null) {
				g.drawRect(p.x, p.y, 1, 1);
			}
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
public class Scribble extends JFrame{
	public Scribble() {
		setSize(300, 300);
		setTitle("Draw with a mouse");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		setVisible(true);
	}
	public static void main(String[] ar)
	{
		Scribble s = new Scribble();
	}
}
