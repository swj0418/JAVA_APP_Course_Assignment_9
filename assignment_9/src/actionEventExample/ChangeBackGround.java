package actionEventExample;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame{
	private JButton cb1 = new JButton("Pink");
	private JButton cb2 = new JButton("Black");
	private JPanel pnl = new JPanel();
	MyListener listener = new MyListener();
	
	MyFrame() {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Event Example");
		
		pnl = new JPanel();
		cb1 = new JButton("Yellow");
		cb1.addActionListener(listener);
		pnl.add(cb1);
		
		cb2 = new JButton("Black");
		cb2.addActionListener(listener);
		pnl.add(cb2);
		
		this.add(pnl);
		this.setVisible(true);
	}
	
	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent ex)
		{
			if(ex.getSource() == cb1) {
				pnl.setBackground(Color.YELLOW);
			} else if(ex.getSource() == cb2) {
				pnl.setBackground(Color.BLACK);
			}
		}
	}
}

public class ChangeBackGround {
	public static void main(String[] ar)
	{
		MyFrame f = new MyFrame();
	}
}
