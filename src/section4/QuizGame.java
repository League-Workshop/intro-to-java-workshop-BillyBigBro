package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int playerScore = 0;
		// 2. Ask the user a question
		String a = JOptionPane
				.showInputDialog("In Counter-Strike Global Offensive's competitive gamemode, it is best out of __");
		// 3. Use an if statement to check if their answer is correct
		if (a.equals("30")) {
			playerScore += 1;
			JOptionPane.showMessageDialog(null, "You now have 1 more point than before!");
		} else {
			playerScore -= 1;
			JOptionPane.showMessageDialog(null, "You now have lost a point");
		}
		// 4. if the user's answer is correct
		String b = JOptionPane.showInputDialog("In Counter-Strike Global Offensive's casual gamemode, it is best out of _");
		// -- add one to their score
		if (b.equals("8")) {
			playerScore += 1;
			JOptionPane.showMessageDialog(null, "You now have 1 more point than before!");
		} else {
			playerScore -= 1;
			JOptionPane.showMessageDialog(null, "Ygdwkmgbigbbgwhty52h∑¬;hgowegohutwuou now have lost a point");
		}
			// 5. Create more questions by repeating steps 1, 2, and 3 below.
		String c = JOptionPane.showInputDialog("What is the best rifle in Counter-Strike Global Offensive");
			if (c.equals("AK-47")) {
				playerScore += 1;
				JOptionPane.showMessageDialog(null, "You now have 1 more point than before!");
			}
			else {
				playerScore -= 1;
				JOptionPane.showMessageDialog(null, "You now have lost a point");
			}
			// 6. After all the questions have been asked, print the user's score
				JOptionPane.showMessageDialog(null, "You ended the quiz with " + playerScore + ".");
			}
			
		}

	
