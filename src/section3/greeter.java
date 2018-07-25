package section3;

import javax.swing.JOptionPane;

public class greeter {
	public static void main(String[] args) {
	String s = JOptionPane.showInputDialog("What's your name?");
	System.out.println("Hello " + s);
	//JOptionPane.showMessageDialog(null, "Hello " + s, 0);
	
	}
}
