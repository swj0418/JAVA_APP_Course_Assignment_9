package keyEventExample;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class KeyEventTest extends JFrame implements KeyListener{
	private JPanel panel;
	private JTextField field;
	private JTextArea area;
	public KeyEventTest() {
		panel = new JPanel(new GridLayout(0, 2));
		panel.add(new JLabel("Input a text : "));
		field = new JTextField(10);
		panel.add(field);
		area = new JTextArea(3, 30);
		add(panel, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);
		field.addKeyListener(this);
		setTitle("KeyEvent Test");
		setSize(400, 1000);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] ar0) {
		new KeyEventTest();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		display(e, "Key Pressed");
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		display(e, "Key Released");
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		display(e, "Key Typed");
		
	}
	
	protected void display(KeyEvent e, String s) {
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		String modifiers = "Alt : " + e.isAltDown() + "Ctrl : " + e.isControlDown() + "Shift : " + e.isShiftDown();
		area.append("" + s + "문자 " + c + "(코드 : " + keyCode + " ) " + modifiers + "\n");
	}
}
