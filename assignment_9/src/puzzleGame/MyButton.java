package puzzleGame;
import javax.swing.*;

public class MyButton extends JButton{
	static int count = 0;
	int index;
	public MyButton(String s)
	{
		super(s);
		index = count++;
	}
}
