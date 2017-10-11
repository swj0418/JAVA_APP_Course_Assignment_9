package counter;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyCounter{
	private JLabel label, label1;
	private JButton button;
	private static int count = 0;
	private JPanel panel = new JPanel();
	private JFrame frame = new JFrame();
	public MyCounter() {
		label = new JLabel("Counter");
		panel.add(label);
		label1 = new JLabel("" + count);
		label1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 100));
		panel.add(label1);
		button = new JButton("Increase");
		panel.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count += 1;
				label1.setText("" + count);
			}
		});
		frame.add(panel);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("My Counter");
		frame.setVisible(true);
	}
	public static void main(String[] ar)
	{
		MyCounter counter = new MyCounter();
	}
}
