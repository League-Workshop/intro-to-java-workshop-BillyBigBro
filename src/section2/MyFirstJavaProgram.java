package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {
		Robot lol = new Robot();
		lol.setSpeed(500);
		lol.move(100);
		lol.penDown();
		for (int i = 0; i < 4; i++) {
        lol.setSpeed(500);
        lol.turn(90);
        lol.move(100);
		
			
			
			
			
			
			
		}
	}
}
