package keypad;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyPad extends JFrame implements ActionListener{
	private JTextField txt;
	private JPanel pnl;
	
	public KeyPad() {
		txt = new JTextField(20);
		add(txt, BorderLayout.NORTH);
		
		pnl = new JPanel();
		pnl.setLayout(new GridLayout(3,3));
		add(pnl, BorderLayout.CENTER);
		
		for(int i = 1; i <= 9; i++)
		{
			JButton bt = new JButton("" + i);
			bt.addActionListener(this);
			bt.setPreferredSize(new Dimension(100, 100));
			pnl.add(bt);
		}
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String actionCommand = e.getActionCommand();
		txt.setText(txt.getText() + actionCommand);
	}
	
	public static void main(String[] ar)
	{
		new KeyPad();
	}
}
