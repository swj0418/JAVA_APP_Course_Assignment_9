package rockScissorPaper;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class RockPaperScissor extends JFrame implements ActionListener{
	static final int ROCK = 0;
	static final int SCISSOR = 0;
	static final int PAPER = 0;
	
	private JPanel panel;
	private JTextField output;
	private JTextField information;
	private JButton rock;
	private JButton scissor;
	private JButton paper;
	
	public RockPaperScissor() {
		setTitle("Rock Scissor Paper");
		setSize(400, 300);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3));
		
		information = new JTextField("Press one button from below");
		output = new JTextField(20);
		rock = new JButton("Rock");
		paper = new JButton("Paper");
		scissor = new JButton("Scissor");
		
		rock.addActionListener(this);
		paper.addActionListener(this);
		scissor.addActionListener(this);
		panel.add(rock); panel.add(paper); panel.add(scissor);
		
		add(information, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		add(output, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	public static void main(String[] ar)
	{
		RockPaperScissor gui = new RockPaperScissor();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Random random = new Random();
		int computer = random.nextInt(3);
		
		if(e.getSource() == rock) {
			if(computer == SCISSOR)
				output.setText("User wins!");
			else if (computer == ROCK)
				output.setText("Tie");
			else
				output.setText("User losses!");
		}
		if(e.getSource() == scissor) {
			if(computer == PAPER)
				output.setText("User wins!");
			else if (computer == SCISSOR)
				output.setText("Tie");
			else
				output.setText("User losses!");
		}
		if(e.getSource() == paper) {
			if(computer == ROCK)
				output.setText("User wins!");
			else if (computer == PAPER)
				output.setText("Tie");
			else
				output.setText("User losses!");
		}
	}

}
