package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	Robot lol = new Robot();

	void go() {
		lol.setSpeed(999999999);
		lol.setRandomPenColor();
		lol.setPenWidth(5);
		lol.penDown();
		for(int i = 0; i<4; i++){
			lol.move(100);
			lol.turn(90);
			}
		lol.turn(270);
		drawSquare();
	}
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! your mum gay!");
		lol.setRandomPenColor();
		for(int i = 0; i<4; i++){
			lol.move(100);
			lol.turn(90);
		}
		lol.turn(270);
		lol.setRandomPenColor();
		for(int i = 0; i<4; i++){
			lol.move(100);
			lol.turn(90);
		}
		lol.turn(270);
		lol.setRandomPenColor();
		for(int i = 0; i<4; i++){
			lol.move(100);
			lol.turn(90);
		}
		lol.turn(270);
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
